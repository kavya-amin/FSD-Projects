package com.example.springmvc.spring_rest_application.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class login {
	@NotNull
	@Size(min = 3, message = "Username must be atleast 3 char(s) long..")
	private String userName;
	@NotNull
	@Size(min = 8, message = "Password should be minimum 8 character long..")
	private String password;
	
	public login() {
		
	}
}
