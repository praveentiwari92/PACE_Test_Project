package com.Super_Admin;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pace_Base.Base_Pace;

public class TC_Add_Applicant_After_Submit_Contract extends Base_Pace{

	Login_Page login_Page;
	Create_PACE_Project_Page PACE;
	Add_Applicant_After_Submit_Contract Submit_Contract;
	
	public TC_Add_Applicant_After_Submit_Contract()
	{
		super();
	}
	
	@BeforeClass
	public void TestSetup() throws InterruptedException {
		Initialization();
		login_Page = new Login_Page();
		Submit_Contract = new Add_Applicant_After_Submit_Contract();
		PACE = login_Page.Create_New_Project(prop.getProperty("user_email"),prop.getProperty("user_pass"));
		logger.info("****** Verify Login Successfully ******");
		Thread.sleep(1000);
//		driver.navigate().refresh();
//		driver.findElement(By.xpath("//div[@id='toggleWrapper']//li[1]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@class='project-details-box']//li[3]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//h2[@class='title']//a[contains(text(),'Contract')]")).click();
	
	}
	
	
	@Test(priority = 1)
	public void New_Project() throws InterruptedException {
		Submit_Contract.New_Project();
	}
	
	// Eligibility Tab
	@Test(priority = 2)
	public void Select_Contractor() throws InterruptedException
	{		
		Submit_Contract.Select_Contractor();
		
	}

	@Test(priority = 3)
	public void Credit_Application_Tab() throws InterruptedException
	{			
		Submit_Contract.Credit_Application_Tab();
	
	}
	
	@Test(priority = 4)
	public void Submit_Contract() throws InterruptedException
	{	
		Thread.sleep(3000);
		Submit_Contract.Submit_Contract();
						
	}
	
}
