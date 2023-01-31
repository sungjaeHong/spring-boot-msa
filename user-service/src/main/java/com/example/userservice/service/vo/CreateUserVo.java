package com.example.userservice.service.vo;

import lombok.Builder;
import lombok.Getter;

/**
 * Created by peter on 2023/01/26
 */
@Getter
@Builder
public class CreateUserVo {
    private String email;
    private String password;
    private String name;
}
