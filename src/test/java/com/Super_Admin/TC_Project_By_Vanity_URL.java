package com.Super_Admin;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pace_Base.Base_Pace;

public class TC_Project_By_Vanity_URL extends Base_Pace
{

	Login_Page Login_page;

	Create_PACE_Project_Page PACE;

	Project_By_Vanity_URL_Page Vanity;


	public TC_Project_By_Vanity_URL()
	{
		super();
	}


	@BeforeClass
	public void TestSetup() throws InterruptedException
	{
		Initialization();
		Vanity = new Project_By_Vanity_URL_Page();
		Thread.sleep(1000);
	}	

	@Test(priority = 1)
	public void Submit_Application() throws InterruptedException
	{
		driver.get("https://test.homerunportal.com/v/punet");
		Vanity.Submit_Application();
		Thread.sleep(2000);


	}

	@Test(priority = 2)
	public void Login_to_Credit_Portal() throws InterruptedException
	{	
		driver.get("https://testcredit.homerunportal.com/");
		Thread.sleep(3000);  
		Vanity.Credit_portal_Login();

	}


	@Test(priority = 3)
	public void View_Project() throws InterruptedException
	{	
		Thread.sleep(3000);
		Vanity.View_Project();
		Thread.sleep(2000);

	}


	@Test(priority = 4)
	public void Contract_page() throws InterruptedException
	{
		driver.get("https://test.homerunportal.com");
		Login_page = new Login_Page();
		PACE = new Create_PACE_Project_Page();
		PACE = Login_page.Create_New_Project(prop.getProperty("user_email"),prop.getProperty("user_pass"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='toggleWrapper']//li[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='project-details-box']//li[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h2[@class='title']//a[contains(text(),'NTP')]")).click();
		Vanity.Submit_UNS_Contract();

	}

	@Test(priority = 5)
	public void Submit_NTP() throws InterruptedException
	{	
		Thread.sleep(3000);
		Vanity.Submit_NTP();


	}

	@Test(priority = 6)
	public void Funding_Tab() throws Exception
	{	
		Thread.sleep(3000);
		Vanity.Funding_Tab();
	}

}