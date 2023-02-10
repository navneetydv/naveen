package web_automation_basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
  
public class tabclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Navnit\\eclipse-workspace\\myworkspace\\Automation_basic\\driver\\chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();

		driver.get("http:\\www.localhost:8888/");

		driver.findElement(By.xpath("//input[@name='user_name']")).clear();
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");

		driver.findElement( By.name("user_password")).clear();
		driver.findElement( By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();

		List<WebElement>tabclick=driver.findElements(By.xpath("//td[contains(@onmouseover,\"fnDropDown\")]"));
		System.out.println(tabclick.size());
		for (int i=0; i<tabclick.size(); i++) {
			tabclick=driver.findElements(By.xpath("//td[@onmouseover=\"fnDropDown(this,'My Home Page_sub');\"]"));
			WebElement MyHomePage=tabclick.get(i);
			String listHomePage=MyHomePage.getText();
			MyHomePage.click();

			if(listHomePage.equalsIgnoreCase("My Home Page")){
				System.out.println(listHomePage);
				
				List<WebElement>subModule=driver.findElements(By.xpath("//table[@class=\"level2Bg\"]//td//a"));
				for (int j = 0; j <subModule.size(); j++) {
					subModule=driver.findElements(By.xpath("//table[@class=\"level2Bg\"]//td//a"));
					WebElement subModuleIndex=subModule.get(j);
					String subModuleText=subModuleIndex.getText();
					System.out.println(subModuleText);
					subModuleIndex.click();
				}
			}
			List<WebElement>tabclick1=driver.findElements(By.xpath("//td[contains(@onmouseover,\"fnDropDown\")]"));
			System.out.println(tabclick1.size());
			for (int j=0; j<tabclick1.size(); i++) {
				tabclick1=driver.findElements(By.xpath("//td[@onmouseover=\"fnDropDown(this,'My Home Page_sub');\"]"));
				WebElement myHomePag=tabclick1.get(j);
				String listHomePage1=myHomePag.getText();
				myHomePag.click();

			if(listHomePage.equalsIgnoreCase("Marketing")){
				System.out.println(listHomePage);
				//myHomePag.click();
				List<WebElement>subModule=driver.findElements(By.xpath("//table[@class=\"level2Bg\"]//td//a"));
				for (int a = 0; a<subModule.size(); a++) {
					subModule=driver.findElements(By.xpath("//table[@class=\"level2Bg\"]//td//a"));
					WebElement subModuleIndex=subModule.get(a);
					String subModuleText=subModuleIndex.getText();
					System.out.println(subModuleText);
					subModuleIndex.click();
					
				}
			}
//			if(listHomePage.equalsIgnoreCase("Sales")){
//				System.out.println(listHomePage);
//				myHomePag.click();
//				List<WebElement>subModule=driver.findElements(By.xpath("//table[@class=\"level2Bg\"]//td//a"));
//				for (int j = 0; j <subModule.size(); j++) {
//					WebElement subModuleIndex=subModule.get(j);
//					String subModuleText=subModuleIndex.getText();
//					System.out.println(subModuleText);
//				}
//			}
//			if(listHomePage.equalsIgnoreCase("Support")){
//				System.out.println(listHomePage);
//				myHomePag.click();
//				List<WebElement>subModule=driver.findElements(By.xpath("//table[@class=\"level2Bg\"]//td//a"));
//				for (int j = 0; j <subModule.size(); j++) {
//					WebElement subModuleIndex=subModule.get(j);
//					String subModuleText=subModuleIndex.getText();
//					System.out.println(subModuleText);
//				}
//			}
//			if(listHomePage.equalsIgnoreCase("Analytics")){
//				System.out.println(listHomePage);
//				myHomePag.click();
//				List<WebElement>subModule=driver.findElements(By.xpath("//table[@class=\"level2Bg\"]//td//a"));
//				for (int j = 0; j <subModule.size(); j++) {
//					WebElement subModuleIndex=subModule.get(j);
//					String subModuleText=subModuleIndex.getText();
//					System.out.println(subModuleText);
//				}
//			}
//			if(listHomePage.equalsIgnoreCase("Inventory")){
//				System.out.println(listHomePage);
//				myHomePag.click();
//				List<WebElement>subModule=driver.findElements(By.xpath("//table[@class=\"level2Bg\"]//td//a"));
//				for (int j = 0; j <subModule.size(); j++) {
//					WebElement subModuleIndex=subModule.get(j);
//					String subModuleText=subModuleIndex.getText();
//					System.out.println(subModuleText);
//				}
//			}
//			if(listHomePage.equalsIgnoreCase("Tools")){
//				System.out.println(listHomePage);
//				myHomePag.click();
//				List<WebElement>subModule=driver.findElements(By.xpath("//table[@class=\"level2Bg\"]//td//a"));
//				for (int j = 0; j <subModule.size(); j++) {
//					WebElement subModuleIndex=subModule.get(j);
//					String subModuleText=subModuleIndex.getText();
//					System.out.println(subModuleText);
//				}
//			}
//			if(listHomePage.equalsIgnoreCase("Settings")){
//				System.out.println(listHomePage);
//				myHomePag.click();
//				List<WebElement>subModule=driver.findElements(By.xpath("//table[@class=\"level2Bg\"]//td//a"));
//				for (int j = 0; j <subModule.size(); j++) {
//					WebElement subModuleIndex=subModule.get(j);
//					String subModuleText=subModuleIndex.getText();
//					System.out.println(subModuleText);
//				}
//			}
		}

	}

}}
