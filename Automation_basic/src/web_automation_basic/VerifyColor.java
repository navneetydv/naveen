package web_automation_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class VerifyColor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Navnit\\eclipse-workspace\\myworkspace\\Automation_basic\\driver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin", Keys.ENTER);
		driver.findElement(By.xpath("//a[text()='Marketing']")).click();
		String str = driver.findElement(By.xpath("//input[@value=\"Delete\"]")).getCssValue("background-color");

		String getColoText = driver.findElement(By.xpath("//input[@value=\"Delete\"]")).getCssValue("color");

		String color = Color.fromString(str).asHex();

		if (color.equals("#ff0000")) {
			System.out.println("Delete button color is verified");
			
		} else {
			System.out.println("Delete button color is not verified , color mentioned wrong");
		}
	}
}
