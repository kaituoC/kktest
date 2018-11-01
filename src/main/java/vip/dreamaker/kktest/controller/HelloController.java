package vip.dreamaker.kktest.controller;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author kaituo
 * @date 2018-09-13
 */
@RestController
@RequestMapping(value = "kktest")
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject hello(String name) {
        JSONObject result = new JSONObject();
        if (name == null) {
            name = "name is null!";
        }
        result.put("hello", name);
        try {
            InetAddress addr = InetAddress.getLocalHost();
            result.put("host", addr.getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        result.put("ts", System.currentTimeMillis());
        logger.info("result:{}", result);
        return result;
    }
}
