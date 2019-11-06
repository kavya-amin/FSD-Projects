package com.example.springmvc.spring_rest_application.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.springmvc.spring_rest_application.dao.LoginDAO;

public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginDAO loginDAO;
	
	@Override
	public boolean login(String userName, String password) {
		// TODO Auto-generated method stub
		boolean value=loginDAO.login(userName, password);
		return value;
	}

}
