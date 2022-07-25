package com.Super_Admin;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pace_Base.Base_Pace;


public class TC_Login_Test extends Base_Pace
{

	Login_Page Login_page;
	Create_PACE_Project_Page PACE;
	
	public TC_Login_Test() {
		
		super();
	}
	
	
	@BeforeClass
	public void TestSetup() {
		Initialization();
		Login_page = new Login_Page();
	
	}
	
	@Test(priority = 1)
	public void Admin_Login()
	{
		try {
			Thread.sleep(6000);
			PACE = Login_page.Create_New_Project(prop.getProperty("user_email"),prop.getProperty("user_pass"));
			System.out.println("Student Login Successfully");
			
		} catch (InterruptedException e) {
			
			System.out.println("WebDriver couldn’t locate the element");
		}
		
	}
}
