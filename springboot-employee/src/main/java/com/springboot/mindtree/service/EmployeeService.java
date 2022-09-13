package com.springboot.mindtree.service;

import java.util.List;

import com.springboot.mindtree.model.Employee;

public interface EmployeeService {
	Employee SaveEmployee(Employee employee);
	List<Employee> getAllEmployee();
	Employee getEmployeeById(long id);
	Employee updateEmployee(Employee employee,long id);
	void deleteEmployee(long id);

}
