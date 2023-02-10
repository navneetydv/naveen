package web_automation_basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		// googleMouseOver();

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Navnit\\eclipse-workspace\\myworkspace\\Automation_basic\\driver\\chromedriver.exe");
		ChromeDriver mdriver = new ChromeDriver();
		mdriver.get("http:localhost:8888");
		mdriver.findElement(By.name("user_name")).sendKeys("admin");
		mdriver.findElement(By.name("user_password")).sendKeys("admin");
		mdriver.findElement(By.name("Login")).click();
		Actions actionObj = new Actions(mdriver);
		WebElement mouseOver = mdriver.findElement(By.xpath("//a[text()='Marketing']"));
		actionObj.moveToElement(mouseOver).build().perform();
		mdriver.findElement(By.linkText("Leads")).click();

		List<WebElement> leadsDelete = mdriver.findElements(By.xpath("//td[text()='LEA12 ']"));
		List<WebElement> deleteLea = mdriver.findElements(By.xpath("//a[text()='del']"));
		for (int i = 0; i < leadsDelete.size(); i++) {
			WebElement deleting = leadsDelete.get(i);
			String leadsDeleteText = deleting.getText();
			WebElement dele = deleteLea.get(i);
			if (leadsDeleteText.equals("LEA12")) {
				dele.click();

				mdriver.switchTo().alert().accept();
			}
		}
	}

	public static void googleMouseOver() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Navnit\\\\eclipse-workspace\\\\myworkspace\\\\Automation_basic\\\\chromedriver.exe");
		ChromeDriver mdriver = new ChromeDriver();
		mdriver.get("https:Google.com//");
		Actions Clickable = new Actions(mdriver);
		Thread.sleep(3000);
		mdriver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("samsung");
		Thread.sleep(3000);

		WebElement sam = mdriver.findElement(By.xpath("//b[text()=' s22 ultra']"));
		Clickable.click(sam).build().perform();

	}
}
