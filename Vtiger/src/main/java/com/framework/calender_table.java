package com.framework;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentReports;

public class calender_table {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Calendar  c=Calendar.getInstance();
		c.add(Calendar.DATE, 30);
		Date d=c.getTime();
		DateFormat df=new SimpleDateFormat("d_MMM");
		String Date=df.format(d);
		System.out.println(Date);
		
		String[] stsplit=Date.split("_");
		String day=stsplit[0];
		String month=stsplit[1];
		ExtentReports reports= WebUtils.extendReports("myrepport");
		WebUtils.launchBrowser_openUrl("chrome", "https://erail.in//");
		Thread.sleep(5000);
		WebElement we=WebUtils.getElement("xpath","//input[@value=\"28-Jun-23 Wed\"]");
		WebUtils.actionClick(we);
		Thread.sleep(5000);
	    WebElement we1=WebUtils.getElement("xpath","//td[contains(text(),'"+month+"'])//parent::tr/following-sibling::tr//td[text()='"+day+"']");
	    WebUtils.actionClick(we1);
	    Thread.sleep(5000);
	    reports.flush();
	    
	}

}
