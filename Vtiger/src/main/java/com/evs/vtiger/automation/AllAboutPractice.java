package com.evs.vtiger.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllAboutPractice {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http:www.localhost:8888");
	
try {
	System.out.println(10/0);
}finally {
	try {
	}catch(Exception n) {
		System.out.println("file");	
		}
	}
}
}
