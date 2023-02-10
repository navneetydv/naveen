package web_automation_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String   [] args) {

	System.setProperty("webdriver.driver.chrome","C:\\Users\\Navnit\\eclipse-workspace\\myworkspace\\Automation_basic\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://localhost:8888");
	
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin",Keys.ENTER);	
	driver.findElement(By.linkText("Sales")).click();
		 
	String usernamet=driver.findElement(By.xpath("//span[@class=\"moduleName\"]")).getText();
	String expectedtext="Search";
	System.out.println(usernamet);
	
	if (usernamet.equalsIgnoreCase(expectedtext))
	  System.out.println("user name get ext is passed ");
	else
		System.out.println("user name get text is failed ");
	
	Dimension login=driver.findElement(By.name("submit")).getSize();
	int height=login.height;
	int width=login.width;
	System.out.println( height+","+width);	
//	
//      driver.findElement(By.xpath("//input[@value=\"2\"]")).click();
//	  driver.findElement(By.xpath("//input[@value=\"x\"]")).click();
//	  driver.findElement(By.xpath("//input[@value=\"2\"]")).click();
//	  driver.findElement(By.xpath("//input[@value=\"=\"]")).click();
//	 WebElement answer=driver.findElement(By.xpath("//input[@name=\"answer\"]"));
//	System.out.println(answer);	
//		
	
	}	
}
