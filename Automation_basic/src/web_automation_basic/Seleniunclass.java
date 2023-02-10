package web_automation_basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniunclass {

	public static void main(String[] args) {

System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Navnit\\eclipse-workspace\\myworkspace\\Automation_basic\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();

	driver.get("http:\\www.localhost:8888/");

	driver.findElement(By.xpath("//input[@name='user_name']")).clear();
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	
	driver.findElement( By.name("user_password")).clear();
	driver.findElement( By.name("user_password")).sendKeys("admin");
	
	driver.findElement(By.name("Login")).click();
	
	driver.findElement(By.linkText("Marketing")).click();

	List<WebElement> linklist= driver.findElements(By.xpath("//table[@class='hdrTabBg']//td[2]//a"));
	for (int i = 0; i < linklist.size()-1; i++) {
		linklist= driver.findElements(By.xpath("//table[@class='hdrTabBg']//td[2]//a"));
		WebElement welink=linklist.get(i);
		String innertext=welink.getText();
		System.out.println(i+" link text -"+innertext);
	    welink.click();
}
		
		
		
	}

}
