package com.example.secondservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by peter on 2023/01/14
 */
@RestController
@RequestMapping("/second-service")
public class SecondController {
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the SecondService";
    }
}
