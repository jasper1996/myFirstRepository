package com.etoak.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.etoak.bean.User;
import com.etoak.service.UserService;

/**
 * 
 * 服务实现类
 * @author Jasper
 *
 */
public class UserServiceImpl implements UserService {

	@Override
	public List<User> queryUser(User user) {
		System.out.println("Vsesion1.0");
		
		//模拟User List 进行返回
		User user1 = new User(1,"etoak",10);
		User user2 = new User(2,"et1811",11);
		
		List<User> userList = new ArrayList<User>();
		userList.add(user1);
		userList.add(user2);
		
		return userList;
	}

}
