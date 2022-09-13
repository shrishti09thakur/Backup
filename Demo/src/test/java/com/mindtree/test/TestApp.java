package com.mindtree.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mindtreedemo.App;

public class TestApp {
	@Test
	
	public void testlogin1() {
		App myapp=new App();
		Assert.assertEquals(0, myapp.userLogin("shrishti", "shri@123"));
	}
	@Test
	public void testlogin2() {
		App myapp=new App();
		Assert.assertEquals(1, myapp.userLogin("shrishti", "shri@123"));
	}
	

}