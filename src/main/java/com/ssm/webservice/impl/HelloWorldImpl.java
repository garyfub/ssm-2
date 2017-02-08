package com.ssm.webservice.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.ssm.pojo.User;
import com.ssm.pojo.util.PageBean;
import com.ssm.service.IUserService;
import com.ssm.webservice.IHelloWorld;

/**
 * Created by Administrator on 2017/1/23.
 */

@Service("helloWorld")
public class HelloWorldImpl implements IHelloWorld {
	
    @Override
    public String sayHello(String message) {
    	
        return "hello world!"+message;
    }
    
	@Override
	public PageInfo<User> showPageUser(PageBean pageBean) {
		
		return userService.findUserAll(pageBean);
	}
	
	 @Resource
	 private IUserService userService ;

}
