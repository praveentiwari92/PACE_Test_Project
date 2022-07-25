package com.Super_Admin;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.Pace_Base.Base_Pace;

public class Delete_Applicant_In_Mobile_App_Page extends Base_Pace
{

	@FindBy(xpath = "//button[@class='btn btn-cta btn-red']")
	WebElement New_Project;
	
	@FindBy(linkText = "Eligibility")
	WebElement Eligibility;
	
	@FindBy(xpath = "//div[contains(text(),'Select Contractor/Selling Org')]")
	WebElement OpenContractorDrp;
	
	@FindBy(xpath = "//input[@aria-label='Search']")
	WebElement Search_Contractor;
	
	@FindBy(xpath = "//a[@class='dropdown-item active']")
	WebElement Select_Contractor;
	
	@FindBy(name = "address[street_address]")
	WebElement Enter_Address;
	
	@FindBy(id = "address-unit")
	WebElement Enter_Unit;
	
	@FindBy(xpath = "//input[@id='check-eligibility']")
	WebElement Submit_Btn;
	
	@FindBy(id = "wma-wizard-btn") 
	WebElement Next_Btn;
	
	// Credit_Application_Tab
	
	@FindBy(id = "credit-application-applicants-0-app-first-name") 
	WebElement F_Name;
	
	@FindBy(id = "credit-application-applicants-0-app-last-name") 
	WebElement L_Name;

	@FindBy(id = "credit-application-email") 
	WebElement Email;
	
	@FindBy(id = "credit-application-phone") 
	WebElement Phone;
	
	@FindBy(id = "estimated_project_cost") 
	WebElement EstProjectCost;
	
	@FindBy(xpath="//input[@value='Fill Application Now']")
	WebElement fill_now_btn;
	
	@FindBy(xpath="//button[contains(text(),'credit application')]")
	WebElement Submit_Application;
	
	@FindBy(id = "submit-button") 
	WebElement PrpopetyInfo_Next_Btn;
	
	@FindBy(xpath = "//a[normalize-space()='NEXT']") 
	WebElement Cont_PrpopetyInfo_Next_Btn;
	
	@FindBy(id = "applicant-detail-tracker") 
	WebElement SSN_No;
	
	@FindBy(id = "applicant-detail-pro-date") 
	WebElement DOB;
	
	@FindBy(id = "app-gross-annual-income") 
	WebElement Annual_Income;
	
	// Add Second Applicant
	
	
	@FindBy(xpath= "//a[normalize-space()='Add New Applicant']") 
	WebElement Add_New_Applicant;
	
	@FindBy(id= "app-first-name") 
	WebElement First_Name;
	
	@FindBy(xpath= "//label[normalize-space()='Contributor']") 
	WebElement Contributtor;
	
	@FindBy(xpath= "//input[@id='app-last-name']") 
	WebElement Last_Name;
	
	@FindBy(xpath= "//input[@id='applicant-detail-tracker']") 
	WebElement SSN_Number;
	
	@FindBy(xpath= "//input[@id='applicant-detail-pro-date']") 
	WebElement Applicant_DOB;
	
	@FindBy(xpath= "//input[@id='app-email']") 
	WebElement Applicant_Email;
	
	@FindBy(xpath= "//input[@id='app-phone']") 
	WebElement Applicant_Number;
	
	@FindBy(xpath= "//input[@id='app-gross-annual-income']") 
	WebElement Applicant_Income;
	
	@FindBy(xpath= "//button[@id='submit-button']") 
	WebElement Next_Button;
	
	@FindBy(xpath= "//a[normalize-space()='Remove']") 
	WebElement Delete_Button;
	
	@FindBy(xpath= "//button[normalize-space()='Remove']") 
	WebElement Delete_Confirm;
	
	@FindBy(xpath= "//label[@for='cert-con-0']")
	WebElement checkbox1;
	
	@FindBy(xpath= "//label[@for='cert-con-1']")
	WebElement checkbox2;
	
	@FindBy(xpath= "//label[@for='cert-con-2']")
	WebElement checkbox3;
	
	@FindBy(xpath= "//label[@for='common-checkbox-1']")
	WebElement checkbox4;
	
	@FindBy(id="submit-button-new")
	WebElement certifications_submit_button;
	
	@FindBy(xpath="//label[normalize-space()='I consent to a credit pull and title check']")
	WebElement popup_checkbox;
	
	@FindBy(xpath="//button[@id='submit-button']")
	WebElement Credit_Signature_submit_button;
	
	@FindBy(xpath="//a[contains(text(),'Close Window')]")
	WebElement Close_window;

	// End of Submit applicant process for two applicant

	
	
