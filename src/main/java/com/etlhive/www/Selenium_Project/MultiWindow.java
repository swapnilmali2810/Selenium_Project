package com.etlhive.www.Selenium_Project;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners (ListenerEvent.class)
public class MultiWindow {

@Test

public void mw () throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "/Users/swapnil/eclipse-workspace/Selenium_Project/chromedriver");
	WebDriver driver = new ChromeDriver ();
	driver.get("http://demo.automationtesting.in/Windows.html"); 
	WebElement win=driver.findElement(By.xpath("//*[@id='Tabbed']/a/button")); 
	String parent = driver.getWindowHandle();
	win.click();
	Thread.sleep(5000);
	Set <String> windows = driver.getWindowHandles();
	Iterator<String> ite = windows.iterator();
	while (ite.hasNext()) {
		
		String child = ite.next();
		if(!child.equals(parent)) {
			driver.switchTo().window(child);
			WebElement video = driver.findElement(By.name("lap1"));
			video.click();
			Thread.sleep(5000);
			driver.close();
		}
	}
	
	driver.switchTo().window(parent);
	WebElement link = driver.findElement(By.linkText("WebTable"));
	link.click();
	Thread.sleep(5000);
	driver.close();
	
	
}
	
}
