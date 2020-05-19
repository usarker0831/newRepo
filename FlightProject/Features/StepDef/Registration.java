package com.StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import com.Common.Base;
import com.PageObject.P_O_Register;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Registration extends Base {
	
	P_O_Register por;
	
	@Given("^I am on the application homepage$")
	public void i_am_on_the_application_homepage() throws Throwable {
		getDriver();
		driver.get("http://newtours.demoaut.com");
	    String Title = driver.getTitle();
	    System.out.println("Welcome Page Title: "+Title);
	    Assert.assertEquals(Title, "Welcome: Mercury Tours");
	    
	}

	@When("^I click on register link$")
	public void i_click_on_register_link() throws Throwable {
		por = new P_O_Register(driver);
		
	    por.ClickRegis();
	    String Title = driver.getTitle();
	    System.out.println("Registration Page Title: "+Title);
	    Assert.assertEquals(Title, "Register: Mercury Tours");
	    Thread.sleep(3000);
	}

	@When("^I enter Informations$")
	public void i_enter_Informations() throws Throwable {
	    
	    por.FirstName("Utpal");
	    por.LastName("Sarker");
	    por.PhoneNum("813-748-0730");
	    por.EMail("usarker08@yahoo.com");
	    Thread.sleep(3000);
	    
	    por.Address1("72-19, 45th Ave");
	    por.Address2("3rd Floor");
	    por.City("Woodside");
	    por.State("NY");
	    por.postalCode("11377");
	    por.CountryDrpDwn("UNITED STATES");
	    por.UserName("usarker08");
	    por.Password("62812@Us");
	    por.CnfrmPassword("62812@Us");	    
	    
	}

	@When("^I click on submit button$")
	public void i_click_on_submit_button() throws Throwable {
	    
	    por.Submit();
	    Thread.sleep(3000);
	}

	@Then("^I find registration successful page$")
	public void i_find_registration_successful_page() throws Throwable {
	    String confirmation = por.Confirmation();
	    System.out.println("Confirmation Message: "+confirmation);
	    Assert.assertEquals(confirmation, "Note: Your user name is usarker08.");
	    Thread.sleep(2000);
	    closeBrowser();
	    
	}
	
	

}//End of Class