	// Initializing page object
			public Delete_Applicant_In_Mobile_App_Page()
			{
				PageFactory.initElements(driver, this);
			}
	
	
			public void New_Project() throws InterruptedException
			{
				New_Project.click();
				Thread.sleep(2000);
				Eligibility.click();
			}
			
			public void Select_Contractor() throws InterruptedException
			{
				Thread.sleep(2000);
				OpenContractorDrp.click();
				Search_Contractor.sendKeys("Dell Contractor Punet");
				Select_Contractor.click();
				Enter_Address.clear();
				Enter_Address.sendKeys("3785 Wilshire Boulevard");
				Thread.sleep(2000);
				Enter_Address.sendKeys(Keys.DOWN);
				Enter_Address.sendKeys(Keys.ENTER);
				Thread.sleep(2000);
				Enter_Unit.sendKeys("100");
				Thread.sleep(2000);
				Submit_Btn.click();
				Thread.sleep(4000);
				if(driver.findElement(By.xpath("//strong[@id='AER-eligible-list']")).isDisplayed())
				{
					System.out.println("******** Project is eligible for contract ********");
				}

				else {
					System.out.println("******** Project is not eligible for contract ********");

				}
				
				Thread.sleep(20000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,450)", "");

				Thread.sleep(5000);	
				Next_Btn.click();
				System.out.println("******** Address Eligible Verified Successfully ********");
				
				}
			
			public void Credit_Application_Tab() throws InterruptedException
			{
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,450)", "");
				Thread.sleep(1000);
				F_Name.clear();
				Thread.sleep(1000);
				F_Name.sendKeys("sweety");
				Thread.sleep(1000);
				L_Name.clear();
				Thread.sleep(1000);
				L_Name.sendKeys("Testcase");
				Thread.sleep(1000);
				Email.sendKeys("demo0511@yopmail.com");
				Thread.sleep(1000);
				Phone.sendKeys("(974) 734-6384");
				Thread.sleep(1000);
				EstProjectCost.sendKeys("500000");
				
				Thread.sleep(2000);
				
				
				fill_now_btn.click();

				Thread.sleep(5000);

				// store window handle ids
				ArrayList<String> w = new ArrayList<String>(driver.getWindowHandles());
				//switch to open tab
				driver.switchTo().window(w.get(1));
				
				Submit_Application.click();
				
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js1.executeScript("window.scrollBy(0,450)", "");
				
				Thread.sleep(2000);
				PrpopetyInfo_Next_Btn.click();
				Thread.sleep(2000);
				System.out.println("******** User on SSN number page **********");
				SSN_No.sendKeys("000-00-0001");
				Thread.sleep(2000);
				DOB.sendKeys("05/12/1988");
				Thread.sleep(3000);
				Annual_Income.sendKeys("800000");
				Thread.sleep(2000);
							
				// Add Second Applicant
				
				Add_New_Applicant.click();
				Thread.sleep(4000);
				
				First_Name.sendKeys("harry");
				Thread.sleep(2000);
				Last_Name.sendKeys("Testcase");
				Thread.sleep(2000);
				SSN_Number.sendKeys("000-00-0002");
				Thread.sleep(2000);
				Applicant_DOB.sendKeys("12/12/1989");
				Thread.sleep(2000);
				Applicant_Email.sendKeys("harry@yopmail.com");
				Thread.sleep(2000);
				Applicant_Number.sendKeys("(974) 734-6383");
				Thread.sleep(2000);
				Applicant_Income.sendKeys("800000");
				Thread.sleep(2000);	
				Next_Button.click();
				Thread.sleep(2000);	
				driver.findElement(By.xpath("//span[normalize-space()='Second Applicant']")).click();
				Thread.sleep(2000);	
				Delete_Button.click();
				Thread.sleep(1000);
				Delete_Confirm.click();
				Thread.sleep(2000);
				if(driver.findElement(By.xpath("//i[@class='fa fa-check']")).isDisplayed())
				{
					System.out.println("******** Applicant Deleted Successfully ********");
				}
				else{
					System.out.println("Applicant Not Deleted");
				}	

				Thread.sleep(2000);
				Next_Button.click();
				Thread.sleep(3000);
				
				checkbox1.click();
				
				checkbox2.click();
				
				checkbox3.click();
				
				checkbox4.click();
				
				Thread.sleep(2000);
				certifications_submit_button.click();
				
				Thread.sleep(2000);
				popup_checkbox.click();
				
				Credit_Signature_submit_button.click();
				
				Thread.sleep(2000);
//				Close_window.click();
				
				System.out.println("**** Applicant Details Send to Credit Portal Successfully ****");
			}			
			
}
