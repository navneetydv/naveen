
package web_automation_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Navnit\\eclipse-workspace\\myworkspace\\Automation_basic\\driver\\chromedriver.exe");
       ChromeDriver driver=new ChromeDriver();

		driver.get("http:\\www.AutomationPractice.com/");
		// driver.findElement(By.xpath("//button[text()='✕']")).click();
      driver.findElement(By.xpath("//a[@data-id-product=\"1\"]//span")).click();
      Thread.sleep(5000);
    WebElement we= driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]"));
      Actions ac=new Actions(driver);
      ac.click(we).build().perform();
	}

}
