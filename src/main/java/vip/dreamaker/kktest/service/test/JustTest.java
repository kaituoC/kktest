package vip.dreamaker.kktest.service.test;

import com.alibaba.fastjson.JSON;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;

/**
 * @author kaituo
 * @date 2019-07-10 14:15:12
 */
public class JustTest {

  public static void main(String[] args) {
//    test1();
//    test2();
    test3();
    test4();
  }

  private static void test4() {
    List<String> list = new LinkedList<>();
    list.add("");
    list.add("");
//    list.add("*");
    List<String> list1 = list.stream().filter(StringUtils::isNotBlank)
        .collect(Collectors.toList());
    System.out.println("list==[" + String.join(",", list) + "]");
    System.out.println("list1==[" + String.join(",", list1) + "]");
  }

  private static void test3() {
    System.out.println(Long.MAX_VALUE + "|||" + Long.MIN_VALUE);
  }

  private static void test2() {
//    String tmp = " 10.240.0.1, 10.240.0.2 ,10.240.0.3 ,10.240.0.4, 10.240.0.5";
//    String[] split = tmp.split(",");
    String tmp = "完成这些任务的人，没有一个后悔的^做什么任务赚钱最多，亿刻官方总结清单，点击查看>>^不会赚钱？完成这些任务，赚走今天90%的钱>>^日赚50和日赚5万的区别，完成以下任务就知道了，点我>>";
    String[] split = tmp.split("\\^");
    List<String> list = new LinkedList<>();
    for (String s : split) {
      String trim = s.trim();
      list.add(trim);
    }
    System.out.println(JSON.toJSONString(list));
    System.out.println(String.join("^", list));
  }

  private static void test1() {
    List<String> ipList = new LinkedList<>();
    String mediaIpStr = "10.240.0.1,10.240.0.2,10.240.0.3,10.240.0.4,10.240.0.5";
    if (mediaIpStr.contains(",")) {
      String[] split = mediaIpStr.split(",");
      ipList.addAll(Arrays.asList(split));
    } else {
      ipList.add(mediaIpStr);
    }
    System.out.println(ipList);
    ipList.forEach(System.out::println);
  }

}
