package com.etlhive.www.Selenium_Project;

public class TryCatch {
		
		void divide ()
{
	try {
		//String S = "abc";
		
		int x = 100;
		int y = 0;
		//int p = Integer.valueOf(S);
		int z = x/y;
		
		System.out.println ("result of division is " +z);
		
	} catch (ArithmeticException ae) {
		
	System.out.println ("A number cannot be divide by Zero, please change the number");
	
		//ae.printStackTrace();
		int x = 100;
		int y = 10;
		int z = x/y;
		
		System.out.println ("result of division after correction is " +z);
		
		System.exit(0);
		
		} catch (NumberFormatException nfe) {
			
		System.out.println("A character string cannot be converted to number format, please provide a number");
		
	} finally {
		
		System.out.println ("This is finally getting printed");
	}
}
		public static void main(String[] args) {
			
			TryCatch a = new TryCatch();
			a.divide();
		}

	}
