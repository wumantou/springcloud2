package com.wuweiliang.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {

    @GetMapping("/userinfo")
    public String userinfo(@RequestParam("name") String name) {
        return name + "is smart!";
    }
}
