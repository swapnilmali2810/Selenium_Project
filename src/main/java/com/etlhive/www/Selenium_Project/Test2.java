package com.etlhive.www.Selenium_Project;

public class Test2 extends Test1{


	int x = 10;
	int y= 20;
	
	
	public void sum () {
		
	int z = x+y;
	
	System.out.println("Addition of numbers is: "+z);
		
	}
	
	
	
	public static void main(String[] args) {
		Test2 obj = new Test2();
		
		obj.sum();

	}

}
