package com.hr.test;

import com.hr.proxy.TrendsProxy;
import com.hr.service.UserService;
import com.hr.service.impl.UserServiceImpl;

public class 动态代理测试 {
	
	public static void main(String[] args) {
		//动态代理对象得到
		TrendsProxy proxy = new TrendsProxy();
		
		UserService userService = (UserService)proxy.bind(new UserServiceImpl());
		
		
		userService.delete();
		
		userService.get();
		
		userService.update();
		
		userService.save();
		
		
		
	}

}
