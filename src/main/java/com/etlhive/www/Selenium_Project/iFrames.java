package com.etlhive.www.Selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class iFrames {

@Test (dataProvider = "tesdata", dataProviderClass = DPClass.class)

		public void iFrames (String url, String text) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/swapnil/eclipse-workspace/Selenium_Project/chromedriver");
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get(url);
		driver.switchTo().frame(0);
		WebElement body = driver.findElement(By.id("tinymce"));
		body.clear();
		body.sendKeys(text);
		Actions act = new Actions (driver);
		act.keyDown(Keys.TAB);
		act.keyUp(Keys.TAB);
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		WebElement file = driver.findElement(By.id("mceu_15-open"));
		file.click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
