package com.axis.demo.service;

import com.axis.demo.model.User;

public interface UserService {
	public User addUser(User user) ;
	public User getUserByID(String userId);


}
