package com.evs.vtiger.automation;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreports {

	public static void main(String[] args) {

		File fileobj = new File("C:\\Users\\Navnit\\eclipse-workspace\\myworkspace\\Vtiger\\MyReport.html");
		ExtentSparkReporter htmlReports = new ExtentSparkReporter(fileobj);
		ExtentReports extntRepo = new ExtentReports();
		extntRepo.attachReporter(htmlReports);

		extntRepo.setSystemInfo("OS name", System.getProperty("os.name"));
		extntRepo.setSystemInfo("user name", System.getProperty("user.name"));
		extntRepo.setSystemInfo("Server Name","QA Server");

		ExtentTest extest = extntRepo.createTest("Tc001");

		WebDriver driver=new ChromeDriver();
		extest.log(Status.INFO,"Chrome Browser Launch Successfully");
 
		driver.get("http://localhost:8888"); 
		extest.log(Status.INFO,"Url(localhost:8888)hitted successfully");
		
		WebElement weUsernamebox = driver.findElement(By.name("user_name"));
		boolean usernameboxVisiblity = weUsernamebox.isDisplayed();
		if (usernameboxVisiblity == true) {
			extest.log(Status.PASS, "UserNameBox is visible or login page");
		} else {
			extest.log(Status.FAIL, "UserNameBox is not visible or login page");
		}
		extntRepo.flush();
		
	}
}
