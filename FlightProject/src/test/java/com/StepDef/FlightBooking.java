package com.StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

//import com.Common.Base;
import com.Common.Utilities;
import com.PageObject.P_O_Flight;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlightBooking extends Utilities {

	P_O_Flight pof;
	//Utilities util = new Utilities();
	

	@Given("^I am on the homepage$")
	public void i_am_on_the_homepage() throws Throwable {

		getDriver();
		driver.get("http://newtours.demoaut.com");
		String Title = driver.getTitle();
		System.out.println("Welcome Page Title: " + Title);
		Assert.assertEquals(Title, "Welcome: Mercury Tours");
		Thread.sleep(2000);

	}

	@Given("^Sign-in with valid UserName and Password$")
	public void sign_in_with_valid_UserName_and_Password() throws Throwable {

		SignIn();
		Thread.sleep(2000);
	}

	@Given("^Land in Flight Finder Page$")
	public void land_in_Flight_Finder_Page() throws Throwable {

		String Title = driver.getTitle();
		System.out.println("Flight Booking Page Title: " + Title);
		Assert.assertEquals(Title, "Find a Flight: Mercury Tours:");
		Thread.sleep(2000);

	}

	@When("^I choose all the options$")
	public void i_choose_all_the_options() throws Throwable {

		pof = new P_O_Flight(driver);
		pof.Radio(0);
		pof.PassengerCount("2");
		pof.Departure("New York");
		pof.FromMonth("June");
		pof.FromDay("28");
		pof.Arrival("Paris");
		pof.ToMonth("August");
		pof.ToDay("15");
		pof.Radio(4);
		pof.Airline("Blue Skies Airlines");
		pof.Continue();
		Thread.sleep(2000);
		pof.Radio(2);
		pof.Radio(5);
		pof.Continue2();
		Thread.sleep(2000);
	}

	@When("^I enter Payment Informations$")
	public void i_enter_Payment_Informations() throws Throwable {

		pof.PassFirstName("Utpal");
		pof.PassLastName("Sarker");
		pof.Meal1("Low Calorie");
		pof.Pass2FirstName("Sanchita");
		pof.Pass2LastName("Sarkar");
		pof.Meal2("Vegetarian");
		pof.CreditCard("Visa");
		pof.CardNumber("1234567890123456");
		pof.CardExpireyMonth("08");
		pof.CardExpireyYear("2010");
		pof.CreditCardFN("Utpal");
		pof.CreditCardMN("K");
		pof.CreditCardLN("Sarker");
		Thread.sleep(2000);
		pof.BillingAddress1("1234 Sample St");
		pof.BillingAddress2("23rd Floor");
		pof.BillingCity("Woodside");
		pof.BillingZip("12345");
		pof.BillingState("NY");
		pof.BillingCountry("UNITED STATES");
		Thread.sleep(2000);
		pof.CheckBox(1);
		pof.DeliveryAddress1("");
		pof.DeliveryAddress2("");
		pof.DeliveryCity("");
		pof.DeliveryState("");
		pof.DeliveryZip("");
		Thread.sleep(2000);
	}

	@When("^I click on SECURE PURCHASE button$")
	public void i_click_on_SECURE_PURCHASE_button() throws Throwable {
		driver.findElement(By.name("buyFlights")).click();
		Thread.sleep(2000);

	}

	@Then("^I find Flight Confirmation page$")
	public void i_find_Flight_Confirmation_page() throws Throwable {

		
		String confo = driver.findElement(By.xpath("//*[contains(text(), 'itinerary')]")).getText();
		String fc = driver.findElement(By.xpath("(//*[contains(text(), 'Flight')])[3]")).getText();
		String prc = driver.findElement(By.xpath("//*[contains(text(), 'Price')]")).getText();
		String amount = driver.findElement(By.xpath("(//*[contains(text(), 'USD')])[2]")).getText();
		System.out.println("Flight Confirmation Message: " + confo);
		System.out.println(fc);
		System.out.println(prc + amount);
		Assert.assertEquals(confo, "Your itinerary has been booked!");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,110)");
		Thread.sleep(1000);
		
		//util.ScreenShot("FlConfo");
		ScreenShot("Flight_Confirmation ");
		Thread.sleep(2000);

		closeBrowser();

	}

}// End of Class
