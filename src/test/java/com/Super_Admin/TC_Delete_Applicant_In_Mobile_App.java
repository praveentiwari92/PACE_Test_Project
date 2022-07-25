package com.Super_Admin;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pace_Base.Base_Pace;


public class TC_Delete_Applicant_In_Mobile_App extends Base_Pace{
	
	Login_Page Login_Page;
	Delete_Applicant_In_Mobile_App_Page Delete_Applicant;
	Create_PACE_Project_Page PACE;
	
	public TC_Delete_Applicant_In_Mobile_App()
	{
		super();
	}
	
	
	@BeforeClass
	public void TestSetup() throws InterruptedException {
		Initialization();
		Login_Page = new Login_Page();
		Delete_Applicant = new Delete_Applicant_In_Mobile_App_Page();
		PACE = Login_Page.Create_New_Project(prop.getProperty("user_email"),prop.getProperty("user_pass"));
		Thread.sleep(1000);
		
		
//		driver.findElement(By.xpath("//div[@id='toggleWrapper']//li[1]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@class='project-details-box']//li[3]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//h2[@class='title']//a[contains(text(),'Contract')]")).click();

}
	
	@Test(priority = 1)
	public void New_Project() throws InterruptedException {
		Delete_Applicant.New_Project();
	}
	
	// Eligibility Tab
	@Test(priority = 2)
	public void Select_Contractor() throws InterruptedException
	{		
		Delete_Applicant.Select_Contractor();
		
	}

	@Test(priority = 3)
	public void Credit_Application_Tab() throws InterruptedException
	{		
		Delete_Applicant.Credit_Application_Tab();
	
	}
	
	
}
