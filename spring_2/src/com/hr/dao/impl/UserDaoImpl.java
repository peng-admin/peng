package com.hr.dao.impl;

import com.hr.dao.UserDao;

public class UserDaoImpl implements UserDao{

	@Override
	public void delete() {
		
		System.out.println("�û�ɾ����");
		
		
	}

	@Override
	public void get() {
		System.out.println("��ȡ�û�");
	}

	@Override
	public void save() {
		System.out.println("�����û�");
	}

	@Override
	public void update() {
		System.out.println("�޸��û�");
	}

}
