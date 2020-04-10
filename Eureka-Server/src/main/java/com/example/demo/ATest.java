package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoudb
 * @date 2019/12/23 16:59
 */
@RestController
public class ATest {
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

}
