package vip.dreamaker.kktest.thread;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by chang on 2019/12/8.
 */
public class Test {

    public static void main(String[] args) {
        //                  0  1  2  3  4  5  6  7  8  9
        int[] a = new int[]{4, 5, 6, 7, 8, 9, 0, 1, 2, 3};
//        int index = getIndex(a, 2);
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int index = getIndexNew(a, i);
            System.out.println("element=" + i + ";index=" + index);
        }
        ArrayList<Integer> list = new ArrayList<>();
//        list.retainAll()
    }

    public static int getIndex(int[] a, int e) {
        int length = a.length;
        if (length == 0) {
            return -1;
        }
        int head = a[0];
        if (e >= head) {
            for (int i = 0; i < length; i++) {
                if (e == a[i]) {
                    return i;
                }
                if (a[i] < head) {
                    return -1;
                }
            }
        } else {
            for (int i = length - 1; i >= 0; i--) {
                if (e == a[i]) {
                    return i;
                }
                if (a[i] > head) {
                    return -1;
                }
            }
        }
        return -1;
    }


    public static int getIndexNew(int[] a, int e) {
        int length = a.length;
        if (length == 0) {
            return -1;
        }
        int head = a[0];
        if (e == head) {
            return 0;
        }
        int start = 0;
        int end = length - 1;
        int mid = (start + end) / 2;
        if (e > head) {
            while (start < end) {
                while (a[mid] < head) {
                    end = mid;
                    mid = (start + end) / 2;
                }
                if (e == a[mid]) {
                    return mid;
                } else if (e > a[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
                mid = (start + end) / 2;
                if (e == a[mid]) {
                    return mid;
                }
            }
        } else {
            while (start < end) {
                while (a[mid] > head) {
                    start = mid;
                    mid = (start + end) / 2;
                }
                if (e == a[mid]) {
                    return mid;
                } else if (e > a[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
                mid = (start + end) / 2;
                if (e == a[mid]) {
                    return mid;
                }
            }
        }
        return -1;
    }
}
