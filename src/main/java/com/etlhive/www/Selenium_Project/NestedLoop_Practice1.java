package com.etlhive.www.Selenium_Project;

public class NestedLoop_Practice1 {

	public static void main(String[] args) {
		int n = 9;
		for (int i =0; i<n; i++) {
			if (i%2==0) {
			for (int j= n-i; j>1; j--) {
				
				System.out.print(" ");
			}
		
		for (int j =0; j<=i; j++) {
			
			System.out.print("* ");
		} System.out.println ();
			}
	}
	}

}
