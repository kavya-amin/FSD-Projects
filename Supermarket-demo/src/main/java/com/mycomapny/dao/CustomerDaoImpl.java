package com.mycomapny.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mycomapny.factory.HibernateUtilFactory;
import com.mycompany.model.Customer;

public class CustomerDaoImpl implements CustomerDao {

	private Session session = null;
	private SessionFactory factory = null;

	{
		factory = HibernateUtilFactory.getSessionFactory();
	}

	public void createCustomer(Customer customer) {
		try {
			session = factory.openSession();
			session.getTransaction().begin();
			session.persist(customer);
			session.getTransaction().commit();

		} finally {
			session.close();
		}
	}

}
