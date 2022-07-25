package com.Super_Admin;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pace_Base.Base_Pace;

public class TC_Report extends Base_Pace {

	Login_Page Login_page;
	Create_PACE_Project_Page PACE;
	Report_Page report;
	
	public TC_Report()
	{
		super();
	}
	
	
	@BeforeClass
	public void TestSetup() throws InterruptedException {
		Initialization();
		Login_page = new Login_Page();
		PACE = new Create_PACE_Project_Page();
		report = new Report_Page();
		PACE = Login_page.Create_New_Project(prop.getProperty("user_email"),prop.getProperty("user_pass"));
		logger.info("****** Verify Login Successfully ******");
		Thread.sleep(1000);
}
	
	@Test(priority = 1)
	public void Accounting_Report() throws InterruptedException
	{
		report.Accounting_Report();
		
	}
	
	@Test(priority = 2)
	public void Funding_Report() throws InterruptedException
	{
		report.Funding_Report();
		
	}
	
	@Test(priority = 3)
	public void Sales_Report() throws InterruptedException
	{
		report.Sales_Report();
		
	}
	
	@Test(priority = 4)
	public void Compliance_Report() throws InterruptedException
	{
		report.Compliance_Report();
		
	}
	
	
}