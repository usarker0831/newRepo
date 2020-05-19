package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class P_O_Register extends P_O_Base{

	public P_O_Register(WebDriver driver) {
		super(driver);
		}
	
		@FindBy(xpath = "//a[text()='REGISTER']")
		WebElement clkRg;
		public void ClickRgis() {
			clkRg.click();
		}
		
		@FindBy(name = "firstName")
		WebElement fName;
		public void FirstName(String a) {
			fName.sendKeys(a);
		}
		
		@FindBy(name = "lastName")
		WebElement lName;
		public void LastName(String a) {
			lName.sendKeys(a);
		}
		
		@FindBy(xpath ="//input[@name='phone']")
		WebElement phone;
		public void PhoneNum(String a) {
			phone.sendKeys(a);
		}
		
		@FindBy(id = "userName")
		WebElement email;
		public void EMail(String x) {
			email.sendKeys(x);
		}
		
		@FindBy(name = "address1")
		WebElement add1;
		public void Address1(String x) {
			add1.sendKeys(x);
		}
		
		@FindBy(name = "address2")
		WebElement add2;
		public void Address2(String x) {
			add2.sendKeys(x);
		}
		
		@FindBy(xpath = "//input[@name='city']")
		WebElement city;
		public void City(String b) {
			city.sendKeys(b);
		}
		
		@FindBy(css = "input[name='state']")
		WebElement state;
		public void State(String b) {
			state.sendKeys(b);
		}
		
		@FindBy(name = "postalCode")
		WebElement pCode;
		public void postalCode(String b) {
			pCode.sendKeys(b);
		}		
				
		@FindBy (name = "country")
		WebElement cntry;
		public void Country(String y) {
			Select drop = new Select (cntry);			
			drop.selectByVisibleText(y);
		}
	
		@FindBy(xpath = "//input[@id='email']")
		WebElement usrnm;		
		public void UserName(String y) {
			usrnm.sendKeys(y);
		}
		
		@FindBy(css = "input[name='password']")
		WebElement pswrd;
		public void Password(String y) {
			pswrd.sendKeys(y);
		}
			
		@FindBy(css = "input[name='confirmPassword']")
		WebElement cfmpss;
		public void CnfrmPassword(String z) {
			cfmpss.sendKeys(z);
		}
		
		@FindBy(name = "register")
		WebElement sbmt;
		public void Submit() {
			sbmt.click();
		}
		
		@FindBy(partialLinkText = "Note")
		WebElement cnftxt;
		public String Confirmation() {
			return cnftxt.getText();
		}

}//End of Class
