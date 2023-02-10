package web_automation_basic;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic_Automation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("http:\\localhost:8888/");

		driver.findElement(By.name("user_name")).sendKeys("admin");

		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();

		JavascriptExecutor jsobj = (JavascriptExecutor) driver;
		jsobj.executeScript("window.scrollBy(0,600)", " ");

//	driver.findElement(By.xpath("//a[@href=\"index.php?module=Campaigns&action=index&parenttab=Marketing\"]")).click();
//	
//	driver.findElement(By.xpath("//input[@class=\"crmbutton small delete\"]")).click();
//	
//    String a = driver.switchTo().alert().getText();
//    
//     System.out.println(a);
	}

}
