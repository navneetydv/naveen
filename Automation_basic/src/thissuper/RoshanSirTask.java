package thissuper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoshanSirTask {
	static WebDriver driver;

	public static void main(String[] args) {
		RoshanSirTask a = new RoshanSirTask();
		a.lauchbrowser();
		a.testcase1();
		a.lauchbrowser();
		a.testcase2();
		a.lauchbrowser();
		a.testcase3();
	}

	public void lauchbrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Navnit\\eclipse-workspace\\myworkspace\\Automation_basic\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
	}

	public void testcase1() {

		WebElement username = driver.findElement(By.xpath("//input[@name=\"user_name\"]"));
		if (username.isDisplayed() == true) {
			System.out.println("user box is visible");
		} else {
			System.out.println("user box is visible or not ");
		}

		WebElement userpass = driver.findElement(By.xpath("//input[@name=\"user_password\"]"));
		if (userpass.isDisplayed() == true) {
			System.out.println("password box is visible");
		} else {
			System.out.println("password box is visible or not ");
		}

		WebElement color = driver.findElement(By.xpath("//select[@name=\"login_theme\"]"));
		if (color.isDisplayed() == true) {
			System.out.println("color theme box is visible");
		} else {
			System.out.println("color theme box is visible or not ");
		}
		WebElement language = driver.findElement(By.xpath("//select[@name=\"login_language\"]"));
		if (language.isDisplayed() == true) {
			System.out.println("language box is visible");
		} else {
			System.out.println("language box is visible or not ");
		}
		WebElement login = driver.findElement(By.xpath("//input[@name=\"Login\"]"));
		if (login.isDisplayed() == true) {
			System.out.println("login button is visible");
		} else {
			System.out.println("login button is visible or not ");
		}	
		
	}
	public void testcase2() {
		
		WebElement username = driver.findElement(By.xpath("//input[@name=\"user_name\"]"));
	if (username.isEnabled() == true) {
		System.out.println("user box is enable");
	} else {
		System.out.println("user box is enable or not ");
	}

	WebElement userpass = driver.findElement(By.xpath("//input[@name=\"user_password\"]"));
	if (userpass.isDisplayed() == true) {
		System.out.println("password box is enable");
	} else {
		System.out.println("password box is enable or not ");
	}

	WebElement color = driver.findElement(By.xpath("//select[@name=\"login_theme\"]"));
	if (color.isDisplayed() == true) {
		System.out.println("color theme box is enable");
	} else {
		System.out.println("color theme box is enable or not ");
	}
	WebElement language = driver.findElement(By.xpath("//select[@name=\"login_language\"]"));
	if (language.isDisplayed() == true) {
		System.out.println("language box is enable");
	} else {
		System.out.println("language box is enable or not ");
	}
	WebElement login = driver.findElement(By.xpath("//input[@name=\"Login\"]"));
	if (login.isDisplayed() == true) {
		System.out.println("login button is enable");
	} else {
		System.out.println("login button is enable or not ");
	}	
	
}
	public void testcase3() {
		WebElement username = driver.findElement(By.xpath("//input[@name=\"user_name\"]"));	
		username.sendKeys("admin");
		WebElement userpass = driver.findElement(By.xpath("//input[@name=\"user_password\"]"));
		userpass.sendKeys("admin");
		WebElement login = driver.findElement(By.xpath("//input[@name=\"Login\"]"));
        login.click();
        String expText="admin - My Home Page - Home - vtiger CRM 5 - Commercial Open Source CRM";
        String actualresult= driver.getTitle();
        if(expText.equalsIgnoreCase(actualresult)) {
        	System.out.println("the user has been logged in successfully and landed home page");
        }else {
        	System.out.println("you must the sfeccify valid user name and valid valid password");
        }
        
	}
	public void testcase4() {
		WebElement username = driver.findElement(By.xpath("//input[@name=\"user_name\"]"));	
		username.sendKeys("admin");
		String expname="admin";
		String actualname="admin";
		if(expname.equalsIgnoreCase(actualname)) {
			System.out.println("Test case failed user is able to enter the username ");
		}
		
	}
	}

