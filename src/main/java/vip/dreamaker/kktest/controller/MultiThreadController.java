package vip.dreamaker.kktest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import vip.dreamaker.kktest.service.MultiThreadService;

/**
 * Created by chang on 2019/4/21.
 */
@Slf4j
@RequestMapping(value = "kktest")
@RestController
public class MultiThreadController {

    @Autowired
    private MultiThreadService multiThreadService;

    @RequestMapping(value = "/callable/test", method = RequestMethod.GET)
    @ResponseBody
    public String callableTest() {
        return multiThreadService.multiCallableTest().toJSONString();
    }
}
