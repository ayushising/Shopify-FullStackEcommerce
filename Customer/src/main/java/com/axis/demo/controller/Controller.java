package com.axis.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.demo.model.User;
import com.axis.demo.service.UserService;


@RequestMapping("/shopify/user")
@RestController
public class Controller {
	@Autowired
	UserService User;
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}

	@PostMapping("/save")
	public ResponseEntity<User> saveUserDetail(@RequestBody User user) {
		User user2=User.addUser(user);
				
		return new ResponseEntity <User> (user2,HttpStatus.OK);
	}
	
	@GetMapping("/getId/{userId}")
	public ResponseEntity<User> getUser(@PathVariable String userId) {
		User user2=User.getUserByID(userId);
		return new ResponseEntity <User> (user2,HttpStatus.OK);

	}
	


}
