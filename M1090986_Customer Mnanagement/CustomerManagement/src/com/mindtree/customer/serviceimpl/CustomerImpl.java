package com.mindtree.customer.serviceimpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import com.mindtree.customer.Customer;
import com.mindtree.customer.entity.CustomerService;
import com.mindtree.customer.namecomparator.NameComparator;

public class CustomerImpl implements CustomerService {

	@Override
	public void displayAllCustomer(ArrayList<Customer> alArr) {
		Iterator<Customer>cm=alArr.iterator();
		System.out.println("All Customer");
		while(cm.hasNext()) {
			Customer cmg=cm.next();
			System.out.println("ID="+cmg.getsId()+"  "+ "NAME="+cmg.getsName()+"  "+ "AGE="+cmg.getsAge());
		}
		
	}

	@Override
	public void displayAllCustomerInDsecOrder(ArrayList<Customer> alArr) {
		Collections.sort(alArr, new NameComparator());
		Iterator<Customer>cm=alArr.iterator();
		System.out.println("All Customer");
		while(cm.hasNext()) {
			Customer cmg=cm.next();
			System.out.println("ID="+cmg.getsId()+"  "+ "NAME="+cmg.getsName()+"  "+ "AGE="+cmg.getsAge());
		}
		
	}

	@Override
	public boolean updateTheCustomerAge(ArrayList<Customer> alArr, int Id) {
		Scanner keyboard=new Scanner(System.in);
		boolean result=true;
		int size=alArr.size();
		Customer c=null;
		int index=0;
		for(int i=0;i<size;i++) {
			if(alArr.get(i).getsId()==Id) {
				c=alArr.get(i);
				index=i;
				break;
			}
		}
		int choice;
		System.out.println("Enter the Updated Age=");
		int Age=keyboard.nextInt();
		c.setsAge(Age);
		alArr.set(index, c);
		return result;
	}

}
