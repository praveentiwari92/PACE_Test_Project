package com.Super_Admin;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Pace_Base.Base_Pace;

public class Login_Page extends Base_Pace
{

	@FindBy(id = "email")
	WebElement user_email;
	
	@FindBy(id = "password")
	WebElement user_pass;
	
	@FindBy(xpath = "//input[@value='Sign In']")
	WebElement Login_Btn;
	

	
	
	
	// Initializing page object
		public Login_Page()
		{
			PageFactory.initElements(driver, this);
		}
	
		
		public Create_PACE_Project_Page Create_New_Project(String un, String pw)
		{
			user_email.sendKeys(un);
			user_pass.sendKeys(pw);
			Login_Btn.click();
			return new Create_PACE_Project_Page();
			
		}
		
		
}
