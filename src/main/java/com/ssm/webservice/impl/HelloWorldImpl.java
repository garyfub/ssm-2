package com.ssm.webservice.impl;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import javax.annotation.Resource;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.ssm.pojo.User;
import com.ssm.pojo.exception.FileTransferException;
import com.ssm.pojo.util.MyFile;
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
	public PageInfo<User> showPageUser(PageBean pageBean,String userName) {
		
		return userService.findUserAll(pageBean,userName);
	}
	

	@Override
	public MyFile downloadFile(MyFile myFile) throws FileTransferException {
		// TODO Auto-generated method stub
	    InputStream is = null;  
        
        try {  
            is = new FileInputStream(myFile.getServerFile());  
            is.skip(myFile.getPosition());  
            byte[] bytes = new byte[1024 * 1024];  
            int size = is.read(bytes);  
            if (size > 0) {  
                byte[] fixedBytes = Arrays.copyOfRange(bytes, 0, size);  
                myFile.setBytes(fixedBytes);  
            } else {  
                myFile.setBytes(new byte[0]);  
            }  
        } catch(IOException e) {  
            throw new FileTransferException(e.getMessage(), e);  
        } finally {  
            IOUtils.closeQuietly(is);  
        }  
        return myFile;  
    	}  
	
	
	 @Resource
	 private IUserService userService ;
	}
	
	

