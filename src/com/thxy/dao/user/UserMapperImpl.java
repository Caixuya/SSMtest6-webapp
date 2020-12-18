package com.thxy.dao.user;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.thxy.pojo.User;

public class UserMapperImpl implements UserMapper {

	private SqlSessionTemplate sqlSession;

	public List<User> getUserList(User user) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("com.thxy.dao.user.UserMapper.getUserList", user);
	}

	public SqlSessionTemplate getSqlSession() {
		return sqlSession;
	}

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

}
