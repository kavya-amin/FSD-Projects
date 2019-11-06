package com.example.springmvc.spring_inmemory_demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springmvc.spring_inmemory_demo.dao.ToDoDAO;
import com.example.springmvc.spring_inmemory_demo.entity.Todo;
@Service
public class ToDoServiceImpl implements ToDoService {
@Autowired
	private ToDoDAO toDoDAO;
	@Override
	public List<Todo> getAllToDo() {
		// TODO Auto-generated method stub
		return toDoDAO.getAllToDo();
	}

}