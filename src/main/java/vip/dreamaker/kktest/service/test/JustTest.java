package vip.dreamaker.kktest.service.test;

import com.alibaba.fastjson.JSON;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.Lists;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.StringJoiner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import vip.dreamaker.kktest.entry.vo.AdIdReqKey;
import vip.dreamaker.kktest.entry.vo.TestVO;

/**
 * @author kaituo
 * @date 2019-07-10 14:15:12
 */
public class JustTest {

  public static void main(String[] args) throws Exception {
//    test29();
    System.out.println(new Date(-1).toString());
    test29();
    Object o = new Object();
    o.notify();

//    String s = "http://test.api.musfa.com:8080/callback?channelid=10018&media=__MEDIA__&imei=__IMEI__&ip=__IP__&model=__MODEL__&macAddress=__MACADDRESS__&network=__NETWORK__&apiLevel=__APILEVEL__&osid=__OSID__&imsi=__IMSI__&mcc=__MCC__&mno=__MNO__&dpi=__DPI__&bssid=__BSSID__&infoLa=__INFOLA__&infoCi=__INFOCI__&resolution=__RESOLUTION__&ovr=__OVR__&report=finishDown&ext=1eA%2BhgE1strjthstxRkH81UjESy2HhWscLYaHbK%2FCM5JDQZ1Y%2FmDLtgV6dbL2CR6qkmzToF0R6DJRZ%2Bx1kM%2FS%2FO6p7CulXDqnZk2vcTshsx%2FyHwNIaGpxQsXaOgFahqvzyM83w2IHIkvwrCGaV0sSxdRYY6IxzeEB%2BPwoOc9CTCKHObIHaDJzNAugH79hYdXCwmaRWQ%2FWIiDvNVb5dNChZIcbFCQvDkkolcrMt%2BqG9ZLnlZ6RuwXE%2Bv344%2FoMi5u&mt=vxBSz6%2Br7f8BJeztqtuQR7R%2B9ZhndBek7Z7wCtvcOeAD7FEucuPXslTjrbk%2F7q055Hz2bJzDc%2FKNfJ0%2FgGwcdkLNlpuWtTP9igzh8OuFui53b9EhXx3Ou1p3z9T%2BNucJw9u12p4AM0R7LAlHtk%2B3IYiAHD6Nmruc175Xvr47M%2B1pKVFOsxCw98Yo%2BpDH4YtO%2BELbuUtmokNdZTHHrVyrdxom534oU456Mq8KQ3IgrNNJdxsgvrlRMaZm1skzA6gMrgzdbRwui7dCWI4ut8HJchXawpU6wM24yYZkHmShfPolJ8pVhX3OFjVVKftWIwBfRp4eOvjDXLYo%2FuCIQLLaInjSvGcNI%2FYb3gXx5KZITYbyu5xFru32jrpFzt%2BjSYdQHw1nB0tMLclOcsJeFJsgyG1l%2FSzp3rtZvK8Fzdxwwwr%2B8asApRtnIN1BEbLkhOBjhxlsfynd8npMnI7s%2FdAwUD6vpl4O%2B08NgwSYdJjQlvK2KxOic1PXxQ6GoILWsp69GX9%2FpI4gADsZV5OIs33cxq6ni0xTlb5SIzd%2Fsxo%2F4PMHXmzaoSzyDIFC9QE8nM7Xpa1Oao1cUJxoLxeyUw2sdhZQj5Y2jlBeM%2B%2BvyRyauizEAv4x8y6Wj14si3zdjt7nlHr4dGjqNUlYAL%2FiAzApHs9yD2Qe7kxdToUATyfw%2FI4IDSah8hE55JeM0LLbM6FTbk%2BGl2WoclEZI%2BPfUtessBJ8UMl6On9efLLOxN8aOWX1IucLtpMbCAnnt3O8gq7lzthJ1fe6ZupeEyx4vZVaskEgwBpdFNNhdgV%2B6CLKk0R63K%2FrQDbL5eQ%2BDztGaQ3qLhNgVYls68WIgzZx5QKou8o4lM5o%2F0goPAPhwR%2Byz1%2F0x4W6qQeNnGGI5JYo9Bz9gVYpP%2FyYfv3HyXV3x6CLe9HcXAMXZcti5bxnqaFGd%2BxkQvmndq9uLdKZGI3GUvTBiLmzod4WNZy1tL82wy1J9Q%3D%3D_e44b9e8808d942888722b053ac92bdd7";
//    String s1 = test15(s);
//    System.out.println(s + System.lineSeparator() + s1);

//    Method method = Class.forName("").getMethod("", String.class);
//    method.invoke(null, "a");

    int a = 3 | 5;
    System.out.println(a);
  }

