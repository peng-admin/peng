package com.hr.proxy;

import com.hr.service.UserService;

public class StaticProxy {
	
	//��һ���û�ҵ��ӿ�
	private UserService userService;

	public StaticProxy(UserService userService) {
		super();
		this.userService = userService;
	}

	
	//ͨ������ȥ�������ǵķ���
	public void delete(){
		
		System.out.println("��־��¼");

		System.out.println("������");

		userService.delete();

		System.out.println("�������");
		
		
	}
	
}
