package com.etlhive.www.Selenium_Project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/swapnil/eclipse-workspace/Selenium_Project/chromedriver");
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("http://thedemosite.co.uk/login.php");
		
		WebElement login = driver.findElement(By.name("FormsButton2"));
		Thread.sleep(2000);
		login.click();
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		al.accept();
		Thread.sleep(2000);
		driver.close();
		
	}

}