  private static void test32() {
    ok:
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        System.out.println("i=" + i + ",j=" + j);
        if (j == 5) {
          break ok;
        }

      }
    }
    System.out.println("over");
  }

  private static void test31() {
    List<String> res = new LinkedList<>();
    res.add("a");
    res.add("aa");
    res.add("aaa");
    res.add("aaaa");
    res.add("1a");

    List<String> list = new LinkedList<>();
    list.add("a");
    list.add("aa");
    list.add("aaa");
    list.add("aaaa");
    list.add("b");
    list.add("bb");
    list.add("bbb");
    list.add("bbbb");
    list.add("1a");
    list.add("2b");
    boolean status = true;
    for (int i = 0; i < 10000; i++) {
      List<String> collect = list.stream().filter(x -> StringUtils.containsAny("1aaaa", x))
          .collect(Collectors.toList());
      if (collect.size() != 5) {
        System.out.println("size != 5;  " + JSON.toJSONString(collect));
        status = false;
        break;
      }

      for (int j = 0; j < 5; j++) {
        if (!res.get(j).equals(collect.get(j))) {
          System.out.println("order not right; " + JSON.toJSONString(collect));
          status = false;
          break;
        }
      }
      if (!status) {
        break;
      }
    }
    System.out.println("over,status:" + status);
  }

  private static void test30() {
//    String a = "aaaa_bbb_ccc_ddd";
    String a = "aaaa_bbb_ccc";
    String[] split = a.split("_");
    String adid = split[1];

    if (split.length > 2) {
      StringJoiner sj = new StringJoiner("_");
      for (int i = 1; i < split.length - 1; i++) {
        sj.add(split[i]);
      }
      adid = sj.toString();
    }

    System.out.println("adid:" + adid);
  }

  private static void test29() {
    for (int i = 0; i < 800; i++) {
//      String str = String.valueOf(365000 + i);
//      String pattern = "365[125](0[1-9]|[1-4][0-9]|50)";
      String str = String.valueOf(363000 + i);
      String pattern = "363[257](0[1-9]|[1-4][0-9]|50)";

      Pattern r = Pattern.compile(pattern);
      Matcher m = r.matcher(str);
      boolean matches = m.matches();
      if (matches) {
        System.out.println(str + "===" + matches);
      }
    }
  }

  private static void test28() {
    String a = "";
    String b = "b";
    System.out.println(StringUtils.contains(a, b));
  }

  private static void test27() {
    String reqKey = null;
    String adId = "aa";
    String dspCode = " aaa ";
    StringJoiner sj = new StringJoiner("--");
    sj.add(StringUtils.trimToEmpty(reqKey))
        .add(StringUtils.trimToEmpty(adId))
        .add(StringUtils.defaultString(StringUtils.trim(dspCode)));
    System.out.println(sj.toString());

  }

  private static void test26() {
    String url = "http://h5.tianlan.online/download?ip=127.0.0.1&ua=useragent&rid=__rid__&aid=__aid__&dp=__dp__&uid=__uid__";
    String newUrl = url.replace("__rid__", "rid123")
        .replace("__aid__", "aid123")
        .replace("__dp__", "dp123")
        .replace("__uid__", "uid123");
    System.out.println(newUrl);
  }

  private static void test25() {
    double weight = 2;
    double upperCtr = 0.45D;
    double onemin = 0.3612D;
    double fivemin = 0.3862D;
    double scoreOne = onemin / upperCtr;
    double scoreOne1 = updateWeight(scoreOne);
    double scoreFive = fivemin / upperCtr;
    double scoreFive1 = updateWeight(scoreFive);
    double score = ((scoreOne + scoreFive) * upperCtr * weight) / 2;
    double score1 = ((scoreOne1 + scoreFive1) * upperCtr * weight) / 2;
    System.out.println("scoreOne:" + scoreOne + "\tscoreFive:" + scoreFive + "\tscore:" + score
        + System.lineSeparator()
        + "scoreOne1:" + scoreOne1 + "\tscoreFive1:" + scoreFive1 + "\tscore1:" + score1);
    for (int i = 0; i < 20; i++) {
      System.out.println(RandomUtils.nextFloat(0, 1) < score1);
    }

//        for (double i = 0.0; i < 1.9; i += 0.01) {
//            double v = updateWeight(i);
//            System.out.println("i=" + i + "\tv=" + v);
//        }
  }

  private static double updateWeight(double score) {
    if (score > 1.08) {
      score = 2 - Math.min(score, 1.5D);
    } else if (score < 0.92) {
      score = 2 - Math.max(0.6D, score);
    }
    return score;
  }

  private static void test24() {
    System.out.println(Math.abs(-1 % 5));
    System.out.println(Math.abs(-3 % 5));
    System.out.println(Math.abs(-5 % 5));
    System.out.println(Math.abs(-6 % 5));
  }

  private static void test23() {
    Integer numa = new Integer(2561);
    Integer numb = new Integer(2563);
    int a = numb;
    swatch(numa, numb);
    System.out.println("numa:" + numa + ", numb:" + numb);
  }

  private static Integer numa = new Integer(2560);
  private static Integer numb = new Integer(2562);

  private static void swatch(Integer a, Integer b) {
    Integer tmp = a;
    a = b;
    b = tmp;
  }

  private static void test22() {
    for (int i = 0; i < 100; i++) {
      increment(numb);
    }
    System.out.println(numb);
  }

  private static void increment(Integer num) {
    num = num + new Integer(1);
  }

  private static Cache<String, AtomicLong> session = CacheBuilder.newBuilder()
      .maximumSize(5000)
      .concurrencyLevel(100)
      .expireAfterAccess(60, TimeUnit.SECONDS)
      .initialCapacity(100)
      .build();

  private static void test21() {

    int interval = 2000;
    long current = System.currentTimeMillis();
    String key = "a";
    AtomicLong ts = null;
    try {
      ts = session.get(key, () -> new AtomicLong(System.currentTimeMillis()));
    } catch (ExecutionException e) {
      e.printStackTrace();
    }
    assert ts != null;
    long cts = ts.updateAndGet(x -> ((current - x) > interval) ? current : x);
    System.out.println("cts:\t" + cts + System.lineSeparator() + "cur:\t" + current);
    if (current > cts) {
      System.out.println("skip:\t The ad bit has been freq");
    }
  }

  private static void test20() {
    List<Integer> list = Lists.newArrayList(1, 2, 5, 10, 15, 20, 30);
    List<String> collect = list.stream().filter(x -> x > 5).map(x -> {
      if (x < 10) {
        return "a";
      } else if (x < 20) {
        return "b";
      } else if (x < 30) {
        return "c";
      }
      return "d";
    }).collect(Collectors.toList());

    System.out
        .println(JSON.toJSONString(list) + System.lineSeparator() + JSON.toJSONString(collect));
  }

  private static void test19() throws Exception {
    int upperLimit = 100;
    int current = 59;
    float percent = ((float) (upperLimit - current)) / upperLimit;
    float percent1 = (upperLimit - current) / upperLimit;
    System.out.println(percent + System.lineSeparator() + percent1);
    throw new Exception("exceptin");
  }

  private static void test18() {
    String ip = "10.240.2.1";
    String ipC = ip.substring(0, ip.lastIndexOf(".") + 1);
    System.out.println(ipC);
  }

  private static void test17() {
    List<TestVO> list = new LinkedList<>();
    List<TestVO> result = new LinkedList<>();
    for (int i = 0; i < 8; i++) {
      String strValue = String.valueOf(i);
      list.add(new TestVO(strValue, i, strValue));
    }
    System.out.printf("list:%s" + System.lineSeparator(), JSON.toJSONString(list));
    int reqNum = 3;
    int size = list.size();
    if (size > reqNum) {
      TestVO testVO = list.get(0);
      List<TestVO> emptyList = list.subList(reqNum, size);
      mixAd(testVO, emptyList);
      testVO.setName("mix");
      result.addAll(list.subList(0, reqNum));
    } else {
      result.addAll(list);
    }
    System.out.printf("result:%s", JSON.toJSONString(result));
  }

  private static void mixAd(TestVO testVO, List<TestVO> emptyList) {
    for (TestVO vo : emptyList) {
      testVO.setAddr(testVO.getAddr() + "," + vo.getAddr());
    }
  }

  private static void test16() throws InterruptedException {
    System.out.println(Thread.currentThread().getName() + " sleep start");
    TimeUnit.SECONDS.sleep(5);

    System.out.println(Thread.currentThread().getName() + " sleep over");
    InnerClassTest instance = InnerClassTest.getInstance();
    System.out.println(Thread.currentThread().getName() + " get instance over");
  }

  private static String test15(String url) {
    return url.replace("__MEDIA__", "packageName")
        .replace("__IMEI__", "imei")
        .replace("__IP__", "ip")
        .replace("__MACADDRESS__", "mac")
        .replace("__NETWORK__", "未知")
        .replace("__MODEL__", "deviceVersion")
        .replace("__APILEVEL__", "apiLevel")
        .replace("__OSID__", "androidId")
//        .replace("__IMSI__", "imsi")
        .replace("__IMSI__", StringUtils.defaultString(null))
        .replace("__RESOLUTION__", "heigh_width")
        .replace("__OVR__", "osVersion");
  }

  private static int test14(String verCode) {
    int result = 0;
    if (StringUtils.isNotBlank(verCode)) {
      String[] split = verCode.split("[.]");
      StringBuilder sb = new StringBuilder();
      for (String str : split) {
        sb.append(str);
      }
      String resStr = sb.toString();
      if (NumberUtils.isCreatable(resStr)) {
//        result = NumberUtils.createInteger(resStr);// 字符串：0210 会转成 整型：136
        result = Integer.parseInt(resStr);
      }
    }
    return result;
  }

  private static void test13() {
//    String adCreateTime = "2019-10-18 20:29:02";
    String adCreateTime = "201910-18 20:29:02";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    LocalDateTime localDateTime = LocalDateTime.parse(adCreateTime, formatter);
    long cloneTs = localDateTime.toInstant(ZoneOffset.of("+8")).toEpochMilli();
    System.out.println(cloneTs);
  }

  private static void test12() {
    List<Long> list = new LinkedList<>();
    list.add(100L);
    list.add(200L);
    list.add(300L);
    Long[] array = new Long[list.size()];
    Long[] longs = list.toArray(array);
    System.out.println("list:" + list + "\narray:" + Arrays.toString(longs));
  }

  private static void test11() {
    String str = "{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey \":\"100271000004 \"}";
    String str1 = "{\"code\":\"youdao\",\"name\":\"有道\",\"androidAids\":{\"BIG_IMAGE\":[],\"INC_VIDEO\":[{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey \":\"100271000004 \"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100471000005\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100271000063\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100471000015\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100541000003\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100561000001\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100271000061\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100471000003\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100521000000\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100541000015\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"001071000002\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100551000013\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"001051000069\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100361000008\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100551000003\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100551000002\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100541000015\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100421000009\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100561000000\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100271000062\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100381000001\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100471000002\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100261000004\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"001051000070\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"001050000001\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100271000059\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100571000002\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"001050000006\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100271000064\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100271000004\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100421000011\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100471000005\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100541000003\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100361000009\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100231000000\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100551000003\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100531000012\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100491000005\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100531000013\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"001051000068\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100571000003\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100411000000\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100491000005\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100571000003\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100361000010\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100581000003\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"001070000001\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100471000014\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100491000017\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"001051000067\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100581000002\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100361000010\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100581000002\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100491000017\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100361000008\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100471000002\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100261000004\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100421000011\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100581000003\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100421000012\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100471000014\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100561000001\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100551000012\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100471000002\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100261000004\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100471000014\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100521000008\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"001051000068\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100491000004\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100421000007\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100471000005\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100541000004\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100361000008\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"001051000068\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100571000002\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100531000013\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100491000016\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100271000064\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100531000003\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100551000002\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100521000008\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"001071000002\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100361000009\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100551000003\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100571000012\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"001070000001\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100471000005\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100271000061\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100541000015\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100571000012\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100361000008\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100471000004\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100381000003\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100361000006\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"001070000007\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100541000015\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100541000003\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100551000012\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100491000005\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100421000008\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100491000006\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100361000011\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100581000012\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100421000012\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"001050000001\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100361000010\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100571000002\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100491000017\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100381000002\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100361000007\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100381000002\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"001051000067\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100271000063\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100531000003\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100581000013\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100411000000\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100571000013\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100421000008\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100581000002\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100471000004\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100271000059\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"001050000005\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100491000017\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100531000003\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100491000003\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"001050000005\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"001050000005\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100521000008\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100491000005\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100531000003\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100411000000\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100581000012\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"001050000005\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100421000008\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100361000010\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100271000063\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100541000005\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100421000010\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"001050000001\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100271000063\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"001070000001\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100551000003\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"001031000000\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100491000016\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100271000063\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"001051000069\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100261000004\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100471000002\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"001070000001\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100531000003\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"001020000003\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100541000005\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100361000011\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100471000015\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100421000012\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100361000009\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100421000010\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100271000063\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100491000006\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100541000005\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100551000002\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100421000009\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100361000008\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100541000014\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100271000060\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100541000014\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100491000016\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"001070000007\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100541000004\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"001050000006\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100521000000\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100531000003\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100411000000\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100231000000\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"001050000005\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100381000002\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"001050000001\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100361000007\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100581000012\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100271000060\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100471000003\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100571000012\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100531000012\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100381000003\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100581000002\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100361000007\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100541000014\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100541000003\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100231000000\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100571000002\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100361000006\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100491000005\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100271000004\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"001051000067\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100421000008\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100361000007\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100271000060\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100261000004\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100271000004\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100551000013\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100491000004\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100471000002\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"001050000006\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100521000000\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100421000007\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100491000004\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100471000015\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100491000006\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100421000010\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100381000001\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100491000006\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100521000000\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100271000060\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100231000000\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"001050000006\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"001051000070\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100421000007\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100551000012\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100541000004\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100491000016\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"001031000000\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100471000005\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100271000064\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100541000014\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100541000004\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100421000011\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"001051000070\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100381000001\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100361000006\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100381000003\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"001051000068\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100471000004\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100541000004\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100471000014\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100541000002\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100581000003\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100271000064\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100571000003\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100521000000\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100531000002\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100531000012\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100571000013\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100491000016\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100361000011\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100271000004\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100271000062\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"001051000069\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100421000009\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"001050000006\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100471000005\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100271000060\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100381000003\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100421000009\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100361000006\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100271000064\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100581000013\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100541000014\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100421000011\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100491000006\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100421000012\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"001050000005\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100361000011\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"001070000001\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100381000003\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100581000013\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100271000064\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"001050000006\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100551000013\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100411000000\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100381000001\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100571000002\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"001051000070\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100531000013\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100471000015\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100531000013\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"001051000069\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100361000009\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100491000007\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100581000013\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100421000007\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100361000006\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100381000003\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100491000017\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100491000005\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100491000003\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100421000011\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100361000010\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100361000009\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100581000012\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100471000004\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100571000013\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100561000000\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100531000003\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100271000059\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100551000002\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100551000013\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100541000004\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100491000007\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100561000000\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100541000002\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100571000012\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100271000062\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100471000003\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"001050000001\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100561000001\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100491000003\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100541000014\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100471000003\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100381000002\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100471000015\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100361000006\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100571000013\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100271000063\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100571000013\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100421000009\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100471000004\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"001051000069\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100531000002\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100561000000\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100411000000\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100421000010\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100531000013\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100421000010\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100471000005\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100421000012\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"001020000003\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100531000013\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"001051000067\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100551000013\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100271000061\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100551000003\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100361000009\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"001051000067\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100581000003\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100551000013\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100491000007\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100531000013\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100421000012\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100381000002\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100541000003\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100421000008\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100541000005\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100491000003\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"001051000069\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100571000003\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100471000015\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100271000004\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"001070000001\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100271000059\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100541000015\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"001050000005\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100271000061\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100471000002\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100471000003\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100571000012\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"001070000007\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100261000004\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100491000003\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"001050000001\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100561000000\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100271000059\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100271000061\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"001051000068\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100491000007\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100411000000\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100551000013\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100421000008\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100581000003\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100471000014\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"001031000000\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100581000012\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100571000003\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100541000005\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100551000003\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"001050000001\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100491000017\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100271000061\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100491000005\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100491000007\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100581000002\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100361000010\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100491000003\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100271000059\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"001070000007\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100421000008\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100231000000\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"001070000007\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100271000061\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100361000007\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100521000008\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100541000003\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100381000002\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100571000002\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100491000004\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100531000002\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100421000010\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100541000015\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"001070000001\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100521000008\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100581000013\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100581000003\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100361000008\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100361000009\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100471000003\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100381000003\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100551000012\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100491000006\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"001051000067\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100471000014\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100421000012\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100571000012\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100551000012\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100531000002\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100491000004\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"001031000000\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100561000001\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100571000003\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100541000002\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100571000013\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"001051000068\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100581000002\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"001050000006\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100581000012\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100421000009\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100381000002\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100361000011\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100471000004\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"001020000003\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100541000002\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100491000017\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100571000003\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100231000000\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100541000005\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"001051000070\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"001031000000\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100491000007\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100541000002\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100271000062\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100381000001\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100551000002\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100551000002\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100581000012\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100531000012\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100561000000\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100361000007\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100531000002\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"001070000007\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100541000002\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100581000003\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"001031000000\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100541000015\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100271000060\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"001070000007\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100421000010\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100541000003\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100421000011\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"001051000067\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100571000012\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"001051000069\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100551000003\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100471000004\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100361000010\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100271000059\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100521000000\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100541000005\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100471000015\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"001071000002\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100271000062\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100471000014\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100421000007\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100361000006\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100491000016\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100491000004\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100581000002\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100491000007\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100581000013\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100551000012\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100361000011\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100471000003\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100361000011\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100581000013\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100381000001\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100521000008\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100361000007\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100231000000\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100531000002\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100531000012\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100491000003\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100561000001\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100561000001\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100571000013\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100531000012\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"001051000068\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100361000008\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100531000012\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100381000001\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100421000011\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100541000014\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100271000062\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100531000002\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100551000012\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100541000004\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100551000002\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100271000064\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"001051000070\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100421000007\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100491000006\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100271000004\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100571000002\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100491000004\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100491000016\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100521000000\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100471000002\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100261000004\"},{\"adId\":\"43176d7c7cde3313e560b399996ce271\",\"reqKey\":\"100271000060\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100541000002\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100421000007\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"001051000070\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100271000062\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100651000003\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100651000003\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100651000003\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100651000003\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100651000003\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100651000003\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100651000004\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100651000004\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100651000004\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100651000004\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100651000004\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100651000004\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100651000005\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100651000005\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100651000005\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100651000005\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100651000005\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100651000005\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100651000006\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100651000006\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100651000006\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100651000006\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100651000006\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100651000006\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100651000015\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100651000015\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100651000015\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100651000015\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100651000015\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100651000015\"},{\"adId\":\"602608de1c08ec2800ebe23ce6fc344c\",\"reqKey\":\"100651000016\"},{\"adId\":\"eee3ad4821e832c3147d10e7b1eb666c\",\"reqKey\":\"100651000016\"},{\"adId\":\"2ed09dc9206615146fd13c9c47a2e0e1\",\"reqKey\":\"100651000016\"},{\"adId\":\"9a4000cd5d14b157dd65849b85d00288\",\"reqKey\":\"100651000016\"},{\"adId\":\"14394e51dbfab07d1c7bdc2310313113\",\"reqKey\":\"100651000016\"},{\"adId\":\"29c7e9896c3b02a4fa038469eac2e089\",\"reqKey\":\"100651000016\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"001031000000\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"001050000001\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"001050000005\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"001050000006\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"001051000067\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"001051000068\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"001051000069\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"001051000070\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100231000000\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100261000004\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100271000004\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100271000059\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100271000060\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100271000061\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100271000062\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100271000063\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100271000064\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100361000006\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100361000007\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100361000008\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100361000009\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100361000010\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100361000011\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100381000001\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100381000002\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100381000003\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100411000000\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100421000007\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100421000008\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100421000009\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100421000010\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100421000011\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100421000012\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100471000002\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100471000003\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100471000004\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100471000005\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100471000014\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100471000015\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100491000003\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100491000004\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100491000005\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100491000006\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100491000007\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100491000016\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100491000017\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100521000000\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100521000008\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100531000002\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100531000003\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100531000012\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100531000013\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100541000002\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100541000003\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100541000004\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100541000005\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100541000014\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100541000015\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100551000002\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100551000003\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100551000012\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100551000013\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100561000000\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100561000001\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100571000002\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100571000003\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100571000012\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100571000013\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100581000002\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100581000003\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100581000012\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100581000013\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100651000003\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100651000004\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100651000005\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100651000006\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100651000015\"},{\"adId\":\"7429f2e8c3ec0bbf82135b863b803dfe\",\"reqKey\":\"100651000016\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"001031000000\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"001050000001\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"001050000005\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"001050000006\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"001051000067\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"001051000068\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"001051000069\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"001051000070\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100231000000\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100261000004\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100271000004\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100271000059\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100271000060\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100271000061\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100271000062\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100271000063\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100271000064\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100361000006\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100361000007\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100361000008\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100361000009\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100361000010\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100361000011\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100381000001\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100381000002\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100381000003\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100411000000\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100421000007\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100421000008\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100421000009\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100421000010\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100421000011\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100421000012\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100471000002\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100471000003\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100471000004\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100471000005\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100471000014\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100471000015\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100491000003\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100491000004\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100491000005\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100491000006\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100491000007\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100491000016\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100491000017\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100521000000\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100521000008\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100531000002\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100531000003\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100531000012\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100531000013\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100541000002\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100541000003\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100541000004\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100541000005\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100541000014\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100541000015\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100551000002\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100551000003\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100551000012\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100551000013\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100561000000\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100561000001\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100571000002\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100571000003\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100571000012\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100571000013\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100581000002\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100581000003\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100581000012\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100581000013\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100651000003\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100651000004\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100651000005\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100651000006\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100651000015\"},{\"adId\":\"145b14628aff5589b26d92beba3e5afb\",\"reqKey\":\"100651000016\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"001031000000\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"001050000001\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"001050000005\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"001050000006\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"001051000067\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"001051000068\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"001051000069\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"001051000070\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100231000000\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100261000004\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100271000004\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100271000059\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100271000060\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100271000061\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100271000062\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100271000063\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100271000064\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100361000006\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100361000007\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100361000008\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100361000009\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100361000010\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100361000011\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100381000001\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100381000002\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100381000003\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100411000000\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100421000007\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100421000008\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100421000009\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100421000010\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100421000011\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100421000012\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100471000002\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100471000003\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100471000004\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100471000005\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100471000014\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100471000015\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100491000003\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100491000004\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100491000005\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100491000006\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100491000007\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100491000016\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100491000017\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100521000000\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100521000008\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100531000002\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100531000003\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100531000012\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100531000013\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100541000002\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100541000003\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100541000004\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100541000005\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100541000014\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100541000015\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100551000002\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100551000003\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100551000012\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100551000013\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100561000000\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100561000001\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100571000002\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100571000003\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100571000012\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100571000013\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100581000002\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100581000003\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100581000012\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100581000013\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100651000003\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100651000004\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100651000005\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100651000006\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100651000015\"},{\"adId\":\"dcbd14978163ef08e6d4368e472d69eb\",\"reqKey\":\"100651000016\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"001031000000\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"001050000001\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"001050000005\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"001050000006\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"001051000067\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"001051000068\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"001051000069\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"001051000070\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100231000000\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100261000004\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100271000004\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100271000059\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100271000060\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100271000061\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100271000062\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100271000063\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100271000064\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100361000006\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100361000007\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100361000008\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100361000009\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100361000010\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100361000011\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100381000001\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100381000002\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100381000003\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100411000000\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100421000007\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100421000008\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100421000009\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100421000010\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100421000011\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100421000012\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100471000002\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100471000003\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100471000004\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100471000005\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100471000014\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100471000015\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100491000003\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100491000004\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100491000005\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100491000006\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100491000007\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100491000016\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100491000017\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100521000000\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100521000008\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100531000002\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100531000003\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100531000012\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100531000013\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100541000002\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100541000003\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100541000004\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100541000005\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100541000014\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100541000015\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100551000002\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100551000003\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100551000012\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100551000013\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100561000000\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100561000001\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100571000002\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100571000003\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100571000012\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100571000013\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100581000002\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100581000003\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100581000012\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100581000013\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100651000003\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100651000004\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100651000005\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100651000006\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100651000015\"},{\"adId\":\"d3ba15aeadd87f7884feb488c8651b07\",\"reqKey\":\"100651000016\"}],\"VIDEO\":[{\"adId\":\"a6f9c50ef64c46684760f16bf1c549bf\",\"reqKey\":\"001060000001\"}]},\"iosAids\":{\"SMALL_IMAGE\":[],\"BIG_IMAGE\":[],\"INC_VIDEO\":[{\"adId\":\"a411726d4806ea4acb4ea9c994d15ab1\",\"reqKey\":\"001071000007\"},{\"adId\":\"a411726d4806ea4acb4ea9c994d15ab1\",\"reqKey\":\"001071000006\"}],\"MULTI_IMAGE\":[]}}";
    AdIdReqKey adIdReqKey = JSON.parseObject(str, AdIdReqKey.class);
    System.out.println("adIdReqKey:" + JSON.toJSONString(adIdReqKey));
  }

  public static final String MACRO_TIMESTAMP = "___TIMESTAMP___";
  public static final String MACRO_TIME_SECOND = "___TIME_SECOND___";
  public static final String MACRO_CLICK_UP_TS = "___CLICK_UP_TS___";

  private static void test10() {
    String url = "aaaa=__TIMESTAMP__&bbbb=__C_UP_TIME__&cccc=__AA__";
    String tmpUrl = url.replace("__TIMESTAMP__", MACRO_TIMESTAMP);
    tmpUrl = tmpUrl.replace("__C_UP_TIME__", MACRO_CLICK_UP_TS);
    System.out.println("url=\t\t" + url + "\ntmpUrl=\t" + tmpUrl);
  }

  private static void test9() {
    String ua = "a b c b d e f g yike";

    ua = ua.replace("yike", "").trim();

    System.out.println(ua);

  }

  private static void test8() {
    String str0 = "aa.bb,aa.cc,aa.dd,aaabb";
    String str1 = "aa.cc,aa.dd,aaabb";
    String str2 = "aa.bb";
    System.out.println("str0.contains=" + str0.contains(str2) + System.lineSeparator()
        + "str1.contains=" + str1.contains(str2));
  }

  private static void test7() {
    String MINIP_SEPARATOR = "\\^";
    String sourceStr = "http://minip.qknode.com^wx85b4efd610bf7ff4^wxecc87cf2df8bc908^gh_56ffb1119e2e^/?channel=yike_desktop_pop";
    String[] split = sourceStr.split(MINIP_SEPARATOR);
    System.out.println(split.length);

  }

  private static void test6() {
    System.out.println(
        "<!Doctype html><html><head><meta charset=\"utf-8\"><meta id=\"viewport\" name=\"viewport\" content=\"width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no\"><meta name=\"msapplication-tap-highlight\" content=\"no\"><meta name=\"apple-mobile-web-app-capable\" content=\"yes\"><meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\"><title>endCard</title><style>*{margin:0;padding:0;box-sizing:border-box}html{width:100%;height:100%;font-size:18px}body{width:100%;height:100%;background-color:#fff}#container{position:relative;width:100%;height:100%}#imgWrapper{position:absolute;top:0;left:0;width:100%;height:50%;background-image:url(http://static1.pezy.cn/img/2019-08-12/1400118532967420778.jpg);background-repeat:no-repeat;background-size:contain;}#contentWrapper{position:absolute;top:50%;left:0;width:100%;height:50%;overflow:hidden}#contentMain{position:absolute;left:50%;top:50%;width:80%;-webkit-transform: translate(-50%, -50%);transform:translate(-50%,-50%)}#content{line-height:1.5}#btn{margin:40px 0 0;width:100%;height:36px;background-color:#2196f3;border-radius:5px;color:#fff;text-align:center;line-height:36px;font-weight:700;letter-spacing:.2em;vertical-align:middle}#btn>a{display:block;width:100%;height:100%;text-decoration:none;color:#fff}</style></head><body><a href=\"http://tools.download.pezy.cn/app/tools/download/306001\"><div id=\"container\"><div id=\"imgWrapper\"></div><div id=\"contentWrapper\"><div id=\"contentMain\"><div id=\"content\">闪电优化大师：10个手机9个烫，该给手机降降温了...</div><div id=\"btn\">立即下载</div></div></div></div></a><script>function t(t){return document.getElementById(t)}function e(t,e){var y,a,g=n.split(\":\"),h=window.innerWidth,c=window.innerHeight,x=Math.min(h,c),d=x===c;if(d?(a=x,y=a*(g[0]-0)/(g[1]-0)):(y=x,a=y*(g[1]-0)/(g[0]-0)),i.style.width=y+\"px\",i.style.height=a+\"px\",Math.max(h,c)>600&&(o.style.height=\"40px\",o.style.lineHeight=\"40px\"),d)s.style.left=y+\"px\",s.style.top=0,s.style.width=h-y+\"px\",s.style.height=c+\"px\",r.style.fontSize=\"inherit\",o.style.marginTop=\"\",18!==l&&(l=18,r.style.fontSize=l+\"px\"),.66*(h-y)>p*l?(r.style.letterSpacing=\".2em\",r.style.textAlign=\"center\"):(r.style.letterSpacing=\"\",r.style.textAlign=\"\");else{s.style.left=0,s.style.top=a+\"px\",s.style.width=h+\"px\",s.style.height=c-a+\"px\";var f=.8*h,m=Math.floor(f/15);16>m&&(m=16),m>20&&(m=20),l=m,r.style.fontSize=l+\"px\";var u=p*l;.8*f>u?(r.style.letterSpacing=\".2em\",r.style.textAlign=\"center\"):f>u?(r.style.letterSpacing=\"\",r.style.textAlign=\"center\"):(r.style.letterSpacing=\"\",r.style.textAlign=\"left\",200>=c-a&&(o.style.marginTop=\"30px\"))}setTimeout(function(){s.style.display=\"block\",s.style.transform=\"translate3d(0, 0, 10px)\",s.style.transition=\"transform 1s ease\"},16)}document.addEventListener(\"touchmove\",function(t){t.preventDefault(),t.stopPropagation()},!1);var n=\"1:1\",l=18,i=t(\"imgWrapper\"),s=t(\"contentWrapper\"),r=t(\"content\"),o=t(\"btn\"),p=function(t){for(var e=0,n=0;n<t.length;n++)e+=t.charCodeAt(n)<256?.5:1;return e}(r.innerHTML);e(),window.addEventListener(\"resize\",e,!1);</script></body></html>");
  }


  public static final String REDIRECT_URL_PREFIX = "http://ssp.qknode.com/hd/";
  public static final int REDIRECT_URL_PREFIX_LEN = REDIRECT_URL_PREFIX.length();

  private static void test5() {
    String url1 = "http://ssp.qknode.com/hd/010010000040";
    String url2 = "http://ssp.qknode.com/hd010010000040";
    String redirectId1 = "";
    if (url1.startsWith(REDIRECT_URL_PREFIX)) {
      redirectId1 = url1.substring(REDIRECT_URL_PREFIX_LEN);
    }
    System.out.println("url1 redirectId1=" + redirectId1);

    String redirectId2 = "";
    if (url2.startsWith(REDIRECT_URL_PREFIX)) {
      redirectId2 = url1.substring(REDIRECT_URL_PREFIX_LEN);
    }
    System.out.println("url2 redirectId2=" + redirectId2);
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
