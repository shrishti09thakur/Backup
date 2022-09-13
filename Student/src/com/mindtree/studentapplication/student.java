package com.mindtree.studentapplication;

public class student implements Comparable<student>{
	int id;
	int mark;
	String name;
	public student(int id,int mark, String name) {
		this.id=id;
		this.mark=mark;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getMark() {
		return mark;
	}
	public void setMarks(int mark) {
		this.mark= mark;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}


	@Override
	public int compareTo(student o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(name) ;
	}

}
