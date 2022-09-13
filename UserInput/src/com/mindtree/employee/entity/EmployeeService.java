package com.mindtree.employee.entity;

import java.util.ArrayList;

import com.mindtree.employee.Employee;

public interface EmployeeService {
	void displayAllEmployee(ArrayList<Employee>alArr);
	void displayInDsecOrder(ArrayList<Employee>alArr);
	boolean updateTheEmployeeSalary(ArrayList<Employee>alArr,int Id);

}
