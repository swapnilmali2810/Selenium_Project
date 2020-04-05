package com.etlhive.www.Selenium_Project;

import java.util.Scanner;

public class PrimeNumber {

	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner (System.in);
		System.out.println ("Enter a number");
		int a =scn.nextInt();
		//scn.close();
		int i;
		boolean result = false;
		for (i=2;i<=a/2; i++) {
		
			if (a%i==0) {
				result= true;
				break;
			} 
		}
			if (result) {
			System.out.println (a + " is a not a prime number");
			}
			else {
				
				System.out.println (a + " is a prime number");
			}
		}

}
