package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class P_O_Base {
	WebDriver driver;
	
	public P_O_Base(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}//End of Method

}//End of Class
