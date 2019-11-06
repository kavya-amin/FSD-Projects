package com.mycompany.service;

import java.util.List;

import com.mycompany.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployee();

	public void saveEmployee(Employee theEmployee);

	public Employee getEmployee(int theId);

	public void deleteEmployee(int theId);
}
