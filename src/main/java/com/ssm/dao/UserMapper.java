package com.ssm.dao;

import java.util.List;

import com.ssm.pojo.User;

public interface UserMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);
    
    List<User> selectUserList(String userName);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}