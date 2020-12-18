package com.thxy.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.thxy.pojo.User;
import com.thxy.user.service.UserService;

public class MyBatisTest {
	// private final static Log logger = LogFactory.getLog(UserService. class);
	Log logger = LogFactory.getLog(MyBatisTest.class);

	@Test
	public void Select() throws IOException {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
		UserService userService = (UserService) ctx.getBean("userService");

		User userCondition = new User();
		/*
		 * userCondition.setUserName("ут"); userCondition.setUserRole(3);
		 */

		List<User> userList = new ArrayList<User>();
		userList = userService.findUsersWithConditions(userCondition);

		for (User userResult : userList) {
			logger.debug("testGetUserList userCode:" + userResult.getUserCode() + " and userName:"
					+ userResult.getUserName() + " and userRole:" + userResult.getUserRole() + " and userRoleName"
					+ userResult.getUserRoleName() + " and address" + userResult.getAddress());
		}

	}
}
