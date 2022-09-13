package com.mindtree.StudentFile1;

import com.mindtree.StudentFileService.StudentFileService;

public class StudentFile1 implements Comparable<StudentFileService> {
	int id;
	int marks;
	String name;
	
	public void StudentFileService(int id, int marks, String name) {
		this.id=id;
		this.marks= marks;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks= marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}
	
   @Override
	public int compareTo(StudentFileService o) {
    return id;
	}
   

}
