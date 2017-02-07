package com.ssm.webservice;

import javax.jws.WebService;

import com.ssm.pojo.util.PageBean;
import com.ssm.pojo.util.PageData;

/**
 * Created by Administrator on 2017/1/23.
 */
@WebService
public interface IHelloWorld {
	
    public String sayHello(String message);
    
    public PageData showPageUser(PageBean pageBean);
}
