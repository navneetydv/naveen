package com.evs.vtiger.automation;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class BasicAutomation {

	public static void main(String[] args) {
		
		SortedSet<String> ss=new TreeSet<String>();
		ss.add("a");
		ss.add("b");
		ss.add("c");
		ss.add("d");
		ss.add("e");
		ss.add("f");
		ss.add("g");
		SortedSet<String> ss1=ss.tailSet("e");
		Iterator<String> sse=ss1.iterator();
		while(sse.hasNext()){
			System.out.println(sse.next().toString());
		}
	//System.out.println("hello how are you");
	//WebDriverManager.chromedriver().setup();
	/*
	 * WebDriver driver=new ChromeDriver();
	 * 
	 * driver.get("http:localhost:8888");
	 * driver.findElement(By.name("user_name")).sendKeys("admin");
	 * driver.findElement(By.name("user_password")).sendKeys("admin");
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 */
//	driver.findElement(By.name("Login")).click();
		
		
	}

}
