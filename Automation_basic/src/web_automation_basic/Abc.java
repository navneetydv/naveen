package web_automation_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abc {

	public static void main(String[] args) throws Exception {
	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Navnit\\eclipse-workspace\\myworkspace\\Automation_basic\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();

	driver.get("http:\\www.localhost:8888/");

	driver.findElement(By.xpath("//input[@name='user_name']")).clear();
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	
	driver.findElement( By.name("user_password")).clear();
	driver.findElement( By.name("user_password")).sendKeys("admin");
	Thread.sleep(5000);
	driver.findElement(By.name("Login")).click();
	//driver.findElement(By.linkText("Marketing")).click();
		
	driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3AllMenu.gif']")).click();	
	
	}

}
