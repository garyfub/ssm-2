package com.ssm.service;

import java.util.List;

import com.ssm.pojo.User;

public interface IUserService{
	
	  User getUserById(int userId);
	  
	  List<User> findUserAll();
}
