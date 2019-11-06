package com.mycompany.dao;

import java.util.List;

import com.mycompany.entity.Employee;

public interface EmployeeDao {
	public List<Employee> getAllEmployee();

	public void saveEmployee(Employee theEmployee);

	public Employee getEmployee(int theId);
	
	public void deleteEmployee(int theId);
}
