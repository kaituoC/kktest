package vip.dreamaker.kktest.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Description:
 * User: kaituo
 * Date: 2018-08-29
 * Time: 11:25
 */
@RestController
@RequestMapping(value = "kktest")
public class TestController {
    @RequestMapping(value = "/test")
    public String test(HttpServletRequest request, @RequestBody String inputStream) {
        String data = request.getParameter("data");
        System.out.println("parameter data = " + data);
//        String inputStream = "";
//        try {
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(request.getInputStream()));
//            inputStream = bufferedReader.lines().collect(Collectors.joining(System.lineSeparator()));
//        } catch (Exception e) {
//            System.out.println("ERROR: " + e.getMessage());
//        }
        System.out.println("inputStream = " + inputStream);
        String result = data + " ; " + inputStream;
        System.out.println(result);
        return result;
    }
}
