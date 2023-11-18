package com.management.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.user.entity.UserEntity;
import com.management.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/create")
	public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity user) {

		return service.saveUser(user);

	}

	@GetMapping("/all")
	public ResponseEntity<List<UserEntity>> fetchAllUser() {

		return service.getAlllUser();

	}
	
	@GetMapping("/{Id}")
public ResponseEntity<UserEntity> fetchByUserId(@PathVariable String Id){
		
		return service.getUserById(Id);
		
	}
}
