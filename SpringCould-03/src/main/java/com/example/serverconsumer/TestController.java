package com.example.serverconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhoudb
 * @date 2019/12/23 16:59
 */
@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

   /* @GetMapping("/info")
    public String getInfo() {
        return this.restTemplate.getForEntity("http://Server-Provider/info",
        String.class).getBody();
    }*/
    @GetMapping("/info")
    public String postInfo() {

        return this.restTemplate.postForEntity("http://Server-Provider/info",
                null,String.class).getBody();
    }
}
