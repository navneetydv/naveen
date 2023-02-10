package web_automation_basic;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtger {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Navnit\\\\eclipse-workspace\\\\myworkspace\\\\Automation_basic\\\\chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.get("http:localhost:8888");
	     driver.findElement(By.name("user_name")).sendKeys("admin");
	     driver.findElement(By.name("user_password")).sendKeys("admin");
	     driver.findElement(By.name("Login")).click();
	     driver.findElement(By.xpath("//a[text()='Sales']")).click();
	     driver.findElement(By.xpath("//td[@class=\"level2UnSelTab\"]//a[text()='Potentials']")).click();
	    	
	    List<WebElement> subTab=driver.findElements(By.xpath("//td[contains(@class,'Selected')]"));	
	    for (int i = 0; i <subTab.size(); i++) {
	    	subTab=driver.findElements(By.xpath("//td[contains(@class,'Selected')]"));
	    	WebElement tabLink=subTab.get(i);
	    	String tabTextLink=tabLink.getText();
	       System.out.println();
	    	System.out.println(i + 1 + "=====" + tabTextLink+"   >   ");
	   tabLink.click();
	   Thread.sleep(2000);
        int mod_number=0;
        List<WebElement> insubTab=driver.findElements(By.xpath("//table[@class=\"level2Bg\"]//table//td"));	
	    for (int j = 0; j < insubTab.size(); j++) {
	    	insubTab=driver.findElements(By.xpath("//table[@class=\"level2Bg\"]//table//td"));
	    	WebElement subTabLink = insubTab.get(j);
	    	String subTabLinkText=subTabLink.getText();
	    	subTabLink.click();
	    	Thread.sleep(2000);
	    	String s=" ";
	    	String expectedText=subTabLink+" > "+subTabLinkText;
	    	mod_number++;
	    	if(subTabLinkText.equalsIgnoreCase("webmail") == false&&subTabLinkText.equalsIgnoreCase("Module Manager") == false) {
	    		String actualText=driver.findElement(By.xpath("//a[@class=\"hdrLink\"]")).getText();
	    		        System.out.print(mod_number+"-"+subTabLinkText+"     " );
	    		        	    	}else { 
	    		System.err.println(mod_number +"-"+subTabLinkText+" can not be automate-");
	    		}			
	    } System.out.println();  	    	
		}}}


