package OnlyMyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JavaScriptPractice {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Navnit\\eclipse-workspace\\myworkspace\\Automation_basic\\driver\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();	
	driver.get("http:\\localhost:8888/");
	
	JavascriptExecutor jsobj=(JavascriptExecutor)driver;
	
	WebElement username=driver.findElement(By.name("user_name"));
	jsobj.executeScript("arguments[0].value='admin'",username);

	WebElement userpass=driver.findElement(By.name("user_password"));
	jsobj.executeScript("arguments[0].value='admin'",userpass);
	
	WebElement changetheme=driver.findElement(By.xpath("//select[@name=\"login_theme\"]"));
	Select sobj=new Select(changetheme);
    sobj.selectByValue("alphagrey");
	
    WebElement changelanguage=driver.findElement(By.xpath("//select[@name=\"login_language\"]"));
	Select sobj1=new Select(changelanguage);
    sobj1.selectByValue("es_es");
    
    Thread.sleep(4000);
    sobj1.selectByVisibleText("US English");
    
	WebElement userlog=driver.findElement(By.name("Login"));
	jsobj.executeScript("arguments[0].click();",userlog);
	
	WebElement marketingclick=driver.findElement(By.linkText("Marketing"));
	jsobj.executeScript("arguments[0].click();",marketingclick);

	WebElement leadsclick=driver.findElement(By.linkText("Leads"));
	jsobj.executeScript("arguments[0].click();",leadsclick);

	WebElement leadsclicknew=driver.findElement(By.xpath("//img[@title=\"Create Lead...\"]"));
	jsobj.executeScript("arguments[0].click();",leadsclicknew);
	
	WebElement leadsboxfirst=driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
	jsobj.executeScript("arguments[0].value='Roshan'",leadsboxfirst);

	WebElement leadsbox=driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
	jsobj.executeScript("arguments[0].value='yadav'",leadsbox);
	
	WebElement leadsbox2=driver.findElement(By.xpath("//input[@name=\"company\"]"));
	jsobj.executeScript("arguments[0].value='Infoteck'",leadsbox2);
	
	WebElement leadsbox3=driver.findElement(By.xpath("//input[@name=\"designation\"]"));
	jsobj.executeScript("arguments[0].value='mr'",leadsbox3);
	
	jsobj.executeScript("window.scrollBy(0,600)", "");
	
	Thread.sleep(5000);
	
	WebElement savebutton=driver.findElement(By.xpath("(//input[@title=\"Save [Alt+S]\"])[2]"));
	jsobj.executeScript("arguments[0].click();",savebutton);
	
	}

}