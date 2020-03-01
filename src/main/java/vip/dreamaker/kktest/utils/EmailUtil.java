package vip.dreamaker.kktest.utils;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.ning.http.client.AsyncHttpClient;
import com.ning.http.client.Response;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author kaituo
 * @date 2019/11/1 17:25
 */
@Slf4j
public class EmailUtil {

  private static final String EMAIL_URL = "http://sd008:8086/mail/table";

  /**
   * curl -XPOST -d 'to=data@qknode.com&subject=测试数据&content={"header":["h1","h2","h3"],"records":[["L11","L12","L13"],["L21","L22","L23"],["L31","L32","L33"]],"title":"ceshi"}'
   * http://sd008:8086/mail/table
   */
  public static String sendEmail(String toUser, String subject, EmailEntry emailEntry) {
    String result = "";
    AsyncHttpClient client = HttpClient.getClient();
    try {
      Map<String, List<String>> params = new HashMap<>(8);
      params.put("to", Lists.newArrayList(toUser));
      params.put("subject", Lists.newArrayList(subject));
      params.put("content", Lists.newArrayList(JSON.toJSONString(emailEntry)));
      Response response = client.preparePost(EMAIL_URL)
          .setFormParams(params)
          .setRequestTimeout(5000)
          .execute()
          .get(5000, TimeUnit.MILLISECONDS);
      return response.getResponseBody(StandardCharsets.UTF_8.name());
    } catch (InterruptedException e) {
      log.error("InterruptedException:", e);
    } catch (ExecutionException e) {
      log.error("ExecutionException:", e);
    } catch (TimeoutException e) {
      log.error("TimeoutException:", e);
    } catch (IOException e) {
      log.error("IOException:", e);
    }
    return result;
  }

  @Data
  public static class EmailEntry {

    private List<String> header;
    private List<List<String>> records;
    private String title;

  }
}
