package com.mycompany.Hibernate_demo.dao;

import java.util.List;

import com.mycompany.Hibernate_demo.shared.SharedEmployee;

public interface EmployeeDAO {

	public void createEmployee(SharedEmployee sEmployee);

	public List<SharedEmployee> getAllEmployee();

	public SharedEmployee findById(int id);

	public void findByCustomId(String customId);

	public void deleteEmployee(int id);

}
