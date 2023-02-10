package com.evs.vtiger.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framework {
	
	static WebDriver driver;
	public static void click(String LocatororXpath) {
		driver = new ChromeDriver();
		WebElement webObj= driver.findElement(By.xpath(LocatororXpath));
		webObj.clear();
		webObj.click();
			}
	public static void sendkeys(String Locatorxpath) {
		driver = new ChromeDriver();
		WebElement weobj2= driver.findElement(By.xpath(Locatorxpath));
		weobj2.sendKeys();
	}
	public static void main(String[] args) {
		
		click("");
	}
}
