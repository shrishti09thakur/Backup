package com.mindtree.customer.entity;

import java.util.ArrayList;

import com.mindtree.customer.Customer;

public interface CustomerService {
	void displayAllCustomer(ArrayList<Customer>alArr);
	void displayAllCustomerInDsecOrder(ArrayList<Customer>alArr);
	boolean updateTheCustomerAge(ArrayList<Customer>alArr,int Id);

}
