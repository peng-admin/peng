package com.hr.test;

import com.hr.proxy.StaticProxy;
import com.hr.service.impl.UserServiceImpl;

public class ���Ծ�̬���� {

	public static void main(String[] args) {
		
		StaticProxy proxy = new StaticProxy(new UserServiceImpl());
		
		
		//ͨ���������ɾ��
		proxy.delete();
		
		
		
	}
	
}
