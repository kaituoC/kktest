package vip.dreamaker.kktest.weight;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kaituo
 * @date 2019/12/9 19:45
 */
public class WeightRandom {

  public static void main(String[] args) {
    List<Element> list = Lists.newArrayList(new Element("a", 3), new Element("b", 3),
        new Element("c", 2), new Element("d", 2));

    int num1 = 5;
    int num2 = 100000;
    for (int j = 0; j < num1; j++) {

      Map<String, Integer> map = new HashMap<>(8);
      for (int i = 0; i < num2; i++) {
        Element element = randomGetByWeight(list);
        Integer integer = map.get(element.getName());
        if (integer == null) {
          integer = 0;
        }
        integer++;
        map.put(element.getName(), integer);
      }
      System.out.println(JSON.toJSONString(map));
    }
    System.out.println("--------------------------------");
    List<String> list1 = Lists.newArrayList("a", "a", "a", "b", "b", "b", "c", "c", "d", "d");
    int size = list1.size();
    for (int j = 0; j < num1; j++) {

      Map<String, Integer> map = new HashMap<>(8);
      for (int i = 0; i < num2; i++) {
        Random random = new Random();
        String e = list1.get(random.nextInt(size));
        Integer integer = map.get(e);
        if (integer == null) {
          integer = 0;
        }
        integer++;
        map.put(e, integer);
      }
      System.out.println(JSON.toJSONString(map));
    }
  }

  private static Element randomGetByWeight(List<Element> list) {
    Element res = null;
    Integer weightSum = 0;
    for (Element e : list) {
      weightSum += e.getWeight();
    }

    if (weightSum <= 0) {
      System.out.println("Error: weightSum=" + weightSum);
      return null;
    }
    Random random = new Random();
    int index = random.nextInt(weightSum);
    int m = 0;
    for (Element e : list) {
      if (m <= index && index < (m + e.getWeight())) {
        res = e;
        break;
      }
      m += e.getWeight();
    }
    return res;
  }

  @Data
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Element {

    private String name;
    private Integer weight;
  }

}
