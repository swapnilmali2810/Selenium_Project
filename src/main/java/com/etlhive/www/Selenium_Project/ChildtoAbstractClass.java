package com.etlhive.www.Selenium_Project;

public class ChildtoAbstractClass extends AbstractClass{

	@Override
	void sum() {
		int a = 10;
		int b = 20;
		int c = a+b;
		
		System.out.println("result of sum is " +c);
		
	}

	@Override
	void multiple() {
		int p = 20*30;
		
	System.out.println ("result of multiplication is " +p);
		
	}
	
	void division ()
	{
		try {
			
			int q = 20/0;
			System.out.println("result of division "+q);
		} catch (ArithmeticException ae) {
			System.out.println ("Number cannot be divided by zero");
		}
	}
	
	public static void main(String[] args) {
		
		ChildtoAbstractClass a = new ChildtoAbstractClass ();
		
		a.division();
		a.sum();
		a.multiple();

		}

}
