package com.etlhive.www.Selenium_Project;

public class Test1 {
	
	int x=10;
	int y=20;
	
	
	public void sum () {
		
		int z= x+y;
		
		System.out.println("Addition of numbers is: "+z);

	}
	
	public void sum (int a, int b) {
		
		int z = a+b;
		
		System.out.println("Addition of numbers is: "+z);
	}
	

	public void sum (int p, int q, int r) {
		
		int z = p+q+r;
		
		System.out.println("Addition of numbers is: "+z);
	}
	
	public static void main(String[] args) {
		
		Test1 obj = new Test1();
		obj.sum();
		obj.sum(40,50);
		obj.sum(40,60,70);
		
	}

}
