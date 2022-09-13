package com.java.mindtree.studentapplication;
import java.util.ArrayList;
import java.util.Scanner;

import com.mindtree.studentdetail.detail;
import com.mindtree.studentimpl.StudentDetailImpl;

public class StudentApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		detail stud= new detail();
		Scanner sc= new Scanner(System.in);
		ArrayList<detail>strArr= new ArrayList<detail>();
		StudentDetailImpl S2= new StudentDetailImpl();
		int choice;
		while(true) {
			System.out.println("Enter 1 to add Student");
			System.out.println("Enter 2 to display All Details");
			System.out.println("Enter 3 to display in AscOrder");
			System.out.println("Enter 4 to Update All Details");
			System.out.println("Enter 5 to Exit");
			choice= sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Number of student to add = ");
				int numofstudent=sc.nextInt();
				for(int i=0; i<=numofstudent;i++) {
					System.out.println("Enter ID= ");
					int id= sc.nextInt();
					sc.nextInt();
					System.out.println("Enter name= ");
					String name=sc.nextLine();
					sc.nextLine();
					System.out.println("Enter marks= ");
					int marks= sc.nextInt();
					sc.nextInt();
					detail studR= new detail();
					strArr.add(studR);
				}
				System.out.println("     ");
				break;
			case 2:
				S2.displayallDetail(strArr);
				System.out.println("     ");
				break;
			case 3:
				System.out.println("Display the Student in Acending Order");
				S2.displayinAscOrder(strArr);
				System.out.println("     ");
				break;
			case 4:
				System.out.println("Enter Student ID=");
				int id= sc.nextInt();
				boolean result= S2.updatedetail(strArr, id);
				if(result) {
					System.out.println("Detail Update Successfully");
				}else {
					System.out.println("Try Again");
				}
				System.out.println("     ");
				break;
			}
		}

	}

}
