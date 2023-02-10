package com.evs.vtiger.automation;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
     
public class Generic_method {
	public static WebDriver driver;
	public static ExtentTest test;

	public static void main(String[] args) {
		ExtentReports reports= extendReports();
		launchBrowser("chrome", "http:localhost:8888");
		WebElement weobj=getElement("name", "user_name");toSendValue(weobj, "admin");
		reports.flush();
		WebElement weocbj=getElement("name", "user_password");toSendValue(weocbj, "admin");
		WebElement weocbbj=getElement("name", "Login");
		toClick(weocbbj);
		reports.flush();
	}

	public static void screenShot() {

		TakesScreenshot tscreenShot = (TakesScreenshot) driver;
		File from = tscreenShot.getScreenshotAs(OutputType.FILE);
		String ts = getTimeStamp();
		File to = new File("snapshot\\" + ts + ".png");
		try {
			FileUtils.copyFile(from, to);
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public static void launchBrowser(String browserName, String URL) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("fireFox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else if (browserName.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}
		} catch (Exception e) {
			screenShot();
			e.printStackTrace();
		}
		try {
			driver.get(URL);
		} catch (Exception e) {
			test.log(Status.FAIL, URL + " is Wrong URL");
		}
	}

	public static ExtentReports extendReports() {

		File fileobj = new File("C:\\Users\\Navnit\\eclipse-workspace\\myworkspace\\Vtiger\\MyReport.html");
		ExtentSparkReporter htmlReports = new ExtentSparkReporter(fileobj);
		ExtentReports extntRepo = new ExtentReports();
		extntRepo.attachReporter(htmlReports);

		extntRepo.setSystemInfo("OS name", System.getProperty("os.name"));
		extntRepo.setSystemInfo("user name", System.getProperty("user.name"));
		extntRepo.setSystemInfo("Server Name", "QA Server");

		 test = extntRepo.createTest("Tc001");
		
		return extntRepo;
	}

		public static WebElement getElement(String locater,String elementvalue) {
		WebElement weobj = null;
		try {
			if (locater.equalsIgnoreCase("xpath")) {
				weobj = driver.findElement(By.xpath(elementvalue));
			} else if (locater.equalsIgnoreCase("id")) {
				weobj = driver.findElement(By.id(elementvalue));
			} else if (locater.equalsIgnoreCase("tagName")) {
				weobj = driver.findElement(By.tagName(elementvalue));
			} else if (locater.equalsIgnoreCase("name")) {
				weobj = driver.findElement(By.name(elementvalue));
			} else if (locater.equalsIgnoreCase("className")) {
				weobj = driver.findElement(By.className(elementvalue));
			} else if (locater.equalsIgnoreCase("cssSelector")) {
				weobj = driver.findElement(By.cssSelector(elementvalue));
			} else if (locater.equalsIgnoreCase("linkText")) {
				weobj = driver.findElement(By.linkText(elementvalue));
			} else if (locater.equalsIgnoreCase("partialLinkText")) {
				weobj = driver.findElement(By.partialLinkText(elementvalue));
			} else {
				test.log(Status.INFO, "locater mismatch");
			}
		} catch (Exception e) {
			screenShot();
			e.printStackTrace();
		}
		return weobj;
	}

	public static boolean elementStatus(WebElement weobj) {
		boolean status = false;
		
		if (weobj.isDisplayed() == true) {
			test.log(Status.INFO, "TextBox is visible");
			if (weobj.isEnabled() == true) {
				test.log(Status.INFO, "TextBox is Enabled");
				status = true;
			} else
				test.log(Status.FAIL, "Element is not visible");
		} else {
			test.log(Status.FAIL, "TextBox is not Dispalyed");
		}
		return status;
	}

	public static void toSendValue(WebElement weObj,String name) {
		try {
			
			boolean status = elementStatus(weObj);
			System.out.println(status);
			
			if (status == true) {
				weObj.clear();
				weObj.sendKeys(name);
			} else {
				test.log(Status.FAIL, "Element is not enabled");
			}
		} catch (Exception e) {
			screenShot();
			test.log(Status.INFO, "Handleded Exception captured Screenshot");
		}
	}
	
	public static void toClick(WebElement we) {
		try {
			
			boolean status = elementStatus(we);
			if (status == true) {
				we.click();
			} else {
				test.log(Status.FAIL, "Element is not enabled");
			}
		} catch (Exception e) {
			screenShot();
			test.log(Status.INFO, "Handleded Exception captured Screenshot");
		}
	}

	public static void toVerifygetAttribute(WebElement we, String name) {
		try {
			
			boolean status = elementStatus(we);
			if (status == true) {
				we.getAttribute(name);
			} else {
				test.log(Status.FAIL, "");
			}
		} catch (Exception e) {
			screenShot();
			test.log(Status.INFO, "Handleded Exception captured Screenshot");
		}
	}

	public static void toVerifyAlertAccept(WebElement we) {
		try {
			
			boolean status = elementStatus(we);
			if (status == true) {
				driver.switchTo().alert().accept();

			} else {
				test.log(Status.FAIL,MarkupHelper.createLabel("Alert is accepted",ExtentColor.RED));
			}
		} catch (Exception e) {
			screenShot();
			test.log(Status.INFO, "Handleded Exception captured ScreenShot");

		}
	}

	public static void toVerifyAlertDismiss(WebElement we) {
		try {
			
			boolean status = elementStatus(we);
			if (status == true) {
				driver.switchTo().alert().dismiss();

			} else {
				test.log(Status.FAIL, "");
			}
		} catch (Exception e) {
			screenShot();
			test.log(Status.INFO, "Handleded Exception captured ScreenShot");
		}
	}

	public static void toVerifyAlertSendKeys(WebElement we,String value) {
		try {
			
			boolean status = elementStatus(we);
			if (status == true) {
				driver.switchTo().alert().sendKeys(value);

			} else {
				test.log(Status.FAIL, "");
			}
		} catch (Exception e) {
			screenShot();
			test.log(Status.INFO, "Handleded Exception captured ScreenShot");
		}
	}

	public static void toVerifyAlertGetText(WebElement we) {
		try {
			
			boolean status = elementStatus(we);
			if (status == true) {
				driver.switchTo().alert().getText();

			} else {
				test.log(Status.FAIL, "");
			}
		} catch (Exception e) {
			screenShot();
			test.log(Status.INFO, "Handleded Exception captured ScreenShot");

		}
	}

	public static void toVerifyGetTittle(WebElement we) {
		try {
			
			boolean status = elementStatus(we);
			if (status == true) {
				driver.getTitle();
			} else {
				test.log(Status.FAIL, "");
			}
		} catch (Exception e) {
			screenShot();
			test.log(Status.INFO, "Handleded Exception captured ScreenShot");
		}
	}

	public static String getTimeStamp() {
		DateFormat df = new SimpleDateFormat("dd-mm-yyyy HH_MM_SS");
		return df.format(new Date());
	}

	public static void toVerifyGetText(WebElement we) {
		String innerText = null;
		try {
			
			boolean status = elementStatus(we);
			if (status == true) {
				innerText = we.getText();
				System.out.println(innerText);

			} else {
				test.log(Status.FAIL, "");
			}
		} catch (Exception e) {
			screenShot();
			test.log(Status.INFO, "Handleded Exception captured ScreenShot");
		}
	}

	public static void actionMouseOver(WebElement we) {
		try {
			
			boolean status = elementStatus(we);
			if (status == true) {
				Actions mouseOver = new Actions(driver);
				mouseOver.moveToElement(we).build().perform();
			} else {
				test.log(Status.FAIL, "");

			}
		} catch (Exception e) {
			screenShot();
			test.log(Status.INFO, "Handleded Exception captured ScreenShot");
		}
	}

	public static void actionClick(WebElement we) {
		try {
			
			boolean status = elementStatus(we);
			if (status == true) {
				Actions mouseOver = new Actions(driver);
				mouseOver.contextClick(we).build().perform();
			} else {
				test.log(Status.FAIL, "");
			}
		} catch (Exception e) {
			screenShot();
			test.log(Status.INFO, "Handleded Exception captured ScreenShot");
		}
	}

	public static void actionSendkeys(WebElement we) {
		try {
			
			boolean status = elementStatus(we);
			if (status == true) {
				Actions mouseOver = new Actions(driver);
				mouseOver.sendKeys(we).build().perform();
			} else {
				test.log(Status.FAIL, "");

			}
		} catch (Exception e) {
			screenShot();
			test.log(Status.INFO, "Handleded Exception captured ScreenShot");
		}
	}

	/*
	 * public static void actionDragAndDrop(WebElement from,WebElement to) { try {
	 * 
	 * Actions mouseOver = new Actions(driver); mouseOver.dragAndDrop(from,
	 * to).build().perform(); if() { } else { test.log(Status.FAIL,
	 * MarkupHelper.createLabel("dragAndDrop perform  is not successful",ExtentColor
	 * .RED )); } } catch (Exception e) { screenShot(); test.log(Status.INFO,
	 * "Handleded Exception captured ScreenShot"); } }
	 */
	public static void handleDropdownvalue(WebElement we,String optionvalue ) {
		try {
		
		boolean status = elementStatus(we);
		if (status == true) {
			Select dropdown=new Select(we);
			dropdown.selectByValue(optionvalue);
		}else {
			test.log(Status.FAIL, "");
		}}catch(Exception e) {
			screenShot();
			test.log(Status.INFO, "Handleded Exception captured ScreenShot");	
		}
	}
	public static void handleDropdownbyindex(WebElement we ) {
		try {
		
		boolean status = elementStatus(we);
		if (status == true) {
			Select dropdown=new Select(we);
			dropdown.selectByIndex(0);
		}else {
			test.log(Status.FAIL, "");
		}}catch(Exception e) {
			screenShot();
			test.log(Status.INFO, "Handleded Exception captured ScreenShot");	
		}
	}
	public static void handleDropdownbyText(WebElement we,String dropdownvalue ) {
		try {
		
		boolean status = elementStatus(we);
		if (status == true) {
			Select dropdown=new Select(we);
			dropdown.selectByVisibleText(dropdownvalue);
		}else {
			test.log(Status.FAIL, "");
		}}catch(Exception e) {
			screenShot();
			test.log(Status.INFO, "Handleded Exception captured ScreenShot");	
		}
	}
}
