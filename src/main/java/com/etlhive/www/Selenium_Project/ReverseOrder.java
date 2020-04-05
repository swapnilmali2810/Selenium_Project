package com.etlhive.www.Selenium_Project;

public class ReverseOrder {

	public static void main(String[] args) {
		
		String str = "I am learning Java";
		
		String a [] = str.split ("");
		
		String rev = "";
		
		int n = a.length;
		
		for (int i = n-1; i>=0; i--) {
			
			rev = rev+a[i] + "";
		
		} System.out.println (rev);
	}

}
