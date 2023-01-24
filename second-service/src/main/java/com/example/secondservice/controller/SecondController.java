package com.example.secondservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by peter on 2023/01/14
 */
@Slf4j
@RestController
@RequestMapping("/second-service")
public class SecondController {
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the SecondService";
    }
    @GetMapping("/message")
    public String message(@RequestHeader("second-request") String header) {
        log.info("header : {}", header);
        return "Hello World in Second Service";
    }

    @GetMapping("/check")
    public String check() {
        return "Hi, this is second service check method";
    }
}
