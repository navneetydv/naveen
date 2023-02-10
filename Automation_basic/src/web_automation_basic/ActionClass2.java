package web_automation_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass2 {

	private static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Navnit\\eclipse-workspace\\myworkspace\\Automation_basic\\driver\\chromedriver.exe ");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http:localhost:8888");

		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();

		Thread.sleep(5000);
		Actions dragdrop = new Actions(driver);
		WebElement tagcloud = driver.findElement(By.xpath("//b[contains(text(),'Top Potentials')]"));
		WebElement wePotential = driver.findElement(By.xpath("//b[contains(text(),'Tag Cloud')]"));
		dragdrop.dragAndDrop(tagcloud, wePotential).build().perform();

	}

}
