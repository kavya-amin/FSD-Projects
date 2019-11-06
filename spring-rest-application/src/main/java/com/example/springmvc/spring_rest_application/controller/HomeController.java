package com.example.springmvc.spring_rest_application.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.springmvc.spring_rest_application.service.LoginService;

@Controller
public class HomeController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="/login",method= RequestMethod.GET)
public String deleteCustomer(ModelMap model,@RequestParam String userName,@RequestParam String password) {
		
		// delete the customer
		
	boolean value= loginService.login(userName, password);;
		
	if(value==true)
		return "todo";
	else
		return "error";
	}
}
