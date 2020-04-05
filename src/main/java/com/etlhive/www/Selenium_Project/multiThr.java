package com.etlhive.www.Selenium_Project;

public class multiThr extends Thread

{

	public void run () {
		
		for (int i=1; i<=5; i++)
	
		{
		System.out.println (i);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}
	
	
	public static void main(String[] args) {

	multiThr t1 = new multiThr ();
	multiThr t2 = new multiThr ();
	t1.setPriority(MIN_PRIORITY);
	t2.setPriority(5);
	
	t1.start();
	t2.start();
	System.out.println(t1.getState());	
	System.out.println(t2.getState());
	
//	System.out.println(t1.getName());	
//	System.out.println(t2.getName());	
//	
//	t1.setName("FirstThread");
//	t2.setName("SecondThread");
//	
//	System.out.println(t1.getName());	
//	System.out.println(t2.getName());
//	
//	System.out.println(t1.getId());	
//	System.out.println(t2.getId());
	
	
	}
	
}
