package web_automation_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class ChromeOptionPractice {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Navnit\\eclipse-workspace\\myworkspace\\Automation_basic\\driver\\chromedriver.exe");
	
	ChromeOptions options =new ChromeOptions();
	options.addArguments("incognito");
	//options.addArguments("");
	WebDriver driver= new ChromeDriver(options);
	driver.get("http://localhost:8888");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.name("Login")).click();
	driver.findElement(By.xpath("//a[text()='Marketing']")).click();
	driver.findElement(By.xpath("//a[text()='Documents']")).click();
	driver.findElement(By.xpath("//img[@alt=\"Create Document...\"]")).click();
	Thread.sleep(3000);
	WebElement we=driver.findElement(By.xpath("//select[@name=\"filelocationtype\"]"));
	Select se=new Select(we);
	se.selectByVisibleText("Internal");

	driver.findElement(By.xpath("//input[@name=\"filename\"]")).sendKeys("C:\\Users\\Navnit\\Desktop\\newfile.docx");

	}
	
}
