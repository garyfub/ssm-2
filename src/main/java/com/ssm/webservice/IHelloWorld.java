package com.ssm.webservice;

import javax.jws.WebService;

import com.github.pagehelper.PageInfo;
import com.ssm.pojo.User;
import com.ssm.pojo.util.PageBean;

/**
 * Created by Administrator on 2017/1/23.
 */
@WebService
public interface IHelloWorld {
	
    public String sayHello(String message);
    
    public PageInfo<User> showPageUser(PageBean pageBean);
}
