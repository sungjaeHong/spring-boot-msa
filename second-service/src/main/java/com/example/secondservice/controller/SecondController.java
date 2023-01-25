package com.example.secondservice.controller;

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
@RequestMapping("/second-service")
public class SecondController {
    private final Environment environment;

    public SecondController(final Environment environment) {
        this.environment = environment;
    }

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
    public String check(HttpServletRequest request) {
        log.info("Server PORT : {}", request.getServerPort());
        return """
                Hi, this is a message from Second Service on PORT : %s 
                """.formatted(environment.getProperty("local.server.port"));
    }
}
