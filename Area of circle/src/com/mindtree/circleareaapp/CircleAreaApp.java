package com.mindtree.circleareaapp;
import java.util.*;

import com.mindtree.circleareaimpl.CircleAreaImpl;

public class CircleAreaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;
		double area;
		Scanner sc= new Scanner(System.in);
		r= sc.nextInt();
		System.out.println("the radius of circle"+ r);
		CircleAreaImpl obj= new CircleAreaImpl();
		area= obj.circleArea(r);
		System.out.println("Area of Circle "+ area);

	}

}
