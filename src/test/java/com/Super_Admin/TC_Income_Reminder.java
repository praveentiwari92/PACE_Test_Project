package com.Super_Admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pace_Base.Base_Pace;

public class TC_Income_Reminder extends Base_Pace
{

Login_Page Login_page;
	
	Create_PACE_Project_Page PACE;
	
	Income_Reminder_Page Income;
	
	public TC_Income_Reminder()
	{
		super();
	}
	
	@BeforeClass
	public void TestSetup() throws InterruptedException {
		Initialization();
		Login_page = new Login_Page();
		PACE = new Create_PACE_Project_Page();
		Income = new Income_Reminder_Page();
		PACE = Login_page.Create_New_Project(prop.getProperty("user_email"),prop.getProperty("user_pass"));
		logger.info("****** Verify Login Successfully ******");
		Thread.sleep(1000);
		
	}
	
	@Test(priority = 1)
	public void New_Project() throws InterruptedException {
		PACE.New_Project();
	}
	
	// Eligibility Tab
	@Test(priority = 2)
	public void Select_Contractor() throws InterruptedException
	{		
		PACE.Select_Contractor();

	}
	
	@Test(priority = 3)
	public void Credit_Application_Tab() throws InterruptedException
	{		
		PACE.Credit_Application_Tab();
	
	}
	
	@Test(priority = 4)
	public void Login_to_Credit_Portal() throws InterruptedException
	{	
		Thread.sleep(3000);
		driver.navigate().to("https://testcredit.homerunportal.com/");  
		PACE.Credit_portal_Login();
						
	}
	
	@Test(priority = 5)
	public void View_UNS_Project() throws InterruptedException
	{	
		Thread.sleep(3000);
		Income.View_UNS_Project();
						
	}
	
	
	
}