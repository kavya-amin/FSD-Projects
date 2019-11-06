package com.mycompany.Spring_hibernate_integration;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.Spring_hibernate_integration.entity.Customer;
import com.mycompany.Spring_hibernate_integration.factory.MyContextFactory;
import com.mycompany.Spring_hibernate_integration.service.CustomerService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	CustomerService service = MyContextFactory.getMyContextFactory();

	
		  List<Customer> list = service.getAllCustomer();
		  Iterator<Customer> i = list.iterator(); while (i.hasNext()) { Customer c = i.next();
		  System.out.println(c); }
		 
		  System.out.println();
		  List<Customer> list1=service.getCustomerByFirstname("kavya"); if(list.isEmpty())
		  { System.out.println("no record found!"); } else { for(Customer c:list) {
		 System.out.println(c); } }
		 
		
		Customer c=service.updateCustomer(new Customer("Anushree","B.S","anubs@gmail.com"), 7);
		if(c!=null)
		{
			System.out.println("upadted "+c);
		}
		else {
			System.out.println("no record found");	
		}
		
		service.deleteCustomer(2);
        
    }
}
