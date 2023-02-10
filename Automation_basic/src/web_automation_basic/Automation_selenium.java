package web_automation_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation_selenium {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Navnit\\eclipse-workspace\\myworkspace\\Automation_basic\\driver\\chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
    driver.get("http://localhost:8888/");
	
	driver.findElement(By.xpath("//input[@name='user_name']")).clear();
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	
    WebElement falsee=	driver.findElement(By.xpath("//select[@class=\"small\"]"));
	Select dropDown=new Select(falsee);
	dropDown.selectByVisibleText("woodspice");
	
	driver.findElement( By.name("user_password")).clear();
	driver.findElement( By.name("user_password")).sendKeys("admin",Keys.ENTER);
			
	Thread.sleep(4000);
	driver.findElement(By.linkText("Marketing")).click();
	
	driver.findElement(By.linkText("Leads")).click();	
		
	//Thread.sleep(4000);
	//driver.close();
	}
}
