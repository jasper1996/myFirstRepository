package com.etoak.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.etoak.bean.User;
import com.etoak.service.UserService;

public class UserServiceImpl2 implements UserService {

	@Override
	public List<User> queryUser(User user) {
		System.out.println("version2传入");
		User u2 = new User(4,"TOm",22);
				
		List<User> list2 = Arrays.asList(u2);
		/*
		 * List<User> list = new ArrayList<User>(); list.add(u2);
		 */		
		return list2;
	}

}
