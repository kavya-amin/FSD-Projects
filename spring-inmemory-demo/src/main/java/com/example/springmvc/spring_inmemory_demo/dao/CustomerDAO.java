package com.example.springmvc.spring_inmemory_demo.dao;

import java.util.List;

import com.example.springmvc.spring_inmemory_demo.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();
	
	public Customer getCustomer(int theId);
	
	public Customer save(Customer customer);

	void deleteCustomer(int theId);
	
}
