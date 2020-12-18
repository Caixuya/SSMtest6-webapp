package com.thxy.dao.user;

import java.util.List;

import com.thxy.pojo.User;

//实体类对应的DAO接口
public interface UserMapper {

	public List<User> getUserList(User user);
}
