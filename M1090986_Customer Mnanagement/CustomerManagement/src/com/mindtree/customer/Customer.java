package com.mindtree.customer;

public class Customer {
	private int sId;
	private String sName;
	private int sAge;
	
	public void setsId(int sId) {
	this.sId=sId;
	}
	public void setsName(String sName) {
		this.sName=sName;
	}

	public void setsAge(int sAge){
		this.sAge=sAge;
	}
	
	public Customer(int sId, String sName, int sAge) {
		this.sId=sId;
		this.sName=sName;
		this.sAge=sAge;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public int getsId() {
		return sId;
	}
	
	public String getsName() {
		return sName;
	}
	public int getsAge() {
		return sAge;
	}

}
