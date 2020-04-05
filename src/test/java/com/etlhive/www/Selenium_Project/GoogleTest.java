package com.etlhive.www.Selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/swapnil/eclipse-workspace/Selenium_Project/chromedriver");
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com");
//		WebElement footer = driver.findElement(By.className("footer"));
//		String footerdetails = footer.getText();
//		System.out.println(footerdetails);
		WebElement reg = driver.findElement(By.linkText("REGISTER"));
		reg.click();
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
//		driver.close();
//	//	Thread.sleep(5000);
		if(driver.getTitle().equalsIgnoreCase("Register: Mercury Tours")) 
		{
		WebElement fname = driver.findElement(By.name("firstName"));
		fname.sendKeys("Swapnil");
		WebElement lname = driver.findElement(By.name("lastName"));
		lname.sendKeys("Mali");
		WebElement phn = driver.findElement(By.name("phone"));
		phn.sendKeys("9860488448");
		WebElement email = driver.findElement(By.id("userName"));
		email.sendKeys("swapnila.mali@gmail.com");
		WebElement adrs1 = driver.findElement(By.name("address1"));
		adrs1.sendKeys("A-604, Goldfinger Avenir");
		WebElement adrs2 = driver.findElement(By.name("address2"));
		adrs2.sendKeys("Near Edden Garden Society");
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Wakad, Pune");
		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("Maharashtra");
		WebElement pcode = driver.findElement(By.name("postalCode"));
		pcode.sendKeys("411057");
//	//	WebElement cnty = driver.findElement(By.name("country"));
		
//		
		Thread.sleep(5000);
		driver.close();
		} 
		else {
		
		driver.close();
		throw new RuntimeException("Register page is not found");
}
		
	}

}
 