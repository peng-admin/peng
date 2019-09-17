package com.hr.dao.impl;

import com.hr.dao.UserDao;

public class UserDaoImpl implements UserDao{

	@Override
	public void delete() {
		
		System.out.println("用户删除了");
		
		
	}

	@Override
	public void get() {
		System.out.println("获取用户");
	}

	@Override
	public void save() {
		System.out.println("新增用户");
	}

	@Override
	public void update() {
		System.out.println("修改用户");
	}

}
