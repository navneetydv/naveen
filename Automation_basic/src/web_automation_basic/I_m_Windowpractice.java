package web_automation_basic;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class I_m_Windowpractice {
public static void main(String[] args) {
	    ChromeDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("http:www.localhost:8888");
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.name("Login")).click();
	
	driver.findElement(By.xpath("//a[text()='About Us']")).click();
	driver.findElement(By.xpath("//a[text()='Help']")).click();
	driver.findElement(By.xpath("//a[text()='Feedback']")).click();
	
	Set<String> getall=driver.getWindowHandles();
	System.out.println(getall);
	
	System.out.println(driver.getTitle());
	
	for (String str : getall) {
		driver.switchTo().window(str);
		String title=driver.getTitle();
		
		if(title.equalsIgnoreCase("vtiger CRM 5 - Free, Commercial grade Open Source CRM")) {
		break;
		}		  
	}
System.out.println(driver.getTitle());
	
	List<WebElement> ew=driver.findElements(By.xpath("//table[@class='rollOver']//td"));
    for(int i = 0 ; i <ew.size();i++) {
    	WebElement getName  =ew.get(i);
    	String textName = getName.getText();
    	System.out.println(textName);
    }
    driver.switchTo().newWindow(WindowType.WINDOW);
}

}
