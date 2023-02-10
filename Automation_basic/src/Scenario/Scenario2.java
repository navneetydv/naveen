package Scenario;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Navnit\\eclipse-workspace\\myworkspace\\Automation_basic\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\www.localhost:8888/");
		
	   driver.findElement(By.name("user_name")).sendKeys("admin");
	   driver.findElement(By.name("user_password")).sendKeys("admin",Keys.ENTER);
	   driver.findElement(By.xpath("//a[text()='Feedback']")).click();
	   driver.findElement(By.xpath("//a[text()='About Us']")).click();
	   driver.findElement(By.xpath("//a[text()='Help']")).click();
	   
	  String parent= driver.getWindowHandle();
	  System.out.println(parent+"only parent windo");
	  
	  Set<String> allwind=driver.getWindowHandles();
	  System.out.println(allwind);

	  System.out.println(driver.getTitle());
	  
	  for (String str : allwind) {
		  driver.switchTo().window(str);
		  String title=driver.getTitle();
		  
		  if(title.equalsIgnoreCase("admin - My Home Page - Home - vtiger CRM 5 - Commercial Open Source CRM")==false||title.equalsIgnoreCase("vtiger CRM 5 - Free, Commercial grade Open Source CRM")==false) {
			  driver.close();
		  }else if(title.equalsIgnoreCase("vtiger CRM 5 - Free, Commercial grade Open Source CRM")) {
			  break;
		  }
	
		
		
		//System.out.println(driver.getTitle());
		
	}
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
	}

}
