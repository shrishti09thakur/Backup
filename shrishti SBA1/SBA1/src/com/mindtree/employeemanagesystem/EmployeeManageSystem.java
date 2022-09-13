package com.mindtree.employeemanagesystem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import com.mindtree.employeeservice.EmployeeService;

public class EmployeeManageSystem {
	public static void main(String[]args) {
		EmployeeService E1= new EmployeeService(1,"Lily",18,25000);
		EmployeeService E2= new EmployeeService(2,"Juli",19,20000);
		EmployeeService E3= new EmployeeService(3,"Mily",18,10000);
		EmployeeService E4= new EmployeeService(4,"Rani",20,50000);
		EmployeeService E5= new EmployeeService(5,"Sitara",17,5000);
		EmployeeService E6= new EmployeeService(6,"Tara",25,8000);
		EmployeeService E7= new EmployeeService(7,"Sara",23,20000);
		EmployeeService E8= new EmployeeService(8,"Raj",24,15000);
		EmployeeService E9= new EmployeeService(9,"Abhi",23,60000);
		EmployeeService E10= new EmployeeService(10,"Subh",20,30000);

		ArrayList<EmployeeService>all= new ArrayList<>();
		all.add(E1);
		all.add(E2);
		all.add(E3);
		all.add(E4);
		all.add(E5);
		all.add(E6);
		all.add(E7);
		all.add(E8);
		all.add(E9);
		all.add(E10);
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Select The Choice");
		int in= sc.nextInt();
		switch(in) {
		case 1: for(EmployeeService ES:all) {
			System.out.println("Employee ID="+ ES.getId());
			System.out.println("Employee Name="+ ES.getName());
			System.out.println("Employee Age="+ ES.getAge());
			System.out.println("Employee Salary="+ ES.getSalary());
		}
		break;
		case 2:
			Collections.sort(all,Collections.reverseOrder());
			System.out.println("Arrange the name in Decending Order");
			for(EmployeeService ESS:all) {
				System.out.println("Employee ID="+ ESS.getId());
				System.out.println("Employee Name="+ ESS.getName());
				System.out.println("Employee Age="+ ESS.getAge());
				System.out.println("Employee Salary="+ ESS.getSalary());	
			}
			break;
		case 3:
			System.out.println("Enter Id");
			int in1= sc.nextInt();
			System.out.println("Enter salary");
			int salary1= sc.nextInt();
			for(EmployeeService add:all) {
				add.setSalary(salary1);
				if(add.getId()==in1) {
					System.out.println("Employee ID="+ add.getId());
					System.out.println("Employee Name="+ add.getName());
					System.out.println("Employee Age="+ add.getAge());
					System.out.println("Employee Salary="+ add.getSalary());	
				}
			
			}
			break;
		    case 4:
		      System.exit(0);	
		}
	}

}
