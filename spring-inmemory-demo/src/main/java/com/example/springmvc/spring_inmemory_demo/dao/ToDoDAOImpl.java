package com.example.springmvc.spring_inmemory_demo.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.springmvc.spring_inmemory_demo.entity.Todo;

@Repository
public class ToDoDAOImpl implements ToDoDAO {
@Autowired
	private SessionFactory sessionFactory;
	@SuppressWarnings("unchecked")
	@Override
	public List<Todo> getAllToDo() {
		// TODO Auto-generated method stub
		
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("FROM Todo",Todo.class);
		return query.getResultList();
	}

}