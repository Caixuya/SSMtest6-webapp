package com.thxy.user.service;

import java.util.List;

import com.thxy.pojo.User;

public interface UserService {

	//ҵ��ӿ�
	public List<User> findUsersWithConditions(User user);
}
