package com.example.springmvc.spring_inmemory_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springmvc.spring_inmemory_demo.entity.Customer;
import com.example.springmvc.spring_inmemory_demo.service.CustomerService;



@RestController
@RequestMapping("/api")
public class CustomerRestController {

	
	@Autowired
	private CustomerService customerService;
	
	// add mapping for GET /customers
	@GetMapping("/customers")
	public List<Customer> getCustomers() {
		
		return customerService.getCustomers();
		
	}
	
	@GetMapping("/customers/{theId}")
	public Customer getCustomer(@PathVariable int theId) {
		
		return customerService.getCustomer(theId);
		
	}
	
	@PostMapping("/customers")
	public Customer save(@RequestBody Customer theCustomer)
	{
		
		customerService.save(theCustomer);
		return theCustomer;
	}
	
	@PutMapping("/customers")
	public Customer updateCustomer(@RequestBody Customer theCustomer)
	{
		customerService.save(theCustomer);
		return theCustomer;
	}
	
	@DeleteMapping("/customers/{theId}")
	public void deleteCustomer(@PathVariable int theId)
	{
		customerService.deleteCustomer(theId);
	}
		
	
}
