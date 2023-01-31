package com.example.userservice.controller.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;

/**
 * Created by peter on 2023/01/26
 */
@Getter
public class CreateUserRequest {
    @NotBlank(message = "Email cannot be empty")
    @Size(min = 5, message = "Email not be less than 5 characters")
    private String email;

    @NotBlank(message = "Password cannot be empty")
    @Size(min = 8, max = 16, message = "Password must be equal or greater than 8 characters and less than 16 characters")
    private String password;

    @NotBlank(message = "Name cannot be empty")
    @Size(min = 2, message = "Name not be less than 2 characters")
    private String name;
}
