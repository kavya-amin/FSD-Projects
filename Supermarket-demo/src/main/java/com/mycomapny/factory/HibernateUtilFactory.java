package com.mycomapny.factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycompany.model.Customer;

public class HibernateUtilFactory {

	private static SessionFactory factory;
	
	public static SessionFactory getSessionFactory()
	{
		factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Customer.class).buildSessionFactory();
		return factory;
	}
}
