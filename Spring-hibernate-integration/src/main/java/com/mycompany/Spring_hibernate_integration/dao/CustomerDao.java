package com.mycompany.Spring_hibernate_integration.dao;

import java.util.List;

import com.mycompany.Spring_hibernate_integration.entity.Customer;

public interface CustomerDao {
	
	public Customer createCustomer(Customer theCustomer);
	public List<Customer> getAllCustomer();
	public Customer getCustomerById(int id);
	public List<Customer> getCustomerByFirstname(String firstName);
	public Customer updateCustomer(Customer theCustomer,int id);
	public void deleteCustomer(int id);
}
