package com.mycompany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.dao.EmployeeDao;
import com.mycompany.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao employeeDao;
	@Override
	@Transactional
	public List getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeDao.getAllEmployee();
	}
	@Override
	@Transactional
	public void saveEmployee(Employee theEmployee) {
		// TODO Auto-generated method stub
		employeeDao.saveEmployee(theEmployee);
	}
	@Override
	@Transactional
	public Employee getEmployee(int theId) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployee(theId);
	}
	@Override
	public void deleteEmployee(int theId) {
		// TODO Auto-generated method stub
		employeeDao.deleteEmployee(theId);
	}

}
