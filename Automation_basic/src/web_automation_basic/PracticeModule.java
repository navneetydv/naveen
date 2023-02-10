package web_automation_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeModule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Navnit\\eclipse-workspace\\myworkspace\\Automation_basic\\driver\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
	    driver.get("http://localhost:8888/");
	
	    driver.findElement(By.name("user_name")).sendKeys("admin");
	    
	    driver.findElement(By.name("user_password")).sendKeys("admin");
	    
	    driver.findElement(By.name("Login")).click();

	    driver.findElement(By.xpath("//a[text()='Tools']")).click();
	    
	    driver.findElement(By.xpath("//a[text()='Documents']")).click();
	    
	    driver.findElement(By.xpath("//img[@title=\"Create Document...\"]")).click();
	    
	    driver.findElement(By.xpath("//input[@name=\"notes_title\"]")).sendKeys("TCS");
	    
	   WebElement we= driver.findElement(By.xpath("//select[@name=\"filelocationtype\"]"));
	   
	   Select se=new Select(we);
	   se.selectByVisibleText("Internal "); 
	   
	   driver.findElement(By.xpath("//input[@id=\"filename_I__\"]")).sendKeys("C:\\Users\\Navnit\\Desktop\\Trailorfile.docx");
	   
	   driver.findElement(By.xpath("//input[@class=\"crmbutton small save\"]")).click();
	  
	   
	}

}
