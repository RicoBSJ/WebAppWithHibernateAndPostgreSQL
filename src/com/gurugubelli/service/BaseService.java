package com.gurugubelli.service;

import com.gurugubelli.pojo.User;

public interface BaseService {
	
	public boolean login(String username, String password);

	public String registration(User user);
}