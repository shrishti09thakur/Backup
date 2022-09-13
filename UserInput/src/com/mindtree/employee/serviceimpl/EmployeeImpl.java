package com.mindtree.employee.serviceimpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import com.mindtree.employee.Employee;
import com.mindtree.employee.entity.EmployeeService;
import com.mindtree.employee.namecomparator.NameComparator;

public class EmployeeImpl implements EmployeeService {

	@Override
	public void displayAllEmployee(ArrayList<Employee> alArr) {
		// TODO Auto-generated method stub
		Iterator<Employee>em=alArr.iterator();
		System.out.println("All Employee");
		while(em.hasNext()) {
			Employee ep=em.next();
			System.out.println("ID= "+ep.getsId()+ "Name= "+ep.getsName()+ "Age= "+ep.getsAge()+ "Salary= "+ep.getsSalary());
		}
		
	}

	@Override
	public void displayInDsecOrder(ArrayList<Employee> alArr) {
		// TODO Auto-generated method stub
		Collections.sort(alArr, new NameComparator());
		Iterator<Employee>em=alArr.iterator();
		System.out.println("All Employee");
		while(em.hasNext()) {
			Employee ep=em.next();
			System.out.println("ID= "+ep.getsId()+ "Name= "+ep.getsName()+ "Age= "+ep.getsAge()+ "Salary= "+ep.getsSalary());
		}
		
	}

	@Override
	public boolean updateTheEmployeeSalary(ArrayList<Employee> alArr, int Id) {
		// TODO Auto-generated method stub
		Scanner keyboard= new Scanner(System.in);
		boolean result= false;
		int size= alArr.size();
		Employee e=null;
		int index=0;
		for(int i=0;i<size;i++) {
			if(alArr.get(i).getsId()==Id) {
				e=alArr.get(i);
				index++;
				break;
			}
		}
		int choice;
		System.out.println("Enter the Updated Salary");
		int Salary=keyboard.nextInt();
		e.setsSalary(Salary);
		alArr.set(index, e);
		result=true;
		return result;
	}

}
