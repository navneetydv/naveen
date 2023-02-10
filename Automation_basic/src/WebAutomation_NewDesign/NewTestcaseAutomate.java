package WebAutomation_NewDesign;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTestcaseAutomate {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Navnit\\eclipse-workspace\\myworkspace\\Automation_basic\\driver\\chromedriver.exe ");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https:practice.automationtesting.in");

		driver.findElement(By.xpath("//a[text()='My Account']")).click();
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("nynavneetyadav2589@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("nA876543@#$%^&");
		driver.findElement(By.xpath("//input[@name=\"login\"]")).click();
		driver.findElement(By.xpath("//a[text()='Orders']")).click();
		driver.findElement(By.xpath("//a[@class=\"woocommerce-Button button\"]")).click();
		driver.findElement(By.xpath("//a[@data-product_id]")).getText();
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();

	}

}
