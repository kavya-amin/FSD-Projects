package com.example.springmvc.spring_inmemory_demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springmvc.spring_inmemory_demo.entity.Todo;
import com.example.springmvc.spring_inmemory_demo.service.ToDoService;


@RestController
@RequestMapping("/api")
public class ToDoRestController {
	
	@Autowired
	private ToDoService toDoService;
	@GetMapping(value ="/todos")
	public List<Todo> listTodo()
	{
		return toDoService.getAllToDo();
	}

}