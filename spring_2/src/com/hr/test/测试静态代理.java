package com.hr.test;

import com.hr.proxy.StaticProxy;
import com.hr.service.impl.UserServiceImpl;

public class 测试静态代理 {

	public static void main(String[] args) {
		
		StaticProxy proxy = new StaticProxy(new UserServiceImpl());
		
		
		//通过代理调用删除
		proxy.delete();
		
		
		
	}
	
}
