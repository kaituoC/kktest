package vip.dreamaker.kktest.controller;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "kktest")
public class SameRequestController {

  @RequestMapping(value = "/app/{appCode}/name")
  public String getName(@PathVariable String appCode) {
    JSONObject jo = new JSONObject();
    jo.put("appCode", appCode);
    jo.put("url", "kktest/app/{appCode}/name");
    return jo.toJSONString();
  }

  @RequestMapping(value = "/app/aaa/name")
  public String getName() {
    return "kktest/app/aaa/name";
  }

}
