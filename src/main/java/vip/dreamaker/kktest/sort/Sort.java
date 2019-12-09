package vip.dreamaker.kktest.sort;


import com.alibaba.fastjson.JSON;

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
    int[] arr = new int[]{9, 3, 5, 8, 0, 7, 2, 4, 6, 1};
//    int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    System.out.println(JSON.toJSONString(bubbleSort(arr)));
  }

  /**
   * 冒泡排序，从小到大排序
   */
  public static int[] bubbleSort(int[] arr) {
    int compareTime = 0;
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
        compareTime++;
      }
    }
    System.out.println("compareTime=" + compareTime);
    return arr;
  }

  /**
   * 快速排序
   */
  public void quickSort(Integer[] arr, int bgn, int end) {
    if (bgn >= end - 1) {
      // 数组为空或者仅有一个元素则退出
      return;
    }

  }
}
