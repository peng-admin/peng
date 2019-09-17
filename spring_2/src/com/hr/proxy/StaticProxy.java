package com.hr.proxy;

import com.hr.service.UserService;

public class StaticProxy {
	
	//有一个用户业务接口
	private UserService userService;

	public StaticProxy(UserService userService) {
		super();
		this.userService = userService;
	}

	
	//通过代理，去调用我们的方法
	public void delete(){
		
		System.out.println("日志记录");

		System.out.println("事务开启");

		userService.delete();

		System.out.println("事务结束");
		
		
	}
	
}
