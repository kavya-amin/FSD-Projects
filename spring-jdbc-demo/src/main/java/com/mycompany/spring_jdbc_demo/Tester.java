package com.mycompany.spring_jdbc_demo;

import java.util.Iterator;
import java.util.List;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.spring_jdbc_demo.dao.CustomerDAO;
import com.mycompany.spring_jdbc_demo.dao.CustomerDAOImpl;
import com.mycompany.spring_jdbc_demo.model.Customer;



public class Tester {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			CustomerDAO customerDAO = context.getBean("customerDao", CustomerDAOImpl.class);

			//customerDAO.createCustomer(new Customer("Anushree", "B", "anu@luv2code.com"));
			
			//customerDAO.deleteCustomer(3);
			
			//customerDAO.updateCustomer(1);
			
			List<Customer> list = customerDAO.getAllcustomer();
			Iterator<Customer> i = list.iterator();
			while(i.hasNext())
			{
				Customer c = i.next();
				System.out.println(c.getFirstName()+" , "+c.getLastName()+" , "+c.getEmail());
			}
			System.out.println("ok!");
			


	}

}
