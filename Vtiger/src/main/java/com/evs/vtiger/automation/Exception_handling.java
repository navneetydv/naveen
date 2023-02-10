package com.evs.vtiger.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exception_handling {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();
		
		driver.findElement(By.linkText("Marketing")).click();
		driver.findElement(By.xpath("//img[@title=\"Create Campaign...\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"campaignname\"]")).sendKeys("lalbahdur");
		WebElement we=driver.findElement(By.xpath("//select[@name=\"campaigntype\"]"));
		Select se=new Select(we);
		se.selectByVisibleText("Email");
	
		try {
			
		}catch(Exception e) {
			
		}
		 
	}

}
