package com.wuweiliang.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Value("${server.port}")
    private String port;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name) {
        String userinfo = restTemplate.getForObject("http://127.0.0.1:8771/userinfo?name=" + name, String.class);
        return "hi," + name + ", my port is " + port + ",your info is:" + userinfo;
    }
}
