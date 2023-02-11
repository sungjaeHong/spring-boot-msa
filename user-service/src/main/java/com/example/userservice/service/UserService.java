package com.example.userservice.service;

import com.example.userservice.repository.entity.UserEntity;
import com.example.userservice.repository.UserRepository;
import com.example.userservice.service.vo.CreateUserVo;
import com.example.userservice.service.vo.UserVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by peter on 2023/01/26
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {
    private final ModelMapper modelMapper;
    private final UserRepository userRepository;
    public UserVo createUser(CreateUserVo createUserVo) {
        // vo 가 null임....
        UserEntity user = modelMapper.map(createUserVo, UserEntity.class);
        user.setUserId(UUID.randomUUID().toString());
        user.setEncryptedPassword("encrypted_password");
        userRepository.save(user);

        return modelMapper.map(user, UserVo.class);
    }
}
