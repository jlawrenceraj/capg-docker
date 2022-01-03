package com.mphasis.fedex.userinfo.controller;

import com.mphasis.fedex.userinfo.model.User;
import com.mphasis.fedex.userinfo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping
	public ResponseEntity<List<User>> getUsers() {
		return ResponseEntity.status(HttpStatus.OK).body(userService.getUsers());
	}


}
