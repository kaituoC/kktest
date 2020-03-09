package vip.dreamaker.kktest.thread;

import com.alibaba.fastjson.JSON;

/**
 * Created by chang on 2019/12/8.
 */
public class Sort {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(JSON.toJSON(arr));
        System.out.println("----------------------------------------------------");
        int[] arr1 = new int[]{3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        System.out.println("0\t" + JSON.toJSON(arr1));
        quickSortNew(arr1, 0, arr1.length - 1);
        System.out.println(JSON.toJSON(arr1));
        System.out.println("----------------------------------------------------");

        int[] arr2 = new int[]{3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        myQuitSort(arr2, 0, arr.length - 1);
        System.out.println(JSON.toJSON(arr2));

    }

    public static void myQuitSort(int[] a, int low, int high) {
        int start = low;
        int end = high;
        int key = a[low];
        System.out.println("low=" + low + ";high=" + high + ";start=" + start + ";end=" + end + ";key=" + key);
        while (start < end) {
            while (start < end && a[end] >= key) {
                end--;
            }
            if (a[end] <= key) {
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }
            while (start < end && a[start] <= key) {
                start++;
            }
            if (a[start] >= key) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        }
        System.out.println("low=" + low + ";high=" + high + "start=" + start + ";end=" + end + ";key=" + key + System.lineSeparator() + "arr=" + JSON.toJSONString(a));
        if (low < start) {
            myQuitSort(a, low, start - 1);
        }
        if (end < high) {
            myQuitSort(a, end + 1, high);
        }
    }

    public static void quickSortNew(int[] arr, int low, int high) {
        int start = low;
        int end = high;
        int key = arr[start];

        while (end > start) {
            while (end > start && arr[end] >= key) {
                end--;
            }
            if (arr[end] <= key) {
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
            }
            System.out.println("1\t" + JSON.toJSON(arr));
            while (end > start && arr[start] <= key) {
                start++;
            }
            if (arr[start] >= key) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
            System.out.println("2\t" + JSON.toJSON(arr));
        }
        if (start > low) {
            quickSortNew(arr, low, start - 1);
        }
        System.out.println("3\t" + JSON.toJSON(arr));
        if (end < high) {
            quickSortNew(arr, end + 1, high);
        }
        System.out.println("4\t" + JSON.toJSON(arr));
    }


    /**
     * 快速排序方法
     *
     * @param array
     * @param start
     * @param end
     * @return
     */
    public static int[] quickSort(int[] array, int start, int end) {
        if (array.length < 1 || start < 0 || end >= array.length || start > end) return null;
        int smallIndex = partition(array, start, end);
        if (smallIndex > start)
            quickSort(array, start, smallIndex - 1);
        if (smallIndex < end)
            quickSort(array, smallIndex + 1, end);
        return array;
    }

    /**
     * 快速排序算法——partition
     *
     * @param array
     * @param start
     * @param end
     * @return
     */
    public static int partition(int[] array, int start, int end) {
        int pivot = (int) (start + Math.random() * (end - start + 1));
//        int pivot = start;
        int smallIndex = start - 1;
        swap(array, pivot, end);
        for (int i = start; i <= end; i++)
            if (array[i] <= array[end]) {
                smallIndex++;
                if (i > smallIndex)
                    swap(array, i, smallIndex);
            }
        return smallIndex;
    }

    /**
     * 交换数组内两个元素
     *
     * @param array
     * @param i
     * @param j
     */
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
