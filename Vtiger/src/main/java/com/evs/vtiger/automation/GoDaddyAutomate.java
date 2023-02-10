package com.evs.vtiger.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoDaddyAutomate {

	public static void main(String[] args)  {

		GoDaddyAutomate gda =new GoDaddyAutomate();
		//gda.testcase1();
		//gda.testcase2();
		//gda.testcase3();
		gda.testcase4();
	}
	
	public void testcase1() {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.Godaddy.com");
		driver.manage().window().maximize();
		driver.close();
	}
	public void testcase2()  {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://www.Godaddy.com");
		driver.manage().window().maximize();		
		String actualtittle = driver.getTitle();
		System.out.println(actualtittle);
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		driver.close();
	}
	public void testcase3() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.Godaddy.com");
		driver.manage().window().maximize();
	String actualtittle=driver.getTitle();
	String Expectedtittle="Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
	if(actualtittle.equalsIgnoreCase(Expectedtittle)) {
		System.out.println("Testcase is passed when your actual tittle matched");
	}else {
		System.out.println("Testcase is failed when your actual tittle not matched");		
	}
	String currenturl=driver.getCurrentUrl();
	String expectedurl="https://www.godaddy.com/en-in";
	if(currenturl.equalsIgnoreCase(expectedurl))  {
		System.out.println("Testcase is passed when your current Url matched");
	}else {
		System.out.println("Testcase is failed when your current url not matched");
	}
	//String pagesource=driver.getPageSource();
	//System.out.println(pagesource);
	driver.close();
	}
	public void testcase4() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.Godaddy.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//button[@id=\"id-d6f9deab-d554-45df-a52c-8a9ab53948b5\"]")).click();
		driver.findElement(By.xpath("//a[text()='Domain Name Search']")).click();
		Actions act=new Actions(driver);
		WebElement rightclick=driver.findElement(By.xpath("//input[@id=\"8469f0c3-e08f-4343-9756-ce0390b0d581\"]"));
		act.contextClick(rightclick).sendKeys(Keys.F12).build().perform();
		
	}

}
