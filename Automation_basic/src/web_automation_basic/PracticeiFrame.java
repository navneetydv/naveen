package web_automation_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeiFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Navnit\\eclipse-workspace\\myworkspace\\Automation_basic\\driver\\chromedriver.exe");
		
	ChromeDriver driver=new ChromeDriver();
	Thread.sleep(5000);

	driver.get("https://www.sarkariresult.com//");
	Thread.sleep(5000);
	driver.switchTo().frame(1);
	WebElement abj= driver.findElement(By.xpath("//b[text()='@sarkari_result']"));
	Actions actobj = new Actions(driver);
	actobj.click(abj).build().perform();
	

	}

}
