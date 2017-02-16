package com.ssm.service;

import com.github.pagehelper.PageInfo;
import com.ssm.pojo.User;
import com.ssm.pojo.util.PageBean;

public interface IUserService{
	
	  User getUserById(int userId);
	  
	  PageInfo<User> findUserAll(PageBean pageBean,String userName);
}
