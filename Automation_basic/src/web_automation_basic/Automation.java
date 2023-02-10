package web_automation_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Navnit\\eclipse-workspace\\myworkspace\\Automation_basic\\driver\\chromedriver.exe");

		ChromeDriver driver =new ChromeDriver();

		driver.get("http:\\www.localhost:8888/");

		driver.findElement(By.xpath("//input[@name='user_name']")).clear();
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");

		driver.findElement(By.name("user_password")).clear();
		driver.findElement(By.name("user_password")).sendKeys("admin");

		driver.findElement(By.name("Login")).click();

//	driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index&parenttab=Sales']")).click();
		// List<WebElement> a =driver.findElementsByXPath("//td[@class='searchAlph']");
//	for (WebElement w : a) {
		// w.click();
		// }
	try {
		driver.findElement(By.linkText("Marketin")).click();
		driver.findElement(By.xpath("//*[@name=\"search_text\"]")).sendKeys("2");

	}catch(Exception e) {
		System.out.println();
		
	}
		

		Thread.sleep(3000);

		WebElement text = driver.findElement(By.xpath("(//*[@style=\"width:150px\"])[1]"));
		Select te = new Select(text);
		te.selectByVisibleText("Campaign No");

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//*[@type=\"button\"])[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.linkText("Sales")).click();
		Thread.sleep(2000);

		WebElement tex = driver.findElement(By.xpath("(//*[@id=\"bas_searchfield\"])[1]"));
		Select a = new Select(tex);
		a.selectByIndex(5);
		Thread.sleep(2000);

		a.selectByValue("company");
//	WebElement value=driver.findElement(By.xpath("(//*[@id=\\\"bas_searchfield\\\"])[1]"));
		// Select b=new Select(value);
//	a.selectByValue("company");	
	}
}
