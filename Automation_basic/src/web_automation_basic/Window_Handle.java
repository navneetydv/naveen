package web_automation_basic;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Window_Handle {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Navnit\\eclipse-workspace\\myworkspace\\Automation_basic\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\localhost:8888/");

		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();

		driver.findElement(By.xpath("//a[text()='Feedback']")).click();
		driver.findElement(By.xpath("//a[text()='About Us']")).click();
		driver.findElement(By.xpath("//a[text()='Help']")).click();

		String parent = driver.getWindowHandle();
		System.out.println("parent widow" + parent);

		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);

		System.out.println(driver.getTitle());

		for (String window : allwindows) {
			driver.switchTo().window(window);
			String title = driver.getTitle();

			if (title.equalsIgnoreCase("vtiger CRM 5 - Free, Commercial grade Open Source CRM")) {
				break;
      	}

		}
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//a[text()='Read License']")).click();

		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		
		
	TakesScreenshot	gg=(TakesScreenshot)driver;
	File sav=gg.getScreenshotAs(OutputType.FILE);
	
	File zx=new File("Navneet.png");
	Files.copy(sav,zx);
	
	}

}
