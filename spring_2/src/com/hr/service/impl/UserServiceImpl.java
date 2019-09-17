package com.hr.service.impl;

import com.hr.dao.UserDao;
import com.hr.dao.impl.UserDaoImpl;
import com.hr.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao;

	@Override
	public void delete() {

		userDao.delete();
		
	}

	@Override
	public void get() {


		userDao.get();


	}

	@Override
	public void save() {

		userDao.save();

	}

	@Override
	public void update() {

		userDao.update();

	}

	//�ṩһ��set�������������ǵ�����ע��
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	
	

}
