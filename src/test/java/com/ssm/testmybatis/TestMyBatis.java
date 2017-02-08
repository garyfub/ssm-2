package com.ssm.testmybatis;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.pojo.User;
import com.ssm.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)  // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class TestMyBatis {
	
    private static Logger logger = Logger.getLogger(TestMyBatis.class);
    
    @Resource
    private IUserService userService ;

    @Test
    public void test() {
        User user = userService.getUserById(1);
        System.out.println(user.getUserName());
        logger.info(JSON.toJSONString(user));
    }
    
    @Test
    public void testPageHelperList() {
    	
    	  PageHelper.startPage(1, 10);
    	  List<User> userList = userService.findUserAll();
    	  PageInfo<User>  info = new PageInfo<>(userService.findUserAll());
    	  System.out.println(info);
    	  for (User user : userList) {
			System.out.println(user.getUserName());
		}
    	  System.out.println("size:"+userList.size());
    }
}
