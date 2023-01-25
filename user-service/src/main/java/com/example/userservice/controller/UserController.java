package com.example.userservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by peter on 2023/01/25
 */
@Slf4j
@RestController
@RequestMapping("/")
public class UserController {
    @Value("${greeting.message}")
    private String greetingMessage;
    @GetMapping("health_check")
    public String status() {
        return "It's Working in User Service";
    }

    @GetMapping
    public String welcome() {
        return greetingMessage;
    }
}
