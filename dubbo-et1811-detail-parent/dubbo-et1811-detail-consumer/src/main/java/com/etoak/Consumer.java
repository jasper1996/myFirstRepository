package com.etoak;

import java.io.IOException;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.etoak.bean.User;
import com.etoak.service.UserService;

public class Consumer {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-dubbo-consumer.xml");
		
		UserService userService = (UserService)context.getBean("userService");
		User user = new User(1,"",22);
		List<User> userList = userService.queryUser(user);
		System.out.println("size-------->"+userList.size());
		for (User u : userList) {
			System.out.println("结果是"+u);
		}
		System.in.read();
		
	}

}
