package com.mindtree.studentservice;

import java.util.ArrayList;

import com.mindtree.studentdetail.detail;

public interface StudentService {
	void displayAllDetail(ArrayList<detail> stArr);
	void displayinAscOrder(ArrayList<detail> stArr);
	boolean updateStudentRecord(ArrayList<detail> stArr,int id);
	
}
