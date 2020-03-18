package vip.dreamaker.kktest.offer;

import java.util.Arrays;

/**
 * 数组中存有1-3的三种数字,例如[1,2,3,1,2,2,1,3,3]，将其排序为[1,1,1,2,2,2,3,3,3]，要求时间复杂度，后续将内容变为一个对象，继续排序
 *
 * @author kaituo
 * @date 2020/3/18 08:37
 */
public class Test1 {

  public static void main(String[] args) {
    int[] source = {1, 2, 3, 1, 2, 2, 1, 3, 3};
    // 只有 1、2、3三种数字，可以用数组下标0、1、2、3表示1、2、3数字出现的次数
    int[] countArr = {0, 0, 0};
    for (int x : source) {
      countArr[x - 1] += 1;
    }

    System.out.println(Arrays.toString(countArr));
    int[] result = new int[source.length];
    int index = 0;
    for (int i = 0; i < countArr.length; i++) {
      for (int num = 0; num < countArr[i]; num++) {
        result[index++] = i + 1;
      }
    }
    System.out.println(Arrays.toString(result));
  }
}
