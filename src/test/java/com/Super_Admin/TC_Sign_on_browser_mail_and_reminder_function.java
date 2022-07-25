package com.Super_Admin;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pace_Base.Base_Pace;

public class TC_Sign_on_browser_mail_and_reminder_function extends Base_Pace
{
	Login_Page Login_page;
	
	Create_PACE_Project_Page PACE;
	
	Sign_on_browser_mail_and_reminder_function_Page notification;
	
	
	public TC_Sign_on_browser_mail_and_reminder_function()
	{
		super();
	}
	

	@BeforeClass
	public void TestSetup() throws InterruptedException {
		Initialization();
		Login_page = new Login_Page();
		PACE = new Create_PACE_Project_Page();
		notification = new Sign_on_browser_mail_and_reminder_function_Page();
		PACE = Login_page.Create_New_Project(prop.getProperty("user_email"),prop.getProperty("user_pass"));
		logger.info("****** Verify Login Successfully ******");
		Thread.sleep(1000);

//		driver.findElement(By.xpath("//div[@id='toggleWrapper']//li[1]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@class='project-details-box']//li[3]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//h2[@class='title']//a[contains(text(),'Contract')]")).click();
	
	}
	

	@Test(priority = 1)
	public void New_Project() throws InterruptedException {
		notification.New_Project();
	}
	
	// Eligibility Tab
	@Test(priority = 2)
	public void Select_Contractor() throws InterruptedException
	{		
		notification.Select_Contractor();

	}
	
	@Test(priority = 3)
	public void Credit_Application_Tab() throws InterruptedException
	{		
		notification.Credit_Application_Tab();
	
	}
	
	
	@Test(priority = 4)
	public void Submit_UNS_Contract() throws InterruptedException
	{	
		Thread.sleep(3000);
		notification.Submit_Contract();
						
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
