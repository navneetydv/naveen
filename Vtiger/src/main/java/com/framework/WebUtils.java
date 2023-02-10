package com.framework;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebUtils {

	public static WebDriver driver;
	public static ExtentTest test;

	public static void screenShot() {

		TakesScreenshot tscreenShot = (TakesScreenshot) driver;
		File from = tscreenShot.getScreenshotAs(OutputType.FILE);
		String ts = getTimeStamp();
		System.out.println("timeStamp====" + ts);
		File to = new File("snapshot\\" + ts + ".png");
		try {
			Files.copy(from, to);
			test.addScreenCaptureFromPath(to.getAbsolutePath());
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public static void launchBrowser_openUrl(String browserName, String URL) {
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

	public static ExtentReports extendReports(String reportName) {

		File fileobj = new File(
				"C:\\Users\\Navnit\\eclipse-workspace\\myworkspace\\Vtiger\\" + reportName + getTimeStamp() + ".html");
		ExtentSparkReporter htmlReports = new ExtentSparkReporter(fileobj);
		ExtentReports extntRepo = new ExtentReports();
		extntRepo.attachReporter(htmlReports);
		extntRepo.setSystemInfo("OS name", System.getProperty("os.name"));
		extntRepo.setSystemInfo("user name", System.getProperty("user.name"));
		extntRepo.setSystemInfo("Server Name", "QA Server");

		test = extntRepo.createTest("Tc001");

		return extntRepo;
	}

	public static void reportFlush(ExtentReports report) {
		try {
			report.flush();

		} catch (Exception e) {
			screenShot();
			e.getMessage();
		}
	}

	public static WebElement getElement(String locater, String elementvalue) {
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
				test.log(Status.INFO, MarkupHelper.createLabel("locater mismatch", ExtentColor.YELLOW));
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
			test.log(Status.INFO, MarkupHelper.createLabel("TextBox is visible", ExtentColor.GREEN));
			if (weobj.isEnabled() == true) {
				test.log(Status.INFO, MarkupHelper.createLabel("TextBox is Enabled", ExtentColor.GREEN));
				status = true;
			} else
				test.log(Status.FAIL, MarkupHelper.createLabel("Element is not visible", ExtentColor.RED));
		} else {
			test.log(Status.FAIL, MarkupHelper.createLabel("TextBox is not Dispalyed", ExtentColor.RED));
		}
		return status;
	}

	public static void toSendValue(WebElement weObj, String name, String elementName) {
		try {

			boolean status = elementStatus(weObj);
			System.out.println(status);

			if (status == true) {
				weObj.clear();
				weObj.sendKeys(name);
				test.log(Status.INFO, MarkupHelper.createLabel(
						"" + name + " is successfully inserted in " + elementName + "", ExtentColor.GREEN));
			} else {
				test.log(Status.FAIL, MarkupHelper.createLabel(elementName + " is not enabled", ExtentColor.RED));
			}
		} catch (Exception e) {
			screenShot();
			test.log(Status.INFO,
					MarkupHelper.createLabel("Handleded Exception captured Screenshot", ExtentColor.BLUE));
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
			test.log(Status.INFO,
					MarkupHelper.createLabel("Handleded Exception captured Screenshot", ExtentColor.BLUE));
		}
	}

	public static void toVerifygetAttribute(WebElement we, String name) {
		try {

			boolean status = elementStatus(we);
			if (status == true) {
				we.getAttribute(name);
			} else {
				test.log(Status.FAIL, MarkupHelper.createLabel("", ExtentColor.RED));
			}
		} catch (Exception e) {
			screenShot();
			test.log(Status.INFO,
					MarkupHelper.createLabel("Handleded Exception captured Screenshot", ExtentColor.BLUE));
		}
	}

	public static void toVerifyAlertAccept(WebElement we) {
		try {

			boolean status = elementStatus(we);
			if (status == true) {
				driver.switchTo().alert().accept();

			} else {
				test.log(Status.FAIL, MarkupHelper.createLabel("Alert is accepted", ExtentColor.RED));
			}
		} catch (Exception e) {
			screenShot();
			test.log(Status.INFO,
					MarkupHelper.createLabel("Handleded Exception captured Screenshot", ExtentColor.BLUE));

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
			test.log(Status.INFO,
					MarkupHelper.createLabel("Handleded Exception captured Screenshot", ExtentColor.BLUE));
		}
	}

	public static void toVerifyAlertSendKeys(WebElement we, String value) {
		try {

			boolean status = elementStatus(we);
			if (status == true) {
				driver.switchTo().alert().sendKeys(value);

			} else {
				test.log(Status.FAIL, MarkupHelper.createLabel("", ExtentColor.RED));
			}
		} catch (Exception e) {
			screenShot();
			test.log(Status.INFO,
					MarkupHelper.createLabel("Handleded Exception captured Screenshot", ExtentColor.BLUE));
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
			test.log(Status.INFO,
					MarkupHelper.createLabel("Handleded Exception captured Screenshot", ExtentColor.BLUE));

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
			test.log(Status.INFO,
					MarkupHelper.createLabel("Handleded Exception captured Screenshot", ExtentColor.BLUE));
		}
	}

	public static String getTimeStamp() {
		DateFormat df = new SimpleDateFormat("dd-mm-yyyy HH_MM_SS");
		return df.format(new Date());

	}

	public static String toVerifyGetText(WebElement we) {
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
			test.log(Status.INFO,
					MarkupHelper.createLabel("Handleded Exception captured Screenshot", ExtentColor.BLUE));
		}
		return innerText;
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
			test.log(Status.INFO,
					MarkupHelper.createLabel("Handleded Exception captured Screenshot", ExtentColor.BLUE));
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
			test.log(Status.INFO,
					MarkupHelper.createLabel("Handleded Exception captured Screenshot", ExtentColor.BLUE));
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
			test.log(Status.INFO,
					MarkupHelper.createLabel("Handleded Exception captured Screenshot", ExtentColor.BLUE));
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

	public static void handleDropdownvalue(WebElement we, String optionvalue) {
		try {

			boolean status = elementStatus(we);
			if (status == true) {
				Select dropdown = new Select(we);
				dropdown.selectByValue(optionvalue);
			} else {
				test.log(Status.FAIL, "");
			}
		} catch (Exception e) {
			screenShot();
			test.log(Status.INFO,
					MarkupHelper.createLabel("Handleded Exception captured Screenshot", ExtentColor.BLUE));
		}
	}

	public static void handleDropdownbyindex(WebElement we) {
		try {

			boolean status = elementStatus(we);
			if (status == true) {
				Select dropdown = new Select(we);
				dropdown.selectByIndex(0);
			} else {
				test.log(Status.FAIL, "");
			}
		} catch (Exception e) {
			screenShot();
			test.log(Status.INFO,
					MarkupHelper.createLabel("Handleded Exception captured Screenshot", ExtentColor.BLUE));
		}
	}

	public static void handleDropdownbyText(WebElement we, String dropdownvalue) {
		try {

			boolean status = elementStatus(we);
			if (status == true) {
				Select dropdown = new Select(we);
				dropdown.selectByVisibleText(dropdownvalue);
			} else {
				test.log(Status.FAIL, MarkupHelper.createLabel("", ExtentColor.RED));
			}
		} catch (Exception e) {
			screenShot();
			test.log(Status.INFO,
					MarkupHelper.createLabel("Handleded Exception captured Screenshot", ExtentColor.BLUE));
		}
	}

	public static void handleframe(WebElement we) {
		try {
			boolean status = elementStatus(we);
			if (status == true) {
				driver.switchTo().frame(we);

			} else {
				test.log(Status.FAIL, MarkupHelper.createLabel("", ExtentColor.RED));
			}
		} catch (Exception e) {
			screenShot();
		}

	}

	public static void setImplicitilyWait(int getTimeout) {
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(getTimeout));

		} catch (Exception e) {
			screenShot();
			e.getMessage();
		}
	}

	public static void SetExplicitywait(WebElement we, int timeSecond) {

		WebDriverWait explicityWait = new WebDriverWait(driver, Duration.ofSeconds(timeSecond));
		explicityWait.until(ExpectedConditions.visibilityOf(we));
	}

	public static void validateText(WebElement we, String expectedText, String elementName) {
		try {
			String actualText = WebUtils.toVerifyGetText(we);
			if (actualText.equals(expectedText)) {

				test.log(Status.INFO, MarkupHelper.createLabel("", ExtentColor.GREEN));

			} else {
				test.log(Status.FAIL, MarkupHelper.createLabel("", ExtentColor.RED));

			}
		} catch (Exception e) {
			screenShot();
			e.getMessage();
		}
	}

	public static void validateTextt(WebElement we, String expectedText, String elementName) {
		String actualText = WebUtils.toVerifyGetText(we);
		if (actualText.equals(expectedText)) {

			test.log(Status.INFO, MarkupHelper.createLabel("", ExtentColor.GREEN));

		} else {

		}
	}

	public static void uploadFile(WebElement we, String fullfilepath) {
		try {
			boolean status = elementStatus(we);
			if (status == true) {

				we.sendKeys(fullfilepath);
				test.log(Status.INFO, MarkupHelper.createLabel("", ExtentColor.GREEN));

			} else {

			}
		} catch (Exception e) {

		}

	}

	public static void getSizeHeight(WebElement we, int height) {
		try {
			boolean status = elementStatus(we);
			if (status == true) {

				Dimension a = elementSize(we);
				int h = a.getHeight();

				if (h == height) {
					test.log(Status.INFO,
							MarkupHelper.createLabel("height verified with expected values.", ExtentColor.GREEN));
				} else
					test.log(Status.FAIL,
							MarkupHelper.createLabel("height mismatched  with expected values.", ExtentColor.RED));
			}
		} catch (Exception e) {
			screenShot();
			e.getMessage();
		}
	}

	public static Dimension elementSize(WebElement element) {
		Dimension measurement = element.getSize();
		return measurement;
	}

	public static void validateSizeWidth(WebElement we, int width) {
		try {
			boolean status = elementStatus(we);
			if (status == true) {

				Dimension a = elementSize(we);

				int w = a.getWidth();
				if (w == width) {
					test.log(Status.INFO,
							MarkupHelper.createLabel(" width verified with expected values.", ExtentColor.GREEN));
				} else
					test.log(Status.FAIL,
							MarkupHelper.createLabel(" width mismatched  with expected values.", ExtentColor.RED));
			}
		} catch (Exception e) {
			screenShot();
			e.getMessage();
		}
	}

	public static void validateLocation(WebElement we, int x_cordinate, int y_cordinate) {
		try {
			boolean status = elementStatus(we);

			if (status == true) {

				Point p = we.getLocation();
				int xcordinate = p.getX();
				int ycordinate = p.getY();
				if (xcordinate == x_cordinate && ycordinate == y_cordinate) {
					test.log(Status.INFO, MarkupHelper.createLabel(
							"value of x cordinate " + xcordinate + "value of y cordinate" + ycordinate + "matched",
							ExtentColor.GREEN));
				} else {
					test.log(Status.FAIL, MarkupHelper.createLabel(
							"value of x cordinate " + xcordinate + "value of y cordinate" + ycordinate + " Not matched",
							ExtentColor.GREEN));
				}
			} else {
				test.log(Status.FAIL, MarkupHelper.createLabel("Element is not displayed", ExtentColor.RED));
			}
		} catch (Exception e) {
			screenShot();
			e.getMessage();
		}
	}

	public static Point elementLocation(WebElement we) {

		Point p = we.getLocation();
		return p;
	}

	public static void CloseBrowser() {

		driver.close();
		test.log(Status.INFO, MarkupHelper.createLabel("close browser successfully", ExtentColor.GREEN));

	}

	public static void getcssValue(WebElement we, String cssValue, String elementName) {
		try {
			boolean status = elementStatus(we);
			if (status == true) {
				we.getCssValue(cssValue);
				test.log(Status.INFO, MarkupHelper.createLabel(elementName + "color is matched", ExtentColor.GREEN));
			} else {

				test.log(Status.FAIL, MarkupHelper.createLabel(elementName + "color is not matched", ExtentColor.RED));
			}
		} catch (Exception e) {

			screenShot();
			e.getMessage();
		}

	}
        public static void windowHandle(WebElement we) {
        	
        boolean status=	elementStatus(we);
        if(status == true) {
        	
        	driver.switchTo().window(getTimeStamp());
        	
        }
	  
  }
}
