package com.mindtree.employee.namecomparator;

import java.util.Comparator;

import com.mindtree.employee.Employee;

public class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getsName().compareToIgnoreCase(o2.getsName());
	}

}
