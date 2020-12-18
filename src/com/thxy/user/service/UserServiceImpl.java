package com.thxy.user.service;

import java.util.List;

import com.thxy.dao.user.UserMapper;
import com.thxy.pojo.User;

public class UserServiceImpl implements UserService {

	private UserMapper userMapper;

	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public List<User> findUsersWithConditions(User user) {
		// TODO Auto-generated method stub
		try {
			return userMapper.getUserList(user);
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

}
