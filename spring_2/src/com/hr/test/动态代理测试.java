package com.hr.test;

import com.hr.proxy.TrendsProxy;
import com.hr.service.UserService;
import com.hr.service.impl.UserServiceImpl;

public class ��̬������� {
	
	public static void main(String[] args) {
		//��̬�������õ�
		TrendsProxy proxy = new TrendsProxy();
		
		UserService userService = (UserService)proxy.bind(new UserServiceImpl());
		
		
		userService.delete();
		
		userService.get();
		
		userService.update();
		
		userService.save();
		
		
		
	}

}
