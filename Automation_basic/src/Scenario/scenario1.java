package Scenario;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.TabSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.Assert;

public class scenario1 {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Navnit\\eclipse-workspace\\myworkspace\\Automation_basic\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http:\\www.localhost:8888/");
	
   driver.findElement(By.name("user_name")).sendKeys("admin");
   driver.findElement(By.name("user_password")).sendKeys("admin",Keys.ENTER);
   driver.findElement(By.xpath("//a[text()='Marketing']")).click();
   driver.findElement(By.xpath("//a[text()='Accounts']")).click();
   
   ArrayList<String> arobj=new ArrayList<>();
   List<WebElement> we=driver.findElements(By.xpath("//tr[@bgcolor=\"white\"]"));
  for (WebElement listprnt : we) {
	 arobj.add(listprnt.getText());

  }
   ArrayList<String> listsort=new ArrayList<>();
   for (String st : arobj) {
	   listsort.add(st);	
}
	}
}
