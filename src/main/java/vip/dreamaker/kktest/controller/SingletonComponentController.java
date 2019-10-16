package vip.dreamaker.kktest.controller;

import com.alibaba.fastjson.JSONObject;
import java.net.InetAddress;
import java.net.UnknownHostException;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import vip.dreamaker.kktest.cache.SingletonComponentCache;

/**
 * @author kaituo
 * @date 2018-09-13
 */
@Slf4j
@RestController
@RequestMapping(value = "kktest")
public class SingletonComponentController {

  @Autowired
  private SingletonComponentCache cache;

  @RequestMapping(value = "/test/singleton", method = RequestMethod.GET)
  @ResponseBody
  public JSONObject singletonTest(String name) {
    JSONObject result = new JSONObject();
    cache.put("ckt", "kaituo");
    result.put("ckt1", cache.get("ckt"));
    try {
      SingletonComponentCache singletonComponentCache = new SingletonComponentCache();
      String value = singletonComponentCache.get("ckt");
      result.put("ckt2", value);
    } catch (Exception e) {
      result.put("error", e.toString());
      log.error("", e);
    }
    result.put("ckt3", cache.get("ckt"));

    log.info("result:{}", result);
    return result;
  }
}
