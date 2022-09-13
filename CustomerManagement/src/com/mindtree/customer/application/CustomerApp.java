package com.mindtree.customer.application;

import java.util.ArrayList;
import java.util.Scanner;

import com.mindtree.customer.Customer;
import com.mindtree.customer.serviceimpl.CustomerImpl;

public class CustomerApp {

	public static void main(String[] args) {
		Customer c1= new Customer();
		Scanner sc=new Scanner(System.in);
		ArrayList<Customer>alArr=new ArrayList<Customer>();
		CustomerImpl cmi=new CustomerImpl();
		
		int choice=0;
		
		while(true) {
			System.out.println("1.Enter all Customer");
	    	System.out.println("2.Display all The Customer");
	    	System.out.println("3.Display All The Customer In Desending Order");
	    	System.out.println("4.Update the Age Of Customer");
	    	System.out.println("5.Exit");
	    	System.out.println("Please Select One");
	    	choice= sc.nextInt();
	    	
	    	switch(choice) {
	    	case 1:
	    		System.out.println("How Many Customers You Want To Add");
	    		int n=sc.nextInt();
	    		for(int i=0;i<n;i++) {
	    			System.out.println("Customer ID:");
	    			int sId=sc.nextInt();
	    			sc.nextLine();
	    			System.out.println("Customer Name:");
	    			String sName= sc.nextLine();
	    			System.out.println("Customer Age:");
	    			int sAge=sc.nextInt();
	    			Customer cur= new Customer(sId,sName,sAge);
	    			alArr.add(cur);
	    		}
	    		break;
	    	case 2:
	    		cmi.displayAllCustomer(alArr);
	    		break;
	    	case 3:
	    		cmi.displayAllCustomerInDsecOrder(alArr);
	    		break;
	    	case 4:
	    		System.out.println("Enter The Customer Id");
	    		int sId=sc.nextInt();
	    		boolean result=cmi.updateTheCustomerAge(alArr, sId);
	    		if(result) {
	    			System.out.println("Update Sucessfully");
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
