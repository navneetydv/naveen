package OnlyMyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.netty.channel.ChannelOption;

public class vtigerPractice {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","");
		
		//ChromeOptions gry=new ChromeOptions();
		//gry.addArguments("incognito");
		
     	///gry.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});

		ChromeDriver driver=new ChromeDriver();	
		driver.get("http:\\localhost:8888/");

		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		
		driver.findElement(By.name("Login")).click();
		driver.findElement(By.xpath("//a[text()='Sales']")).click();
		driver.findElement(By.xpath("//a[text()='Invoice']")).click();
		driver.findElement(By.xpath("//img[@title=\"Create Invoice...\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"query_string\"]")).sendKeys("SarakariNaukari");
		driver.findElement(By.xpath("(//img[@title=\"Select\"])[2]")).click();
		
		driver.close();
	}

}
