package com.PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class P_O_Flight extends P_O_Base {

	public P_O_Flight(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//input[@type = 'radio']")
	List<WebElement> rdo;
	public void Radio(int a) {
		List<WebElement> Radio = rdo;
		Radio.get(a).click();
	}
	
	@FindBy (name = "fromPort")
	WebElement depart;
	public void Departure(String a) {
		Select dprt = new Select (depart);
		dprt.selectByVisibleText(a);
	}
	
	@FindBy (name = "passCount")
	WebElement psscnt;
	public void PassengerCount(String a) {
		Select drop = new Select (psscnt);			
		drop.selectByVisibleText(a);
	}
	
	@FindBy (name = "fromMonth")
	WebElement frmmn;
	public void FromMonth(String a) {
		Select dprt = new Select (frmmn);
		dprt.selectByVisibleText(a);
	}
	
	@FindBy (name = "fromDay")
	WebElement frmDy;
	public void FromDay(String b) {
		Select dprt = new Select (frmDy);
		dprt.selectByVisibleText(b);
	}
	
	@FindBy (name = "toPort")
	WebElement arv;
	public void Arrival(String b) {
		Select arrv = new Select (arv);
		arrv.selectByVisibleText(b);
	}
	
	@FindBy (name = "toMonth")
	WebElement toMnt;
	public void ToMonth(String b) {
		Select tomn = new Select (toMnt);
		tomn.selectByVisibleText(b);
	}
	
	@FindBy (name = "toDay")
	WebElement tody;
	public void ToDay(String c) {
		Select toDay = new Select (tody);
		toDay.selectByVisibleText(c);
	}
	
	@FindBy(name = "airline")
	WebElement arlin;
	public void Airline(String c) {
		Select airline = new Select (arlin);
		airline.selectByVisibleText(c);
	}
	
	@FindBy (css = "input[name = 'findFlights']")
	WebElement cont;
	public void Continue() {
		cont.click();
	}
	
	@FindBy (name = "reserveFlights")
	WebElement cont2;
	public void Continue2() {
		cont2.click();
	}
	
	@FindBy (name = "passFirst0")
	WebElement pssFN;
	public void PassFirstName(String x) {
		pssFN.sendKeys(x);;
	}
	
	@FindBy (name = "passLast0")
	WebElement pssLN;
	public void PassLastName(String x) {
		pssLN.sendKeys(x);;
	}
	
	@FindBy (xpath = "//select[@name='pass.0.meal']")
	WebElement pssml;
	public void Meal1(String x) {
		Select meal = new Select (pssml);
		meal.selectByVisibleText(x);
	}
	
	@FindBy (name = "passFirst1")
	WebElement pssFN1;
	public void Pass2FirstName(String y) {
		pssFN1.sendKeys(y);;
	}
	
	@FindBy (name = "passLast1")
	WebElement pssLN1;
	public void Pass2LastName(String y) {
		pssLN1.sendKeys(y);;
	}
	
	@FindBy (xpath = "//select[@name='pass.1.meal']")
	WebElement pssml1;
	public void Meal2(String y) {
		Select meal = new Select (pssml1);
		meal.selectByVisibleText(y);
	}
	
	@FindBy (css = "select[name = 'creditCard']")
	WebElement cCard;
	public void CreditCard(String z) {
		Select cCrd = new Select (cCard);
		cCrd.selectByVisibleText(z);
	}
	
	@FindBy (name = "creditnumber")
	WebElement cNum;
	public void CardNumber(String z) {
		cNum.sendKeys(z);
	}
	
	@FindBy (name = "cc_exp_dt_mn")
	WebElement crdEpxMn;
	public void CardExpireyMonth(String z) {
		Select expMn = new Select (crdEpxMn);
		expMn.selectByVisibleText(z);
	}
	
	@FindBy (name = "cc_exp_dt_yr")
	WebElement crdEpxYr;
	public void CardExpireyYear(String d) {
		Select expYr = new Select (crdEpxYr);
		expYr.selectByVisibleText(d);
	}
	
	@FindBy (name = "cc_frst_name")
	WebElement ccFstNm;
	public void CreditCardFN(String d) {
		ccFstNm.sendKeys(d);
	}
	
	@FindBy (name = "cc_mid_name")
	WebElement ccMdNm;
	public void CreditCardMN(String d) {
		ccMdNm.sendKeys(d);
	}
	
	@FindBy (name = "cc_last_name")
	WebElement ccLstNm;
	public void CreditCardLN(String d) {
		ccLstNm.sendKeys(d);
	}
	
	@FindBy (css = "input[name='billAddress1']")
	WebElement billAdd1;
	public void BillingAddress1(String e) {
		billAdd1.clear();
		billAdd1.sendKeys(e);
	}
	
	@FindBy (css = "input[name='billAddress2']")
	WebElement billAdd2;
	public void BillingAddress2(String e) {
		billAdd2.clear();
		billAdd2.sendKeys(e);
	}
	
	@FindBy (css = "input[name='billCity']")
	WebElement billCity;
	public void BillingCity(String e) {
		billCity.clear();
		billCity.sendKeys(e);
	}
	
	@FindBy (css = "input[name='billState']")
	WebElement billSt;
	public void BillingState(String f) {
		billSt.clear();
		billSt.sendKeys(f);
	}
	
	@FindBy (css = "input[name='billZip']")
	WebElement billZip;
	public void BillingZip(String f) {
		billZip.clear();
		billZip.sendKeys(f);
	}
	
	@FindBy (name = "billCountry")
	WebElement billCntr;
	public void BillingCountry(String f) {
		Select cntry = new Select (billCntr);
		cntry.selectByVisibleText(f);
	}
	
	@FindBy(xpath = "//input[@type = 'checkbox']")
	List<WebElement> chk;
	public void CheckBox(int a) {
		List<WebElement> check = chk;
		check.get(a).click();
	}
	
	@FindBy (css = "input[name='delAddress1']")
	WebElement delAdd1;
	public void DeliveryAddress1(String g) {
		delAdd1.clear();
		delAdd1.sendKeys(g);
	}
	
	@FindBy (css = "input[name='delAddress2']")
	WebElement delAdd2;
	public void DeliveryAddress2(String g) {
		delAdd2.clear();
		delAdd2.sendKeys(g);
	}
	
	@FindBy (css = "input[name='delCity']")
	WebElement delCt;
	public void DeliveryCity(String g) {
		delCt.clear();
		delCt.sendKeys(g);
	}
	
	@FindBy (css = "input[name='delState']")
	WebElement delSt;
	public void DeliveryState(String u) {
		delSt.clear();
		delSt.sendKeys(u);
	}
	
	@FindBy (css = "input[name='delZip']")
	WebElement delZip;
	public void DeliveryZip(String u) {
		delZip.clear();
		delZip.sendKeys(u);
	}
	
	@FindBy (name = "delCountry")
	WebElement delCnt;
	public void DeliveryCountry(String u) {
		Select cntry = new Select (delCnt);
		cntry.selectByVisibleText(u);
	}
	
	@FindBy (name = "buyFlights")
	WebElement buyflt;
	public void SecurePurchse() {
		buyflt.click();
	}
	
	@FindBy(xpath = "//*[contains(text(), 'itinerary')]")
	WebElement cnftxt;
	public String FlightConfirmation() {
		return cnftxt.getText();
	}
		
}//End of Class
