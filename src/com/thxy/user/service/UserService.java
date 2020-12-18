package com.thxy.user.service;

import java.util.List;

import com.thxy.pojo.User;

public interface UserService {

	//业务接口
	public List<User> findUsersWithConditions(User user);
}
