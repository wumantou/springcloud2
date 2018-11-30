package com.wuweiliang.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    @Value("${foo}")
    private String foo;

    @GetMapping("/foo")
    public String foo() {
        return "foo is :" + foo;
    }
}
