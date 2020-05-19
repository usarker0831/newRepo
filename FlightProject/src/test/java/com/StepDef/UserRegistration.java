package com.StepDef;

//import java.io.FileInputStream;
//
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;

import com.Common.Utilities;
import com.PageObject.P_O_Register;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserRegistration extends Utilities{
	
	P_O_Register por;
	
	@Given("^I am on the application homepage$")
	public void i_am_on_the_application_homepage() throws Throwable {
		getDriver();
		driver.get("http://newtours.demoaut.com");
		String Title = driver.getTitle();
		System.out.println("Welcome Page Title: " + Title);
		Assert.assertEquals(Title, "Welcome: Mercury Tours");
		Thread.sleep(3000);
	    
	}

	@When("^I click on register link$")
	public void i_click_on_register_link(){
		por = new P_O_Register(driver);
		
		  por.ClickRgis(); 
		  String Title2 = driver.getTitle();
		  System.out.println("Registration Page Title: "+Title2);
		  Assert.assertEquals(Title2, "Register: Mercury Tours");
		 
	}

	@When("^I enter Informations$")
	public void i_enter_Informations() throws Throwable {
		
	    por.FirstName("Utpal");
	    por.LastName("Sarker");
	    por.PhoneNum("123-456-7890");
	    por.EMail("test@sample.com");
	    Thread.sleep(2000);
	    por.Address1("123, Example ST");
	    por.Address2("3rd Floor");
	    por.City("Woodside");
	    por.State("NY");
	    por.postalCode("12345");
	    por.Country("UNITED STATES");
	    Thread.sleep(2000);
	    por.UserName("usarker08");
	    por.Password("62812@Us");
	    por.CnfrmPassword("62812@Us");
	    Thread.sleep(2000);
	   
		
		/*
	    //Getting Data from Excel File..... (Comment all other @When codes)
	    
	    FileInputStream fis = new FileInputStream("./Excel/FlightReg.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet("RegDatas");
		int rowCont = s.getLastRowNum()-s.getFirstRowNum();
		for (int i = 1; i <= rowCont; i++) {
			Row row = s.getRow(i);
			
			por.ClickRgis();
			
			por.FirstName(row.getCell(0).getStringCellValue());
		    por.LastName(row.getCell(1).getStringCellValue());
		    por.PhoneNum(row.getCell(2).getStringCellValue());
		    por.EMail(row.getCell(3).getStringCellValue());
		    por.Address1(row.getCell(4).getStringCellValue());
		    por.Address2(row.getCell(5).getStringCellValue());
		    por.City(row.getCell(6).getStringCellValue());		    
		    por.State(row.getCell(7).getStringCellValue());
		    por.postalCode(row.getCell(8).toString()); //Have to take a look at it with Bhaiya. The Value adds ".0" at the end in the text field
		    por.Country(row.getCell(9).getStringCellValue());
		    por.UserName(row.getCell(10).getStringCellValue());
		    por.Password(row.getCell(11).getStringCellValue());
		    por.CnfrmPassword(row.getCell(12).getStringCellValue());
		    por.Submit();
		    Thread.sleep(2000);
		    ScreenShot("UserConformation");
		    Thread.sleep(1000);		   
		}//End of loop
		*/
	}

	@When("^I click on submit button$")
	public void i_click_on_submit_button() throws Throwable {
	   por.Submit();
	   ScreenShot("UserConfo"); 
	}

	@Then("^I find registration successful page$")
	public void i_find_registration_successful_page() throws Throwable {
	    String Confirmation = por.Confirmation();
	    System.out.println("Confirmation Message: "+Confirmation);
	    Thread.sleep(2000);
	    closeBrowser();
	}
	
}//End of Class
