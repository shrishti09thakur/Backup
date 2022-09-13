package com.mindtree.studentdetail;

public class detail {
    private int sId;
    private int marks;
	private String sName;
	public void setId(int sId) {
	this.sId=sId;
	}
	public void setMarks(int marks){
		this.marks=marks;
	}
	public void setName(String sName) {
		this.sName=sName;
	}
	public detail() {}
	public detail(int sId,int marks, String sName) {
		this.sId=sId;
		this.marks=marks;
		this.sName=sName;
		
	}
	public int getId() {
		return sId;
	}
	public int getMark() {
		return marks;
	}
	public String getName() {
		return sName;
	}
	

}
