package com.example.firstservice.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by peter on 2023/01/14
 */
@Slf4j
@RestController
@RequestMapping("/first-service")
public class FirstController {
    private final Environment environment;

    public FirstController(final Environment environment) {
        this.environment = environment;
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the FirstService";
    }

    @GetMapping("/message")
    public String message(@RequestHeader("first-request") String header) {
        log.info("header : {}", header);
        return "Hello World in First Service";
    }

    @GetMapping("/check")
    public String check(HttpServletRequest request) {
        log.info("Server PORT : {}", request.getServerPort());
        return """
                Hi, this is a message from First Service on PORT : %s 
                """.formatted(environment.getProperty("local.server.port"));
    }
}
