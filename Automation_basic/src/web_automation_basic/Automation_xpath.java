package web_automation_basic;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_xpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Navnit\\eclipse-workspace\\myworkspace\\Automation_basic\\driver\\chromedriver.exe");
	
		ChromeDriver driver=new ChromeDriver();
				
//			driver.get("https://www.flipkart.com/");
//		
//			driver.findElement(By.xpath("//button[text()='✕']")).click();
			
			//driver.findElement(By.xpath("//a[@class='_1_3w1N']")).click();
			//driver.findElement(By.xpath("//*[text()='Shop Monthly Essentials']//parent::div//div//a[text()='VIEW ALL']")).click();
//			tshirtviewName_Price();
			
	
		  // ChromeDriver driver=new ChromeDriver();
	   	   driver.get("http://www.flipkart.com/");
		   driver.findElement(By.xpath("//button[text()='✕']")).click();
		   List<WebElement> flipkartTopTab =driver.findElements(By.xpath("//div[@class='xtXmba']"));
		   int sizeOfflipkartTopTab=flipkartTopTab.size();
		   System.out.println(sizeOfflipkartTopTab);
		   for (int i = 0; i<sizeOfflipkartTopTab; i++) {
			flipkartTopTab =driver.findElements(By.xpath("//div[@class='xtXmba']"));
			WebElement eleflipkartTopTab=flipkartTopTab.get(i);
		//	System.out.println(eleflipkartTopTab.getText());
			String str=eleflipkartTopTab.getText();
			System.out.println(str); 
		
		    if(str.equalsIgnoreCase("Fashion")==false&&str.equalsIgnoreCase("Electronics")==false&&str.equalsIgnoreCase("Home")==false&&str.equalsIgnoreCase("Beauty,Toys & More")==false){
			eleflipkartTopTab.click();
			Thread.sleep(5000);
			driver.navigate().back();
			Thread.sleep(5000);
			
		}else {
			System.out.println("No  Back  here");
		}

//			Home
//			Appliances
//			Travel
//			Beauty, Toys & More
//			Electric 2-Wheelers
//		}
		}
	}
	public static void tshirtviewName_Price() throws InterruptedException {
		
	ChromeDriver driver=new ChromeDriver();
    driver.findElement(By.xpath("//input[@title=\"Search for products, brands and more\"]")).sendKeys("T-shirt");
    
    driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    Thread.sleep(5000);
    List<WebElement> tshirtview=  driver.findElements(By.xpath("//a[@class=\"IRpwTa\"]"));
    List<WebElement> tshirtviewPrice=  driver.findElements(By.xpath("//div[@class=\"_30jeq3\"]"));
    int countoftshirtview=tshirtview.size();

    for (int i = 0; i <countoftshirtview; i++) {
	System.out.print(tshirtview.get(i).getText()+"   ");
	System.out.println(tshirtviewPrice.get(i).getText());
	
	}  
}
}
