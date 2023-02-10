package web_automation_basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classxyz {
	
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Navnit\\eclipse-workspace\\myworkspace\\Automation_basic\\chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();

		driver.get("http:\\www.localhost:8888/");

		driver.findElement(By.xpath("//input[@name='user_name']")).clear();
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");

		driver.findElement( By.name("user_password")).clear();
		driver.findElement( By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();

		List<WebElement>tabclick=driver.findElements(By.xpath("//td[contains(@onmouseover,\"fnDropDown\")]"));
		for (int i=0; i<tabclick.size(); i++) {
			tabclick=driver.findElements(By.xpath("//td[contains(@onmouseover,\"fnDropDown\")]"));
			WebElement subModule=tabclick.get(i);
			System.out.println(subModule.getText());
			subModule.click();
			
			List<WebElement>tabclickText=driver.findElements(By.xpath("//td[contains(@class,\"SelTab\")]"));
			for (int j = 0; j <tabclickText.size(); j++) {
				tabclickText=driver.findElements(By.xpath("//td[contains(@class,\"SelTab\")]"));
				WebElement subModuleText=tabclickText.get(j);
				System.out.println(subModuleText.getText());
				subModuleText.click();
				
				
							
				}}
			}
			
		

	}


		
		
		
		
		
		
	


