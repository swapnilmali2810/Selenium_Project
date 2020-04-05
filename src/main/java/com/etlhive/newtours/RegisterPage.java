package com.etlhive.newtours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import www.etlhive.utilities.CommonUtils;

public class RegisterPage extends CommonUtils{
	
	WebDriver driver;
	
	public RegisterPage (WebDriver driver) {
		
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (name = "firstName") WebElement fn;
	@FindBy (name = "lastName") WebElement ln;
	@FindBy (name = "phone") WebElement phn;
	@FindBy (id = "userName") WebElement un;
	@FindBy (name = "address1") WebElement adr1;
	@FindBy (name = "address2") WebElement adr2;
	@FindBy (name = "city") WebElement ct;
	@FindBy (name = "state") WebElement st;
	@FindBy (name = "postalCode") WebElement pcode;
	@FindBy (name = "country") WebElement cntrydd;
	@FindBy (name = "email") WebElement uname;
	@FindBy (name = "password") WebElement pswd;
	@FindBy (name = "confirmPassword") WebElement cpswd;
	
	
	public boolean enterFirstName() {
		
		return(enterSafelyIn (fn, "Ankur"));
	}

	public boolean enterLastName() {
		
		return(enterSafelyIn (ln, "Pandey"));
	}
	
	public boolean enterPhone() {
		
		return(enterSafelyIn (phn, "1234567890"));
	}
	
	public boolean enterUserName() {
		
		return(enterSafelyIn (un,"swapnil.mali@outlook.com"));
	}
	
	public boolean enterAddress1() {
		
		return(enterSafelyIn (adr1,"Test Road"));
	}
	
	public boolean enterAddress2() {
		
		return(enterSafelyIn (adr2,"Test Area"));
	}
	
	public boolean enterCity() {
		
		return(enterSafelyIn (ct,"Pune"));
	}
	
	public boolean enterState() {
		
		return(enterSafelyIn (st,"Maharashtra"));
	}
	
	public boolean enterPostCode() {
		
		return(enterSafelyIn (pcode,"411057"));
	}
	
	public boolean selectCountry () {
		return(selectFromDropdown (cntrydd, "INDIA "));
	}
	
	public boolean enterUser() {
		
		return(enterSafelyIn (uname,"Swapnil.Mali"));
	}

	
	public boolean enterPassword() {
		
		return(enterSafelyIn (pswd,"Test@1234"));
	}
	
	public boolean enterConfirmPassword() {
		
		return(enterSafelyIn (cpswd,"Test@1234"));
	}
}

