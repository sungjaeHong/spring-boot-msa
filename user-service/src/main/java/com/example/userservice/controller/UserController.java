package com.example.userservice.controller;

import com.example.userservice.controller.dto.CreateUserRequest;
import com.example.userservice.service.UserService;
import com.example.userservice.service.vo.CreateUserVo;
import com.example.userservice.service.vo.UserVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by peter on 2023/01/25
 */
@Slf4j
@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class UserController {
    private final ModelMapper modelMapper;
    private final UserService userService;
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

    @PostMapping("/users")
    public UserVo createUser(@RequestBody CreateUserRequest request) {
        CreateUserVo createRequest = modelMapper.map(request, CreateUserVo.class);
        UserVo userVo = userService.createUser(createRequest);
        return userVo;
    }
}
