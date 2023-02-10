package OnlyMyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbJavascript {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Navnit\\eclipse-workspace\\myworkspace\\Automation_basic\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();	
		driver.get("http:\\facebook.com/");
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		WebElement we=driver.findElement(By.xpath("//input[@id=\"email\"]"));
		jse.executeScript("arguments[0].value='admin'", we);
		
		WebElement we1=driver.findElement(By.xpath("//input[@id=\"pass\"]"));
		jse.executeScript("arguments[0].value='adminpass'", we1);
		
		WebElement welogin=driver.findElement(By.xpath("//button[@name=\"login\"]"));
		jse.executeScript("arguments[0].click();", welogin);
	}

}
