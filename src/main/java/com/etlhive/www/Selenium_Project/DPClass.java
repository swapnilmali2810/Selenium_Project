package com.etlhive.www.Selenium_Project;

import org.testng.annotations.DataProvider;

public class DPClass {

@DataProvider (name = "testdata")
public static Object [] [] getDataFromHere () {
	
	return new Object [] [] {
		{"http://the-internet.herokuapp.com/iframe", "iFrame Test"},
		{"http://the-internet.herokuapp.com/iframe", "test data"}
		
	};
}
	
}
