package com.hr.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hr.service.UserService;

public class ²âÊÔSpringµÄ´úÀí {
	
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		UserService userService = (UserService)context.getBean("userServiceProxy");
		
		userService.delete();
		
		userService.get();
		
		userService.update();
		
		userService.save();
		
		
	}

}
