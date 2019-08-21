package vip.dreamaker.kktest.controller;

import com.alibaba.fastjson.JSONObject;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vip.dreamaker.kktest.ecxception.MyException;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import vip.dreamaker.kktest.entry.vo.TestVO;
import vip.dreamaker.kktest.service.test.TestService;

/**
 * Description:
 * User: kaituo
 * Date: 2018-08-29
 * Time: 11:25
 */
@Slf4j
@RestController
@RequestMapping(value = "kktest")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/test")
//    public String test(HttpServletRequest request, @RequestBody String inputStream) {
//    public String test(HttpServletRequest request, String data, @RequestBody String inputStream) {
    /**
     * @RequestBody String inputStream 这个inputStream 和 request.getInputStream() 是同一个inputStream，其中一个读取数据后，另外一个则无法读取数据。
     */
    public String test(HttpServletRequest request, String data) {
        String data1 = request.getParameter("data");
        System.out.println(data1 + ":" + data);
//        String inputStream = "";
//        try {
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(request.getInputStream()));
//            inputStream = bufferedReader.lines().collect(Collectors.joining(System.lineSeparator()));
//        } catch (Exception e) {
//            System.out.println("ERROR: " + e.getMessage());
//        }
        String inputStream = "";
//        System.out.println("inputStream = " + inputStream);
//        String result = data + " ; " + inputStream;
//        System.out.println(result);
//        return result;
        String inputStream1 = "";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
            inputStream1 = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data1 + ":" + data + ":" + inputStream + ":" + inputStream1;
    }

    @RequestMapping("/json")
    public String json() throws MyException {
        throw new MyException("发生错误2");
    }

    @RequestMapping("/test/obj")
    public String objTest() throws MyException {
        return testService.objTest();
    }

    /**
     * 请求参数中，如果有多个参数，会把对应参数名的参数值传递给接收请求的方法中定义的参数和对象中的属性。参数和对象属性参数名一致，则入参的值会传递给参数和对象的属性。
     * @param guid
     * @param userName
     * @param testVO
     * @return
     */
    @PostMapping(value = "/test/multi/args")
    public String multiArgsTest(String guid, String userName, TestVO testVO) {
        JSONObject result = new JSONObject();
        result.put("guid", guid);
        result.put("name", userName);
        result.put("testVO", testVO);
        log.info("[{}]", result.toJSONString());
        return result.toJSONString();
    }

    @RequestMapping("/foo")
    void handleFoo(HttpServletResponse response) throws IOException {
        response.sendRedirect("http://www.baidu.com");
//        response.setStatus(302);
    }
}
