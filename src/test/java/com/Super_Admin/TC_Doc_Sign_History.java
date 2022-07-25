package com.Super_Admin;

import javax.print.Doc;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pace_Base.Base_Pace;

public class TC_Doc_Sign_History extends Base_Pace {
	
	Login_Page Login_page;
	
	Create_PACE_Project_Page PACE;
	
	Doc_Sign_History_Page Doc_History;
	
	public TC_Doc_Sign_History()
	{
		super();
	}
	
	@BeforeClass
	public void TestSetup() throws InterruptedException {
		Initialization();
		Login_page = new Login_Page();
		PACE = new Create_PACE_Project_Page();
		Doc_History = new Doc_Sign_History_Page();
		PACE = Login_page.Create_New_Project(prop.getProperty("user_email"),prop.getProperty("user_pass"));
		logger.info("****** Verify Login Successfully ******");
		Thread.sleep(3000);
			
}
	
	@Test(priority = 1)
	public void Search_Project() throws InterruptedException
	{
		Doc_History.Search_Projects();
		
	}
	

	@Test(priority = 2)
	public void Doc_Sign_History() throws InterruptedException
	{
		Doc_History.Doc_Sign_History();
		
	}
	

	@Test(priority = 3)
	public void Activity_Logs() throws InterruptedException
	{
		Doc_History.Activity_Logs();
		
	}
	
	
	
	
}