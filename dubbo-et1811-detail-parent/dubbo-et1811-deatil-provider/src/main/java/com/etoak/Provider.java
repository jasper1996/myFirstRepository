package com.etoak;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("classpath:spring-dubbo-provider.xml");
		//context.start();
		System.in.read();
	}

}
