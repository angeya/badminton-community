package top.angeya.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: angeya
 * @Date: 2023/9/17 19:19
 * @Description:
 */
@RequestMapping("demo")
@RestController
public class DemoController {


    @GetMapping("demo")
    public String demo() {
        return "OK";
    }

}
