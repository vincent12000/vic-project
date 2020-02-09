package com.vic.starter.demo.controller;

import com.vic.starter.demo.entity.Hello;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class demoController {

    @GetMapping("/hello")
    public Hello starterDemo() {
        return new Hello("hello from com.vic.starter.demo");
    }

    @GetMapping("/hello-user")
    public Hello starterDemo(@RequestParam("userName") String userName) {
        return new Hello("hello "+ userName);
    }
}
