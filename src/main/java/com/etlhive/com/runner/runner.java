package com.etlhive.com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith (Cucumber.class)

@CucumberOptions (features= "Features", glue="com.etlhive.com.cucumber")
public class runner {

	
}
