package com.kui.blog.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kui.blog.dao.IUserDao;
import com.kui.blog.vo.User;

@Repository("userDao")
public class UserDaoImpl extends SqlSessionDaoSupport implements IUserDao {

	@Override
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	@Override
	public List<User> getAllUsers() {
		List<User> userList = getSqlSession().selectList("com.kui.blog.vo.UserMapper.selectAllUser");
		return userList;
	}

}
