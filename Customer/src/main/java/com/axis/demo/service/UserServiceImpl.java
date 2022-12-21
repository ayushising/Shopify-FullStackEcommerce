  package com.axis.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.demo.model.User;
import com.axis.demo.repository.UserRepository;
import com.axis.demo.util.AppContant;
import com.axis.demo.exception.IDNotFoundException;
import com.axis.demo.exception.UserException;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public User addUser(User user) {
		if(user.getName()=="") {
			throw new UserException(AppContant.USER_ERR);
		}
		else if(user.getEmail()=="") {
			throw new UserException(AppContant.EMAIL_ERR);
		}

		return userRepository.save(user);
	}

	@Override
	public User getUserByID(String userId) {
		return userRepository.findById(userId).orElseThrow(()-> new IDNotFoundException(AppContant.INVALID_MSG));
	}

	@Override
	public String deleteUserbyID(String userId) {
		userRepository.deleteById(userId);
		return AppContant.DELETE_MSG;
	}

	@Override
	public List<User> getAll() {
		return userRepository.findAll();
	}
}


