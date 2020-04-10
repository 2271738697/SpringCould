package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoudb
 * @date 2019/12/23 16:59
 */
@RestController

public class TestController {

    @PostMapping("/info")
    public String info() {
        return "hello,hhh";
    }
    @GetMapping("/info2")
    public String info2() {
        return "hello2";
    }
}
