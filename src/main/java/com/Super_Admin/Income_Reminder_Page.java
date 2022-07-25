package com.Super_Admin;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Pace_Base.Base_Pace;

public class Income_Reminder_Page extends Base_Pace {

	
	// View Project
	@FindBy(xpath = "//tbody/tr[2]/td[11]/div[1]/a[1]")
	WebElement project_no;

	@FindBy(xpath = "//span[normalize-space()='Unsecured']")
	WebElement UNS_Project;
	
	@FindBy(xpath = "//a[@class='income-document stop-propagation doc-pending']//img")
	WebElement View_Documents;
	
	@FindBy(xpath = "//a[normalize-space()='Send Reminder']")
	WebElement Send_Reminder;
	
	@FindBy(xpath = "//div[@class='toast-message']")
	WebElement Toast_Message;
	
	// Initializing page object
	public Income_Reminder_Page()
	{
		PageFactory.initElements(driver, this);
	}

	public void View_UNS_Project() throws InterruptedException
	{
		project_no.click();
		Thread.sleep(2000);
		UNS_Project.click();
		Thread.sleep(3000);
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,1550)", "");	
		
		View_Documents.click();
		
		// store window handle ids
		ArrayList<String> ww = new ArrayList<String>(driver.getWindowHandles());
		//switch to open tab
		driver.switchTo().window(ww.get(2));
		
		Thread.sleep(3000);
		Send_Reminder.click();
		
		if(Toast_Message.isDisplayed())
		{
			
			System.out.println("******** Notification Sent Successfully ***********");
		}
		else {
			System.out.println("Something Went Wrong......");
		}
			
	}		
			
}
