package com.mindtree.employeeimpl;

import java.util.ArrayList;
import java.util.Iterator;

import com.mindtree.employeeservice.EmployeeService;

public class EmployeeImpl implements EmployeeService {

	@Override
	public void displayAllDetail(ArrayList<EmployeeService> stArr) {
		Iterator<EmployeeService> ir= stArr.iterator();
		System.out.println("Employee Detail");
		while(ir.hasNext()) {
			EmployeeService st= ir.next();
			System.out.println("Employee Id = "+ st.getId()+"Student Name = "+ st.getName()+"Student Mark = "+ st.getMarks());
		
	}

	@Override
	public void displayinAscOrder(ArrayList<EmployeeService> stArr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean updateStudentRecord(ArrayList<EmployeeService> stArr, int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
