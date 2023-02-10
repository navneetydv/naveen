package web_automation_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class  WebAutomationBasic {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Navnit\\eclipse-workspace\\myworkspace\\Automation_basic\\selenium-server-standalone-3.5.3.jar");
		
		ChromeDriver Driver=new ChromeDriver();
		
	 Driver.get("http:\\www.localhost:8888/");
	
	Driver.findElement(By.xpath("//input[@name='user_name']")).clear();
	Driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	
	Driver.findElement( By.name("user_password")).clear();
	Driver.findElement( By.name("user_password")).sendKeys("admin");
	
	Driver.findElement(By.name("Login")).click();
	
	Driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index&parenttab=Sales']")).click();
	
	Driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index&parenttab=Sales']")).click();
	
	Driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	
	Driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	
	WebElement  TitleDropdown=Driver.findElement(By.xpath("//select[@name='salutationtype']"));
	Select	tc=new Select(TitleDropdown); 
	tc.selectByVisibleText("Mr.");
	
	
	Driver.findElement(By.xpath("//input[@name='firstname']")).clear();
	Driver.findElement(By.name("firstname")).sendKeys("Abhishek");
	Driver.findElement(By.xpath("//input[@name='lastname']")).clear();
	Driver.findElement(By.name("lastname")).sendKeys("yadav");
    Driver.findElement(By.xpath("//input[@name='company']")).clear();
	Driver.findElement(By.name("company")).sendKeys("T.C.S.");
    Driver.findElement(By.xpath("//input[@name='phone']")).clear();
	Driver.findElement(By.name("phone")).sendKeys("02226756");
	Driver.findElement(By.xpath("//input[@name='designation']")).clear();
	Driver.findElement(By.name("designation")).sendKeys("user");
	
	Driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

	Driver.findElement(By.xpath("//a[@href='index.php?module=Reports&action=index&parenttab=Analytics']")).click();	
	Driver.findElement(By.xpath("//a[@href='index.php?module=Dashboard&action=index&parenttab=Analytics']")).click();

	WebElement Dropdown=Driver.findElement(By.xpath("//select[@name='dashordlists']"));	
	Select Dv=new Select(Dropdown);
	Dv.selectByVisibleText("Sales by Team");
	
//	By mymarketinglink=By.linkText("Marketing");	 
//	  
//	 WebElement weMarketing = Driver.findElement(mymarketinglink);
//	 weMarketing.click();
//	 
//	By searchTextBox=By.className("txtBox");
//	WebElement weSearchTextbox = Driver.findElement(searchTextBox);
//	weSearchTextbox.sendKeys("2");
//	
//	Driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
//	Driver.findElement(By.xpath("//a[@href='index.php?module=SMSNotifier&action=index&parenttab=Tools']")).click();
//	
	}
	
	

}
