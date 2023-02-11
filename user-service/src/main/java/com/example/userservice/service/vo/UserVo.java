package com.example.userservice.service.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

/**
 * Created by peter on 2023/01/26
 */

@Getter
@Setter
@NoArgsConstructor
public class UserVo {
    private String email;
    private String password;
    private String encryptedPassword;
    private String name;
    private String userId;
    private ZonedDateTime createdAt;
}
