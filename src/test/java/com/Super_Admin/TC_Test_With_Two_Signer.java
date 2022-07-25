package com.Super_Admin;

	
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pace_Base.Base_Pace;

public class TC_Test_With_Two_Signer extends Base_Pace{
	
	Login_Page Login_page;
	Test_With_Two_Signer_Page Multi_Signer_project;
	Create_PACE_Project_Page PACE;
	
	public TC_Test_With_Two_Signer()
	{
		super();
	}
	
	@BeforeClass
	public void TestSetup() throws InterruptedException {
		Initialization();
		Login_page = new Login_Page();
		Multi_Signer_project = new Test_With_Two_Signer_Page();
		PACE = Login_page.Create_New_Project(prop.getProperty("user_email"),prop.getProperty("user_pass"));
		Thread.sleep(1000);
		
		
//		driver.findElement(By.xpath("//div[@id='toggleWrapper']//li[1]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@class='project-details-box']//li[3]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//h2[@class='title']//a[contains(text(),'Contract')]")).click();

}
	
	@Test(priority = 1)
	public void New_Project() throws InterruptedException {
		Multi_Signer_project.New_Project();
	}
	
	// Eligibility Tab
	@Test(priority = 2)
	public void Select_Contractor() throws InterruptedException
	{		
		Multi_Signer_project.Select_Contractor();
		
	}

	@Test(priority = 3)
	public void Credit_Application_Tab() throws InterruptedException
	{		
		Multi_Signer_project.Credit_Application_Tab();
	
	}
	
	@Test(priority = 4)
	public void Login_to_Credit_Portal() throws InterruptedException
	{	
		Thread.sleep(3000);
		driver.navigate().to("https://testcredit.homerunportal.com/");  
		Multi_Signer_project.Credit_portal_Login();
	}
	
	@Test(priority = 5)
	public void View_Project() throws InterruptedException
	{	
		Thread.sleep(3000);
		Multi_Signer_project.View_Project();
						
	}
	
	@Test(priority = 6)
	public void Submit_Contract() throws InterruptedException
	{	
		Thread.sleep(3000);
		Multi_Signer_project.Submit_Contract();
						
	}
}