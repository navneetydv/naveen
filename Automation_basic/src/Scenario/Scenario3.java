package Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Navnit\\eclipse-workspace\\myworkspace\\Automation_basic\\driver\\chromedriver.exe");
		WebDriver mdriver=new ChromeDriver();
		mdriver.get("http:www.localhost:8888");
		String pagesource=mdriver.getPageSource();
		System.out.println(pagesource);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://validator.w3.org/");
		
		driver.findElement(By.xpath("//fieldset[@id=\"validate-by-input\"]")).click();
		

	}

}
