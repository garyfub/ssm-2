package com.ssm.webservice.impl;

import com.ssm.pojo.util.PageBean;
import com.ssm.pojo.util.PageData;
import com.ssm.webservice.IHelloWorld;
import org.springframework.stereotype.Service;

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
	public PageData showPageUser(PageBean pageBean) {
		
		return null;
	}
}
