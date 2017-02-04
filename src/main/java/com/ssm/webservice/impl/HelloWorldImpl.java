package com.ssm.webservice.impl;

import com.ssm.webservice.IHelloWorld;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/1/23.
 */

@Service("helloWorld")
public class HelloWorldImpl implements IHelloWorld {
    @Override
    public String sayHello() {
        return "hello world!";
    }
}
