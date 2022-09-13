package com.mindtree.employeeservice;

public class EmployeeService implements Comparable<EmployeeService> {
	private int Id;
	private String Name;
	private int Age;
	private int Salary;
	
	public void setId(int Id) {
	this.Id=Id;
	}
	public void setName(String Name) {
		this.Name=Name;
	}

	public void setAge(int Age){
		this.Age=Age;
	}
	public void setSalary(int Salary){
		this. Salary= Salary;
	}
	public EmployeeService(int Id, String Name, int Age, int Salary) {
		this.Id=Id;
		this.Name=Name;
		this.Age=Age;
		this.Salary=Salary;
	}
	public int getId() {
		return Id;
	}
	
	public String getName() {
		return Name;
	}
	public int getAge() {
		return Age;
	}
	public int getSalary() {
		return Salary;
	}
	
	@Override
	public int compareTo(EmployeeService o) {
		return this.Name.compareTo(o.Name);
	}
	

}
