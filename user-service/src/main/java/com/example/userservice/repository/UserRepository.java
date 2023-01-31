package com.example.userservice.repository;

import com.example.userservice.repository.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by peter on 2023/01/26
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
