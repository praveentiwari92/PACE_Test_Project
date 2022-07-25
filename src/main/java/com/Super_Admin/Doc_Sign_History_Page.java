package com.Super_Admin;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.spi.ThreadContextMap;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Pace_Base.Base_Pace;
import com.gargoylesoftware.htmlunit.javascript.host.webkitURL;

public class Doc_Sign_History_Page extends Base_Pace {
	
	@FindBy(xpath = "//div[@class='PRAMS-search']//input[@id='search']") 
	WebElement Search_Project;
	
	@FindBy(id = "mCSB_1_container") 
	WebElement Open_Project;
	
	@FindBy(xpath = "//a[normalize-space()='More ...']") 
	WebElement Open_More_Menu;
	
	@FindBy(xpath = "//a[normalize-space()='DocuSign History']") 
	WebElement Open_Doc_Sign_History;
	
	@FindBy(xpath = "//div[@class='modal-dialog modal-add custom-modal doc-signing-history']//button[@aria-label='Close']") 
	WebElement Close_popup;
	
	@FindBy(xpath = "//a[normalize-space()='Activity']") 
	WebElement Activity_Log;
	
	public Doc_Sign_History_Page()
	{
		PageFactory.initElements(driver, this);
	}

	public void Search_Projects() throws InterruptedException
	{
		Search_Project.sendKeys("6002944");
		Search_Project.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		Open_Project.click();
		Thread.sleep(2000);
		
	}
	
	public void Doc_Sign_History() throws InterruptedException {
		Open_More_Menu.click();
		Thread.sleep(1000);
		Open_Doc_Sign_History.click();
		
		 System.out.println("***************** Doc-Sign History **************************"); 
		 
			WebElement table = driver.findElement(By.xpath("//div[@class='doc-signing-area']"));
			
			List<WebElement> tableheaders = driver.findElements(By.xpath("//div[@class='doc-signing-mid']"));
			
			 
			//printing all the table header values
	        
	        for (WebElement headername : tableheaders) {   
	            String text = headername.getText();
	            System.out.println(text);
	        }
	        
	        System.out.println("******************************************");
		Thread.sleep(1000);
        Close_popup.click();
	}
	
	public void Activity_Logs() throws InterruptedException {
	
	  // Open Activity Log
	        System.out.println("***************** Activity Logs Started **************************");
	        Thread.sleep(2000);
	        Open_More_Menu.click();
	        Thread.sleep(1000);
	        Activity_Log.click();
	        Thread.sleep(2000);
	        
	        List<WebElement> namesElements = driver.findElements(By.xpath("//div[@class='customize-table-body']"));
			 
			 List<String> names = new ArrayList<String>();
			 
			 for (WebElement namesElement : namesElements)
			 {
				 names.add(namesElement.getText());

			 }

			 String nextButtonClassName =driver.findElement(By.xpath("//img[@alt='next']")).getAttribute("class");

			 while(!nextButtonClassName.contains("next"))
			 {
				 driver.findElement(By.xpath("//img[@alt='next']")).click();
				 Thread.sleep(2000);
				 namesElements = driver.findElements(By.xpath("//div[@class='customize-table-body']"));

				 for (WebElement namesElement : namesElements) 
				 {
					 names.add(namesElement.getText());
					 
				 }
				
				 try {
					 nextButtonClassName =driver.findElement(By.xpath("//img[@alt='next']")).getAttribute("class");
				 }catch(Exception e)
				 {
					 System.out.println("******* No More Activity Available Now *******");
					 break;
				 }
				
			 }
			 for(String name : names)
			 {
				 System.out.println(name);
			 }
			 System.out.println("******************************************");
			 int totalNames = names.size();
			 System.out.println("Total Number of Pages:" + totalNames);

			 String DisplayedCount = driver.findElement(By.xpath("//span[@class='d-flex ml-auto']")).getText().split(" ")[5];

			 System.out.println("Total Numbe of Displayed Activity:" + DisplayedCount);
			 System.out.println("***************** Activity Logs Ended **************************");

			 // Assert.assertEquals(DisplayedCount, String.valueOf(totalNames));
			 Thread.sleep(20000);
	}

	
}

