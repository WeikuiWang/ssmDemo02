package com.kui.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kui.blog.dao.IUserDao;
import com.kui.blog.service.IUserService;
import com.kui.blog.vo.User;

@Service("userService")
public class UserServiceImpl implements IUserService{
	@Autowired
	private IUserDao userDao;

	@Override
	public List<User> getAllUser() {
		return userDao.getAllUsers();
	}
	
}
