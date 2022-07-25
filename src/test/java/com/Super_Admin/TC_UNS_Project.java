package com.Super_Admin;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pace_Base.Base_Pace;

public class TC_UNS_Project extends Base_Pace
{

	Login_Page Login_page;
	
	Create_PACE_Project_Page PACE;
	
	UNS_Project_Page UNS;
	
	public TC_UNS_Project()
	{
		super();
	}
	

	@BeforeClass
	public void TestSetup() throws InterruptedException {
		Initialization();
		Login_page = new Login_Page();
		PACE = new Create_PACE_Project_Page();
		UNS = new UNS_Project_Page();
		PACE = Login_page.Create_New_Project(prop.getProperty("user_email"),prop.getProperty("user_pass"));
		logger.info("****** Verify Login Successfully ******");
		Thread.sleep(1000);
//		driver.navigate().refresh();
//		driver.findElement(By.xpath("//div[@id='toggleWrapper']//li[1]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@class='project-details-box']//li[5]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//h2[@class='title']//a[contains(text(),'Funding')]")).click();
	
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
		UNS.View_UNS_Project();
						
	}
	
	
	@Test(priority = 6)
	public void Submit_UNS_Contract() throws InterruptedException
	{	
		Thread.sleep(3000);
		UNS.Submit_UNS_Contract();
						
	}
	
	@Test(priority = 7)
	public void Submit_NTP() throws InterruptedException
	{	
		Thread.sleep(3000);
		UNS.Submit_NTP();
		
						
	}
	
	@Test(priority = 8)
	public void Funding_Tab() throws Exception
	{	
		Thread.sleep(3000);
		UNS.Funding_Tab();
	}
}
