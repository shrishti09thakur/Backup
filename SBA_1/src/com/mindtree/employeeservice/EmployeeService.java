package com.mindtree.employeeservice;

import java.util.ArrayList;

public interface EmployeeService {
	void displayAllDetail(ArrayList<EmployeeService> stArr);
	void displayinAscOrder(ArrayList<EmployeeService> stArr);
	boolean updateStudentRecord(ArrayList<EmployeeService> stArr,int id);

}
