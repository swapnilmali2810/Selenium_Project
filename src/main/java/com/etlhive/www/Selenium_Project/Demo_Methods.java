package com.etlhive.www.Selenium_Project;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Methods {

	
@Test
	public void Test () {
		
		System.setProperty("webdriver.chrome.driver", "/Users/swapnil/eclipse-workspace/Selenium_Project/chromedriver");
		WebDriver driver = new ChromeDriver ();
		System.out.println("Test method is running");
		driver.close();
	}
}
