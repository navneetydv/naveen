package web_automation_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_1 {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Navnit\\eclipse-workspace\\myworkspace\\Automation_basic\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();

	driver.get("http:\\www.localhost:8888/");

	driver.findElement(By.xpath("//input[@name='user_name']")).clear();
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	
	driver.findElement( By.name("user_password")).clear();
	driver.findElement( By.name("user_password")).sendKeys("admin");
	Thread.sleep(5000);
	driver.findElement(By.name("Login")).click();
	driver.findElement(By.linkText("Marketing")).click();
		
	driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index&parenttab=Marketing']")).click();	
		
	driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();	
	
	driver.findElement(By.xpath("//input[@name='accountname']")).clear();
	driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("vtiger4");

	driver.findElement(By.xpath("//input[@name='website']")).clear();	
	driver.findElement(By.xpath("//input[@name='website']")).sendKeys("www.naukari.com");	
	
	driver.findElement(By.xpath("//input[@id='phone']")).clear();	
	driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("0223456789");
	
	driver.findElement(By.xpath("//input[@name='tickersymbol']")).clear();	
	driver.findElement(By.xpath("//input[@name='tickersymbol']")).sendKeys("&*&");	

	driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
	
//	driver.findElement(By.xpath("//a[@class='hdrLink']")).click();			
	
//	driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=CustomView&parenttab=Marketing']")).click();	
	
	
	

		
	}

}
