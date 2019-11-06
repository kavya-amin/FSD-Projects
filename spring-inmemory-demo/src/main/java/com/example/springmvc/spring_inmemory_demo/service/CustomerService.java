package com.example.springmvc.spring_inmemory_demo.service;

import java.util.List;

import com.example.springmvc.spring_inmemory_demo.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();
	public Customer getCustomer(int theId);
	public Customer save(Customer customer);
	void deleteCustomer(int theId);
	
}
