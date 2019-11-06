package com.example.springmvc.spring_rest_application.dao;

public class LoginDaoImpl implements LoginDAO {

	@Override
	public boolean login(String userName, String password) {
		// TODO Auto-generated method stub
		if((userName.equals("dummy"))&& (password.equals("dummy")))
		{
			return true;
		}
		else {
			return false;
		}

	}

}
