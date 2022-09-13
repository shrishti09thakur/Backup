package com.mindtree.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import com.mindtree.employeeservice.EmployeeService;
import com.mindtree.studentapplication.student;

public class studentapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1= new student(1,20,"lily");
		student s2= new student(2,830,"juli");
		student s3= new student(3,50,"abhi");
		student s4= new student(4,60,"raj");
		student s5= new student(5,60,"subh");
		ArrayList<student>all= new ArrayList<>();
		all.add(s1);
		all.add(s2);
		all.add(s3);
		all.add(s4);
		all.add(s5);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Choice");
		int n= sc.nextInt();
		switch(n) {
		case(1):for(student stu1:all) {
			System.out.println("Student Id = "+ stu1.getId());
			System.out.println("Student Name = "+ stu1.getName());
			System.out.println("Student Mark = "+ stu1.getMark());
		}break;
		case(2):
			Comparator c= Collections.reverseOrder();
		Collections.sort(all,c);
		System.out.println("Sort name in Decending");
		for(student stu2:all) {
			System.out.println("Student Id = "+ stu2.getId());
			System.out.println("Student Name = "+ stu2.getName());
			System.out.println("Student Mark = "+ stu2.getMark());
		}break;
		case(3):
			System.exit(0);
		}

	}

}
//EmployeeService E1= new EmployeeService(1,"Lily",18,25000);
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
