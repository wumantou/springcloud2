package com.wuweiliang.web;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi", fallback = UserServiceFallbackImpl.class)
public interface UserService {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);
}
