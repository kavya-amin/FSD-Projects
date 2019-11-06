package com.mycompany.Spring_hibernate_integration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.Spring_hibernate_integration.dao.CustomerDao;
import com.mycompany.Spring_hibernate_integration.entity.Customer;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	private CustomerDao customerDao;
	
	@Override
	@Transactional
	public Customer createCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		return customerDao.createCustomer(theCustomer);
	}

	@Override
	@Transactional
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return customerDao.getAllCustomer();
	}

	@Override
	@Transactional
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		Customer customer= customerDao.getCustomerById(id);
		if(customer!=null) {
			return customer;
		}
		else {
		return null;
		}
	}

	@Override
	public List<Customer> getCustomerByFirstname(String firstName) {
		// TODO Auto-generated method stub
		return customerDao.getCustomerByFirstname(firstName);
	}

	@Override
	@Transactional
	public Customer updateCustomer(Customer theCustomer, int id) {
		// TODO Auto-generated method stub
		return customerDao.updateCustomer(theCustomer, id);
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		customerDao.deleteCustomer(id);
	}

}
