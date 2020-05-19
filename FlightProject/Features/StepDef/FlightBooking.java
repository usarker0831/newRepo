package com.StepDef;

import org.testng.Assert;

import com.Common.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlightBooking extends Base {
	
	@Given("^I am on the application homepage$")
	public void i_am_on_the_application_homepage() throws Throwable {
		getDriver();
		driver.get("http://newtours.demoaut.com");
	    String Title = driver.getTitle();
	    System.out.println("Welcome Page Title: "+Title);
	    Assert.assertEquals(Title, "Welcome: Mercury Tours");
		
	}
	
	@Given("^Sign-in with valid UserName and Password$")
	public void sign_in_with_valid_UserName_and_Password() throws Throwable {
	    
	    
	}

	@Given("^Land in Flight Finder Page$")
	public void land_in_Flight_Finder_Page() throws Throwable {
	    
	    
	}

	@When("^I choose all the options$")
	public void i_choose_all_the_options() throws Throwable {
	    
	    
	}

	@When("^I enter Payment Informations$")
	public void i_enter_Payment_Informations() throws Throwable {
	    
	    
	}

	@When("^I click on SECURE PURCHASE button$")
	public void i_click_on_SECURE_PURCHASE_button() throws Throwable {
	    
	    
	}

	@Then("^I find Flight Confirmation page$")
	public void i_find_Flight_Confirmation_page() throws Throwable {
	    
	    
	}

}//End of Class
