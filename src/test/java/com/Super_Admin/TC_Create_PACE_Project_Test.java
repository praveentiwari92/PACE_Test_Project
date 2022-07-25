package com.Super_Admin;



import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pace_Base.Base_Pace;

public class TC_Create_PACE_Project_Test extends Base_Pace
{
		
	Login_Page Login_page;
	
	Create_PACE_Project_Page create_project;
	
	public TC_Create_PACE_Project_Test()
	{
		super();
	}
	
	@BeforeClass
	public void TestSetup() throws InterruptedException {
		Initialization();
		Login_page = new Login_Page();
		create_project = Login_page.Create_New_Project(prop.getProperty("user_email"),prop.getProperty("user_pass"));
		logger.info("****** Verify Login Successfully ******");
		Thread.sleep(1000);
		
//		driver.findElement(By.xpath("//div[@id='toggleWrapper']//li[1]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@class='project-details-box']//li[4]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//h2[@class='title']//a[contains(text(),'NTP')]")).click();
	
		
	}
	
	@Test(priority = 1)
	public void New_Project() throws InterruptedException {
		create_project.New_Project();
	}
	
	// Eligibility Tab
	@Test(priority = 2)
	public void Select_Contractor() throws InterruptedException
	{		
		create_project.Select_Contractor();
		
	}

	@Test(priority = 3)
	public void Credit_Application_Tab() throws InterruptedException
	{		
		create_project.Credit_Application_Tab();
	
	}
	
	@Test(priority = 4)
	public void Login_to_Credit_Portal() throws InterruptedException
	{	
		Thread.sleep(3000);
		driver.navigate().to("https://testcredit.homerunportal.com/");  
		create_project.Credit_portal_Login();
						
	}
	
	@Test(priority = 5)
	public void View_Project() throws InterruptedException
	{	
		Thread.sleep(3000);
		create_project.View_Project();
						
	}
	
	@Test(priority = 6)
	public void Submit_Contract() throws InterruptedException
	{	
		Thread.sleep(3000);
		create_project.Submit_Contract();
						
	}
	
	@Test(priority = 7)
	public void Submit_NTP() throws InterruptedException
	{	
		Thread.sleep(3000);
		create_project.Submit_NTP();
		
						
	}
	
	@Test(priority = 8)
	public void Funding_Tab() throws InterruptedException, IOException
	{
		
		create_project.Funding_Tab();
	}
	
}
