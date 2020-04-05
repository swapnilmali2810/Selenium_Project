package www.etihive.home;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.etlhive.newtours.HomePage;
import com.etlhive.newtours.RegisterPage;


public class TC_01_UserRegistration {

@Test
	 void f1 () throws InterruptedException, IOException {
	//public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/swapnil/eclipse-workspace/Selenium_Project/chromedriver");
		WebDriver driver = new ChromeDriver ();
		// creating objects of base classes
		HomePage hm = new HomePage(driver);
		RegisterPage rp = new RegisterPage (driver);
		
		driver.manage().window().maximize();
		
		// test steps starts from here
		driver.get("http://newtours.demoaut.com");
		Assert.assertTrue(hm.clickonRegister(),"Clicking on Register link");
		Assert.assertTrue(rp.enterFirstName(), "Entering First Name");
		Assert.assertTrue (rp.enterLastName(), "Entering Last Name");
		Assert.assertTrue(rp.enterPhone(), "Entering phone number");
		Assert.assertTrue(rp.enterUserName(), "Entering Username");
		Assert.assertTrue(rp.enterAddress1(), "Entering address 1");
		Assert.assertTrue(rp.enterAddress2(), "Entering address2");
		Assert.assertTrue(rp.enterCity(), "Entering a City");
		Assert.assertTrue(rp.enterState(), "Entering a State");
		Assert.assertTrue(rp.enterPostCode(), "Entering a postcode");
		Assert.assertTrue(rp.selectCountry(), "Selecting Country");
		Assert.assertTrue(rp.enterUser(), "Entering a Username");
		Assert.assertTrue(rp.enterPassword(), "Entering a password");
		Assert.assertTrue(rp.enterConfirmPassword(), "Entering confirm password");
		Thread.sleep(5000);
		Random rm = new Random ();
		int x = rm.nextInt(99999);
		TakesScreenshot scr = ((TakesScreenshot)driver);
		File scrfile = scr.getScreenshotAs(OutputType.FILE);
		File destfile = new File ("/Users/swapnil/eclipse-workspace/" + x + ".png");
		FileHandler.copy(scrfile, destfile);

		driver.close();
		
	}

}
