package vip.dreamaker.kktest.test.boss;

import com.alibaba.fastjson.JSON;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

/**
 * <p>Copyright (C) 2017-2019 THL A29 Limited, a Qknode company. All rights reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at</p>
 *
 * <p>https://opensource.org/licenses/Apache-2.0</p>
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.</p>
 *
 * @Auther: kaituo
 * @Date: 2020/3/1 23:34
 * @Description:
 */
public class Test2 {

  public static void main(String[] args) {
    List<Integer> primeNumber = getPrimeNumber();
    System.out.println(JSON.toJSONString(primeNumber));
    BigDecimal result = new BigDecimal(0);
    for (int i = 0; i < primeNumber.size(); i++) {
      result = result.add(doFactorial(primeNumber.get(i)));
    }
    System.out.println("result=" + result);
  }

  private static List<Integer> getPrimeNumber() {
    List<Integer> list = new LinkedList<>();
    for (int i = 2; i <= 100; i++) {
      boolean flag = true;
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          flag = false;
          break;
        }
      }
      if (flag) {
        list.add(i);
      }
    }
    return list;
  }

  private static BigDecimal doFactorial(int n) {
    BigDecimal result = new BigDecimal(1);
    for (int i = 1; i <= n; i++) {
      result = result.multiply(new BigDecimal(i));
    }
    return result;
  }
}
