package vip.dreamaker.kktest.sort;


import com.alibaba.fastjson.JSON;
import java.util.Random;

/**
 * @author kaituo
 * @date 2019/12/7 16:57
 */
public class Sort {

  private int getMaxValue(Integer[] arr) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length - 1; i++) {
      max = Math.max(arr[i], arr[i + 1]);
    }
    return max;
  }

  public static void main(String[] args) {
    int elementNum = 1000;
    int[] arr1 = new int[elementNum];
    int[] arr2 = new int[elementNum];
    Random random = new Random();
    for (int i = 0; i < elementNum; i++) {
      int anInt = random.nextInt(elementNum);
      arr1[i] = anInt;
      arr2[i] = anInt;
    }
    System.out.println("sourceArr:::" + JSON.toJSONString(arr1) + System.lineSeparator());
//    int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    long ts1 = System.currentTimeMillis();
    int[] arr1s = bubbleSort(arr1);
    long ts2 = System.currentTimeMillis();
    System.out.println(
        "bubbleSort:::" + JSON.toJSONString(arr1s) + System.lineSeparator() +
            "cost:" + (ts2 - ts1) + System.lineSeparator() +
            "compareTime:" + bubbleSortCompareTime + System.lineSeparator());

    long ts3 = System.currentTimeMillis();
    int[] arr2s = quickSort(arr2, 0, arr2.length - 1);
    long ts4 = System.currentTimeMillis();
    System.out.println(
        "quickSort:::" + JSON.toJSONString(arr2s) + System.lineSeparator() +
            "cost:" + (ts4 - ts3) + System.lineSeparator() +
            "compareTime:" + cquickSortCompareTime + System.lineSeparator());
  }

  private static int bubbleSortCompareTime = 0;

  /**
   * 冒泡排序，从小到大排序
   */
  public static int[] bubbleSort(int[] arr) {

    // isLoop用于指示依次遍历中是否发生元素交换，若没有，则已是有序数列，退出即可
    boolean isLoop = true;
    for (int i = arr.length - 1; isLoop && i >= 0; i--) {
      isLoop = false;
      for (int j = 0; j < i; j++) {
        if (arr[j] > arr[j + 1]) {
          int tmp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = tmp;
          isLoop = true;
        }
        bubbleSortCompareTime++;
      }
    }
    return arr;
  }

  private static int cquickSortCompareTime = 0;

  /**
   * 快速排序
   */
  public static int[] quickSort(int[] arr, int low, int high) {
    if (low >= high - 1) {
      // 数组为空或者仅有一个元素则退出
      return arr;
    }
    int start = low;
    int end = high;
    int key = arr[low];
    while (start < end) {
      while (start < end && key <= arr[end]) {
        cquickSortCompareTime++;
        end--;
      }
      if (key >= arr[end]) {
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
      }
      cquickSortCompareTime++;
      while (start < end && key >= arr[start]) {
        cquickSortCompareTime++;
        start++;
      }
      if (key <= arr[start]) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
      }
      cquickSortCompareTime++;
    }

    if (start > low) {
      quickSort(arr, low, start - 1);
    }
    if (end < high) {
      quickSort(arr, end + 1, high);
    }
    return arr;
  }
}
