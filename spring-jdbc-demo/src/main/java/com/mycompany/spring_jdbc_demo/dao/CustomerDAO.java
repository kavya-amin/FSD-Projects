package com.mycompany.spring_jdbc_demo.dao;

import java.util.List;

import com.mycompany.spring_jdbc_demo.model.Customer;

public interface CustomerDAO {
	
	public void createCustomer(Customer customer);
	public void deleteCustomer(int id);
	public void updateCustomer(int id);
	public List<Customer> getAllcustomer();
}
