package com.gurugubelli.service;

import com.gurugubelli.dao.BaseDao;
import com.gurugubelli.dao.BaseDaoImpl;
import com.gurugubelli.pojo.User;

public class BaseServiceImpl implements BaseService {

	private BaseDao loginDao = new BaseDaoImpl();

	@Override
	public boolean login(String username, String password) {
		return loginDao.login(username, password);
	}

	@Override
	public String registration(User user) {
		return loginDao.register(user);
	}

}