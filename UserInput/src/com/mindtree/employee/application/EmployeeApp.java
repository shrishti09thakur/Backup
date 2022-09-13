package com.mindtree.employee.application;

import java.util.ArrayList;
import java.util.Scanner;

import com.mindtree.employee.Employee;
import com.mindtree.employee.serviceimpl.EmployeeImpl;

public class EmployeeApp {

	public static void main(String[] args) {
	    Employee emp=new Employee();
	    Scanner sc= new Scanner(System.in);
	    ArrayList<Employee>alArr=new ArrayList<Employee>();
	    EmployeeImpl epi= new EmployeeImpl();
	    
	    int choice=0;
	    
	    while(true) {
	    	System.out.println("1.Enter all Employee");
	    	System.out.println("2.Display all The Employee");
	    	System.out.println("3.Display All The Employee In Desending Order");
	    	System.out.println("4.Update the Salary Of Employee");
	    	System.out.println("5.Exit");
	    	System.out.println("Please Select One");
	    	choice= sc.nextInt();
	    	
	    	switch(choice) {
	    	case 1:
	    		System.out.println("How Many Employee Needs Registration");
	    		int n=sc.nextInt();
	    		for(int i=0;i<n;i++) {
	    			System.out.println("Employee ID");
	    			int sId=sc.nextInt();
	    			sc.nextLine();
	    			System.out.println("Employee Name");
	    			String sName=sc.nextLine();
	    			System.out.println("Employee Age");
	    			int sAge=sc.nextInt();
	    			sc.nextLine();
	    			System.out.println("Employee Salary");
	    			int sSalary= sc.nextInt();
	    			sc.nextLine();
	    			
	    			Employee epr=new Employee(sId, sName, sAge, sSalary);
	    			alArr.add(epr);
	    		}
	    		break;
	    	case 2:
	    		epi.displayAllEmployee(alArr);
	    		break;
	    	case 3:
	    		epi.displayInDsecOrder(alArr);
	    		break;
	    	case 4:
	    		System.out.println("Enter the Id of Employee");
	    		int sId=sc.nextInt();
	    		boolean result=epi.updateTheEmployeeSalary(alArr, sId);
	    		if(result) {
	    			System.out.println("Update Successfully");
	    		}else {
	    			System.out.println("Record Not Found");
	    		}
	    		break;
	    	case 5:
	    		System.exit(0);
	    		default:
	    			System.out.println("Invalid Choice");
	    	}
	    }

	}

}
