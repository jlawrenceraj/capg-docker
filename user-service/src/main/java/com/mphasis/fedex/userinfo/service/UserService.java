package com.mphasis.fedex.userinfo.service;

import com.mphasis.fedex.userinfo.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {


	public List<User> getUsers() {
		List<User> users = new ArrayList<>();
		User user = new User();
		user.setUserId(12345);
		user.setUserName("Lawrence");
		user.setFirstName("Lawrence");
		user.setLastName("Joseph");
		user.setEmail("lawrence@gmail.com");
		users.add(user);
		return users;
	}
	
}
