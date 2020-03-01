package vip.dreamaker.kktest.service.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ning.http.client.AsyncHttpClient;
import com.ning.http.client.Response;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import vip.dreamaker.kktest.test.RedisClient;
import vip.dreamaker.kktest.utils.EmailUtil;
import vip.dreamaker.kktest.utils.EmailUtil.EmailEntry;
import vip.dreamaker.kktest.utils.HttpClient;

/**
 * @author kaituo
 * @date 2019-06-12 22:11
 */
@Slf4j
@Service
public class TestService {

  public String objTest() {
    RedisClient redisClient = new RedisClient();
    return redisClient.logInfo();
  }

  public static void main(String[] args) {
    String s = sendEmail();
    System.out.println("result=" + s);
    System.out.println("over");
//    String str = "{\"ip\":\"223.65.151.247\",\"os\":\"android\",\"rt\":\"s\",\"ua\":\"Mozilla/5.0(Linux;Android8.1.0;RedmiNote5Build/OPM1.171019.011;wv)AppleWebKit/537.36(KHTML,likeGecko)Version/4.0Chrome/66.0.3359.126MQQBrowser/6.2TBS/044705MobileSafari/537.36\",\"lat\":\"32.218781\",\"lon\":\"32.218781\",\"mac\":\"94:87:E0:65:CD:DF\",\"conn\":\"1\",\"imei\":\"99001203577244\",\"limit\":1,\"token\":\"8fb8v5vy0G4y349iCBNMX\",\"appName\":\"红包新闻\",\"carrier\":\"2\",\"verCode\":\"2.5.1\",\"originUa\":\"Dalvik/2.1.0(Linux;U;Android8.1.0;RedmiNote5MIUI/V10.3.4.0CNXM)\",\"packName\":\"com.maiku.news\",\"androidid\":\"99001203577244\",\"osVersion\":\"8.1.0\",\"timeStamp\":1560412811677,\"screenWidth\":\"1080\",\"deviceVendor\":\"xiaomi\",\"screenHeight\":\"2030\",\"deviceVersion\":\"RedmiNote5\",\"requestIdPrefix\":\"100191000001\",\"requestId\":\"1001910000011560412811677\",\"auth\":\"8249AF0860D6E2D065CBA427BAD3D5A3\"}";
//    byte[] body = str.getBytes();
//    BidRequest request = JSON.parseObject(body, 0, body.length, Charset.forName("utf-8"), BidRequest.class);
//    System.out.println(JSON.toJSONString(request));
//
//    String str1 = "{\"a\":\"aa\",\"b\":\"bb\",\"c\":\"cc\",\"d\":\"dd\"}";
//    Map<String, String> map = JSON.parseObject(str1, Map.class);
//    System.out.println(map);
  }

  /**
   * curl -XPOST -d 'to=data@qknode.com&subject=测试数据&content={"header":["h1","h2","h3"],"records":[["L11","L12","L13"],["L21","L22","L23"],["L31","L32","L33"]],"title":"ceshi"}' http://sd008:8086/mail/table
   *
   */
  public static String sendEmail() {
    EmailEntry emailEntry = new EmailEntry();
    List<String> header = new LinkedList<>();
    header.add("h1");
    header.add("h2");
    header.add("h3");
    emailEntry.setHeader(header);
    List<List<String>> records = new LinkedList<>();
    emailEntry.setRecords(records);
    List<String> data1 = new LinkedList<>();
    data1.add("11");
    data1.add("12");
    data1.add("13");
    records.add(data1);
    List<String> data2 = new LinkedList<>();
    data2.add("21");
    data2.add("22");
    data2.add("23");
    records.add(data2);
    List<String> data3 = new LinkedList<>();
    data3.add("31");
    data3.add("32");
    data3.add("33");
    records.add(data3);
    emailEntry.setTitle("ceshiTitle");
    return EmailUtil.sendEmail("changkaituo@qknode.com", "ceshi", emailEntry);
  }
}
