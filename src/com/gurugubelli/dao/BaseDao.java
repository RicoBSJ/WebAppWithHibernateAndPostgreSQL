package com.gurugubelli.dao;

import com.gurugubelli.pojo.User;

public interface BaseDao {
	
	public boolean login(String username, String password);

	public String register(User user);
}