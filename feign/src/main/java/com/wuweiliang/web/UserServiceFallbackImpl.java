package com.wuweiliang.web;

import org.springframework.stereotype.Component;

@Component
public class UserServiceFallbackImpl implements UserService {
    @Override
    public String hello(String name) {
        return "sorry," + name + ",this request error from feign!";
    }
}
