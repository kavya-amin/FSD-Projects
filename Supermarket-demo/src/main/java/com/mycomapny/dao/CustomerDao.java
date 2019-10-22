package com.mycomapny.dao;

import java.util.List;

import com.mycompany.model.Customer;

public interface CustomerDao {
	public void createCustomer(Customer customer);
	public List<Customer> getAllCustomer();
}
