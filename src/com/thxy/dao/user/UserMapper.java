package com.thxy.dao.user;

import java.util.List;

import com.thxy.pojo.User;

//ʵ�����Ӧ��DAO�ӿ�
public interface UserMapper {

	public List<User> getUserList(User user);
}
