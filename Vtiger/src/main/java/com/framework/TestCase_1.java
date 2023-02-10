package com.framework;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentReports;

public class TestCase_1 {
	public static void main(String[] args) {
		
		testCase1();
	}

		public static void testCase1() {
		
        ExtentReports reports=  WebUtils.extendReports("MyReport");
		WebUtils.launchBrowser_openUrl("chrome", "http:localhost:8888");
		WebUtils.getSizeHeight(WebUtils.getElement("name", "user_name"), 22);
		WebUtils.validateSizeWidth(WebUtils.getElement("name", "user_name"), 140);
		WebUtils.validateLocation(WebUtils.getElement("name", "user_name"), 632,230);
		WebElement we=WebUtils.getElement("name","user_name");
		WebUtils.toSendValue(we, "admin", "userName box");
	    WebUtils.toSendValue(WebUtils.getElement("name", "user_password"),"admin", "password box");
		WebUtils.toClick(WebUtils.getElement("name", "Login"));
		WebUtils.toClick(WebUtils.getElement("xpath", "//a[text()='Marketing']"));
		WebUtils.toClick(WebUtils.getElement("xpath", "//a[text()='Leads']"));
		WebUtils.toClick(WebUtils.getElement("xpath","//img[@title=\"Create Lead...\"]"));
		WebUtils.handleDropdownbyText(WebUtils.getElement("xpath","//select[@name=\"salutationtype\"]"), "Mr.");
		WebUtils.toSendValue(WebUtils.getElement("name", "firstname"),"AhirBrand", "firstname box");
		WebUtils.toSendValue(WebUtils.getElement("name", "lastname"), "jaunpur","lastName box");
		WebUtils.toSendValue(WebUtils.getElement("name", "company"), "Infotech privet Limited","company name box");
		WebUtils.handleDropdownbyText(WebUtils.getElement("name", "leadsource"), "Cold Call");
		WebUtils.handleDropdownbyText(WebUtils.getElement("name", "leadstatus"), " Cold");
		WebUtils.toSendValue(WebUtils.getElement("name", "mobile"), " 8115802778","mobile number box");
		WebUtils.toSendValue(WebUtils.getElement("name", "country"), "India","country box");
		WebUtils.toSendValue(WebUtils.getElement("name", "state"), "UttarPradesh","state name box");
		WebUtils.toSendValue(WebUtils.getElement("name", "lane"), "Bhadohi","lane name box");
		WebUtils.toSendValue(WebUtils.getElement("name", "designation"), "Hi this Mr yadav Task to Create new Lead","designation name box");
        WebUtils.toClick(WebUtils.getElement("xpath","//textarea[@name='description']//parent::td//parent::tr//preceding-sibling::tr//input[@title='Save [Alt+S]']"));
        WebUtils.reportFlush(reports);
          
		}
		
		public static void testCase2() {
			
		WebUtils.launchBrowser_openUrl("chrome", "https:flipkart.in");
		//WebUtils.elementSize();
		
		}
 
}
