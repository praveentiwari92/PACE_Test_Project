package com.Super_Admin;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pace_Base.Base_Pace;

public class TC_two_signers_and_contributors extends Base_Pace
{

	Login_Page Login_page;
	Two_Signers_and_Contributors_Page two_signer_and_Contributor;
	Create_PACE_Project_Page PACE;
	
	public TC_two_signers_and_contributors()
	{
		super();
	}
	
	
	@BeforeClass
	public void TestSetup() throws InterruptedException {
		Initialization();
		Login_page = new Login_Page();
		PACE = Login_page.Create_New_Project(prop.getProperty("user_email"),prop.getProperty("user_pass"));
		Thread.sleep(1000);
	
}
	@Test(priority = 1)
	public void New_Project() throws InterruptedException {
		two_signer_and_Contributor.New_Project();
	}
	
	// Eligibility Tab
	@Test(priority = 2)
	public void Select_Contractor() throws InterruptedException
	{		
		two_signer_and_Contributor.Select_Contractor();
		
	}

	@Test(priority = 3)
	public void Credit_Application_Tab() throws InterruptedException
	{		
		two_signer_and_Contributor.Credit_Application_Tab();
	
	}


	@Test(priority = 4)
	public void Login_to_Credit_Portal() throws InterruptedException
	{	
		Thread.sleep(3000);
		driver.navigate().to("https://testcredit.homerunportal.com/");  
		two_signer_and_Contributor.Credit_portal_Login();
	}
	
	@Test(priority = 5)
	public void View_Project() throws InterruptedException
	{	
		Thread.sleep(3000);
		two_signer_and_Contributor.View_Project();
						
	}
	
	@Test(priority = 6)
	public void Submit_Contract() throws InterruptedException
	{	
		Thread.sleep(3000);
		two_signer_and_Contributor.Submit_Contract();
						
	}
	
	
	
	
}