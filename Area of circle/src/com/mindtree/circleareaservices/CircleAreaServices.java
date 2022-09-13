package com.mindtree.circleareaservices;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

import com.mindtree.studentdetail.detail;
import com.mindtree.studentimpl.StudentDetailImpl;
import com.mindtree.studentimpl.StudentDetailImpl.DisplayName;

public interface CircleAreaServices {
	public double circleArea(int r);

}

@Override
public void displayallDetail(ArrayList<detail> strArr) {
	// TODO Auto-generated method stub
	Iterator<detail> S1= strArr.iterator();
	System.out.println("Student Detail");
	while(S1.hasNext()) {
		detail stu= S1.next();
		System.out.println("Student Id = "+ stu.getId());
		System.out.println("Student Name = "+ stu.getName());
		System.out.println("Student Mark = "+ stu.getMark());
	}
	
}

@Override
public void displayinAscOrder(ArrayList<detail> strArr) {
	// TODO Auto-generated method stub
	Collections.sort(strArr, new DisplayName());
	Iterator<detail> S1= strArr.iterator();
	System.out.println("Student Detail");
	while(S1.hasNext()) {
		detail stu= S1.next();
		System.out.println("Student Id = "+ stu.getId());
		System.out.println("Student Name = "+ stu.getName());
		System.out.println("Student Mark = "+ stu.getMark());	
	}
	
}

@Override
public boolean updatedetail(ArrayList<detail> strArr, int id) {
	// TODO Auto-generated method stub
	Scanner sc= new Scanner(System.in);
	boolean result= false;
	int size = strArr.size();
	detail s=null;
	int index=0;
	for(int i=0;i<size;i++) {
		if(strArr.get(i).getId()==id) {
			s= strArr.get(i);
			index++;
			break;
		}
	}
	int choice;
	System.out.println("Enter 1 for name Update\n Enter 2 for marks Update \n Enter 3 for Exit");
	choice=sc.nextInt();
	sc.nextLine();
	if(choice==3){
		result =false;
	}
	else if(choice ==1) {
		System.out.println("Enter name: ");
		String name= sc.nextLine();
		s.setName(name);
		strArr.set(index, s);
		result= true;
	}
	else if(choice==2) {
		System.out.println("Enter marks: ");
		int marks= sc.nextInt();
		s.setMarks(marks);
		strArr.set(index, s);
		result= true;
	}
	else {
		System.out.println("Wrong Input,Try Again");
	}
	return result;


}
class DisplayName implements Comparator<detail>{

@Override
public int compare(detail o1, detail o2) {
	// TODO Auto-generated method stub
	return o1.getName()StudentDetailImpl.compareToIgnoreCase(o2.getName());
}
 
}
@Override
public void displayAllDetail(ArrayList<detail> stArr) {
// TODO Auto-generated method stub

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
