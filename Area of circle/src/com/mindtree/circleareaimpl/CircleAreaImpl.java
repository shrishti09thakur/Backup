package com.mindtree.circleareaimpl;
import com.mindtree.circleareaservices.*;

public class CircleAreaImpl implements CircleAreaServices {


	@Override
	public double circleArea(int r) {
		double area= (r*r)* Math.PI;
		return area;
	}

}
