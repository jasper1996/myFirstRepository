package com.etoak.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.etoak.bean.User;

/**
 * 本地存根
 * Stub 必须有传入Proxy的构造函数
 * 在innterface旁边放一个stub实现，它实现UserService接口，并有一个传入远程UserService实例的函数
 * 
 * 作用：验证user对象的name是否为null，如果为空，就不去调用真正的服务
 * 
 * @author Jasper
 *
 */
public class UserServiceStub implements UserService {

	private final UserService userService;
	
	public UserServiceStub (UserService userService) {
		this.userService = userService;
		System.out.println(this.userService);
	} 
	
	
	@Override
	public List<User> queryUser(User user) {
		//判断User或者用户名不为空
		if (user != null && !"".equals(user.getName()) && user.getName() != null) {
			//远程服务	
			return userService.queryUser(user);
		}
		return new ArrayList<User>();
	}

}
