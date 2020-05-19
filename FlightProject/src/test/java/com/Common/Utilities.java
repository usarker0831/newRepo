package com.Common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Utilities extends Base  {

	public void driver () {
		getDriver();
	}
	
	public void SignIn() {
		driver.findElement(By.name("userName")).sendKeys("usarker08");
		driver.findElement(By.name("password")).sendKeys("62812@Us");
		driver.findElement(By.name("login")).click();
	}
	
	public void ScreenShot(String Filename) throws IOException {
		TakesScreenshot tss = (TakesScreenshot) driver;
		File fl = tss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fl,
		new File("D:\\EclipesScripts 2019-06\\FlightProject\\ScreenShots\\"+Filename+".png"));
	}
	
	public void ExcelConnection(String a, String b, int x, int y) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(a);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet(b);
		String ss = s.getRow(x).getCell(y).getStringCellValue();
		
		//a = Excel File Path, b = Sheet name from the Excel File
		//x = Row #, y = cell #
		
	}

}// End of Class
