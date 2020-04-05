package com.etlhive.newtours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import www.etlhive.utilities.CommonUtils;

public class HomePage extends CommonUtils {

	WebDriver driver;	
	
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (linkText="SIGN-ON") WebElement signon;
	@FindBy (linkText="REGISTER") WebElement register;
	@FindBy (linkText="SUPPORT") WebElement support;
	@FindBy (linkText="CONTACT") WebElement contact;
	@FindBy (linkText="Home") WebElement home;
	@FindBy (linkText="Flights") WebElement flights;
	@FindBy (linkText="Hotels") WebElement hotels;
	@FindBy (linkText="Car Rentals") WebElement carrentals;
	@FindBy (linkText="Cruises") WebElement cruises;
	@FindBy (linkText="Destinations") WebElement destinations;
	@FindBy (linkText="Vacations") WebElement vacations;
	
	

	public boolean clickonRegister () {
		
		return (clickSafelyOn (register));
	}
	
	public void clickonSignOn () {
		
		clickSafelyOn (signon);
	}
	
	public void clickonSupport () {
		
		clickSafelyOn (support);
	}
	
	public void clickonContact () {
		
		clickSafelyOn (contact);
	}
}
