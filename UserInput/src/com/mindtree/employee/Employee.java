package com.mindtree.employee;

public class Employee {

	private int sId;
	private String sName;
	private int sAge;
	private int sSalary;
	
	public void setsId(int sId) {
	this.sId=sId;
	}
	public void setsName(String sName) {
		this.sName=sName;
	}

	public void setsAge(int sAge){
		this.sAge=sAge;
	}
	public void setsSalary(int sSalary){
		this. sSalary= sSalary;
	}
	public Employee(int sId, String sName, int sAge, int sSalary) {
		this.sId=sId;
		this.sName=sName;
		this.sAge=sAge;
		this.sSalary=sSalary;
	}
	public Employee() {
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
	public int getsSalary() {
		return sSalary;
	}

}

