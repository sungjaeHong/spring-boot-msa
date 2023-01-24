package com.example.firstservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by peter on 2023/01/14
 */
@RestController
@RequestMapping("/first-service")
public class FirstController {
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the FirstService";
    }
}
