package com.mycompany.Spring_hibernate_integration.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.Spring_hibernate_integration.entity.Customer;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	@Transactional
	public Customer createCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		session.save(theCustomer);
		return theCustomer;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Customer",Customer.class);
		return query.getResultList();
	}

	@Override
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Customer customer = session.get(Customer.class,id);
		return customer;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> getCustomerByFirstname(String firstName) {
		// TODO Auto-generated method stub
		
				Session session = sessionFactory.openSession();
				Query query = session.createQuery("from Customer c where c.firstName=firstNmae",Customer.class);
				query.setParameter("firstName", firstName);
				return query.getResultList();
	}

	@Override
	public Customer updateCustomer(Customer theCustomer, int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Customer customer2 = session.get(Customer.class, id);
		//customer2.setId(0);
		customer2.setFirstName(theCustomer.getFirstName());
		customer2.setLastName(theCustomer.getLastName());
		customer2.setEmail(theCustomer.getEmail());
		session.getTransaction().begin();
		session.saveOrUpdate(customer2);
		session.getTransaction().commit();
		return customer2;
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Customer c where c.id=id",Customer.class);
		query.setParameter("id", id);
	}

}
