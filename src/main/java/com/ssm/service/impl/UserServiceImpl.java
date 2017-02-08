package com.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.dao.UserMapper;
import com.ssm.pojo.User;
import com.ssm.pojo.util.PageBean;
import com.ssm.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

    public User getUserById(int userId) {
        return this.userDao.selectByPrimaryKey(userId);
    }

	@Override
	public PageInfo<User> findUserAll(PageBean pageBean) {
		PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
		PageInfo<User>  info = new PageInfo<>(userDao.selectUserList());
		return info;
	}

	@Resource
    private UserMapper userDao;


}
