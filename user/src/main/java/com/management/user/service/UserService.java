package com.management.user.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.management.user.entity.UserEntity;

public interface UserService {

	

	ResponseEntity<UserEntity>  saveUser(UserEntity user);
	
	ResponseEntity<List<UserEntity>>  getAlllUser();
	
	ResponseEntity<UserEntity> getUserById(String userId);
	
	
	
	
}
