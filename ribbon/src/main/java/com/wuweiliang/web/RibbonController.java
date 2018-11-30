package com.wuweiliang.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name) {
        return userService.hello(name);
    }
}
