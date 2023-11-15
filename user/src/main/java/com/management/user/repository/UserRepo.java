package com.management.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.user.entity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, String> {

}
