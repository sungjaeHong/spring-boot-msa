package com.example.userservice.service.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by peter on 2023/01/26
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserVo {
    private String email;
    private String password;
    private String name;
}
