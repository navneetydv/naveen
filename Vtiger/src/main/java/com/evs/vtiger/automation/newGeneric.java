package com.evs.vtiger.automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.google.common.io.Files;

public class newGeneric {

	
	public static void toverifyClick(WebDriver driver,ExtentTest test,String xpath ) throws IOException {
		try {
		WebElement we=driver.findElement(By.xpath(xpath));
		if(we.isDisplayed()==true) {
			test.log(Status.INFO, "Element is visible");
			if(we.isEnabled()==true) {
				test.log(Status.INFO, "Element is enabled");
				we.click();
		
		}else 
			test.log(Status.FAIL, "Element is not visible");
		}else {
			test.log(Status.FAIL, "Element is not Enabled");
		}}catch(Exception e) {
			TakesScreenshot tss=(TakesScreenshot)driver;
			File from=tss.getScreenshotAs(OutputType.FILE);
			File to=new File("rahul.png");
			Files.copy(from, to);
			
			
		}
}
	public static void toverifyTextBox() {
		
	}
	}
