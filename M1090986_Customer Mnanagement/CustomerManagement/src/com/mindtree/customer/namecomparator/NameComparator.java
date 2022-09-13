package com.mindtree.customer.namecomparator;

import java.util.Comparator;

import com.mindtree.customer.Customer;

public class NameComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		
		return o1.getsName().compareToIgnoreCase(o2.getsName());
	}

}
