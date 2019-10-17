package com.mycompany.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycompany.model.Customer;

public class AddCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int id;
	private String Customer_name;
	private String Customer_type;
	private List<String> errors;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doProcess(request, response);

	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		errors = new ArrayList<String>();
		String cId = request.getParameter("id");
		try {
			id=Integer.parseInt(cId);
		} catch (Exception e) {
			// TODO: handle exception
			errors.add("id field must be numeric");
		}
		Customer_name=request.getParameter("customer_name");
		if(Customer_name.length()==0)
		{
			errors.add("invalid name");
		}
		Customer_type=request.getParameter("customer_type");
		if(Customer_type.equals("Unknown"))
		{
			errors.add("select a type");
		}
		if(!errors.isEmpty())
		{
			request.setAttribute("ERROR", errors);
			RequestDispatcher view=request.getRequestDispatcher("add_customer.view");
			view.forward(request, response);
		}
		else
		{
			request.setAttribute("SUCCESS", new Customer(id,Customer_name,Customer_type));
			RequestDispatcher view=request.getRequestDispatcher("success.view");
			view.forward(request, response);
		}

	}

}