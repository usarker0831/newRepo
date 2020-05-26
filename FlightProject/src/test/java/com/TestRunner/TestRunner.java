package com.TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"Features"},
		glue = "com.StepDef",
		//tags = "@userRegistration",
		tags = "@flightBooking",
		plugin = "pretty",
		monochrome=true
		)


public class TestRunner extends AbstractTestNGCucumberTests {

}
