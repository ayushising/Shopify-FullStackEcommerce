package com.axis.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.demo.model.User;
import com.axis.demo.repository.UserRepository;
import com.axis.demo.exception.IDNotFoundException;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public User addUser(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public User getUserByID(String userId) {
		return userRepository.findById(userId).orElseThrow(()-> new IDNotFoundException("Invalid Id"));
	}
}


