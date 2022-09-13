package com.mindtree.studentimpl;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

import com.mindtree.studentdetail.detail;
import com.mindtree.studentservice.StudentService;

public class StudentDetailImpl implements StudentService {

	@Override
	public void displayAllDetail(ArrayList<detail> stArr) {
		// TODO Auto-generated method stub
		Iterator<detail> ir= stArr.iterator();
		System.out.println("Student Detail");
		while(ir.hasNext()) {
			detail st= ir.next();
			System.out.println("Student Id = "+ st.getId()+"Student Name = "+ st.getsName()+"Student Mark = "+ st.getMarks());
			
		
		
	}

	@Override
	public void displayinAscOrder(ArrayList<detail> stArr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean updateStudentRecord(ArrayList<detail> stArr, int id) {
		// TODO Auto-generated method stub
		return false;
	}
	
}

