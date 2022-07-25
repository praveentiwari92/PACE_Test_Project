package com.Super_Admin;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Pace_Base.Base_Pace;

public class Sign_on_browser_mail_and_reminder_function_Page extends Base_Pace
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

	@FindBy(className  = "CRB-right") 
	WebElement Save_First_Applicant;

	@FindBy(className  = "CRB-right") 
	WebElement Save_First_Contributor;

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
	
	// Contract Tab 
	
		@FindBy(xpath="//a[@id='send-contract-tab-link']")
		WebElement contract_tabs;
		
		@FindBy(xpath="//div[contains(text(),'Select Product Type')]")
		WebElement Product_drp;
		
		@FindBy(xpath="//span[normalize-space()='PACE']")
		WebElement Select_Product_type;
		
		@FindBy(xpath="//div[contains(text(),'Select In-Home Salesperson')]")
		WebElement Salesperson_drp;
		
		
		@FindBy(xpath="//div[@class='dropdown bootstrap-select form-control home-salespersons show']//li[2]//a[1]//span[2]")
		WebElement Salesperson_drp_Value;
		
		@FindBy(xpath="//body/div[9]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/div[1]/div[1]")
		WebElement Program_drp;
		
		@FindBy(xpath="//div[contains(@class,'DCA-programe-box')]//div[contains(@class,'col-md-4 half-box')]//li[6]//a[1]//span[2]")
		WebElement Program_drp_value;
		
		@FindBy(xpath="//div[contains(text(),'Select Term')]")
		WebElement Select_term;
		
		@FindBy(xpath="//span[normalize-space()='5']")
		WebElement Select_term_value;
		
		@FindBy(xpath="//div[contains(text(),'Select Improvement Type')]")
		WebElement Select_Improvement_Type;
		
		@FindBy(xpath="//span[normalize-space()='Air Conditioning']")
		WebElement Select_Improvement_Value;
		
		@FindBy(xpath="//div[contains(text(),'Select Manufacturer')]")
		WebElement Select_Manufacturer_Type;
		
		@FindBy(xpath="//span[normalize-space()='AC Pro']")
		WebElement Select_Manufacturer_Value;
		
		
		@FindBy(id="contract-addendum-improvement-types-0-qty")
		WebElement Quantity_Value;
		
		
		@FindBy(id="total-project-cost")
		WebElement Cost_Value;
		
		@FindBy(xpath="//span[@class='validate-text']")
		WebElement Validate_Btn;
		
		@FindBy(xpath="//button[normalize-space()='Attest']")
		WebElement Attest_Btn;
		
		@FindBy(xpath="//button[normalize-space()='Proceed']")
		WebElement Proceed_Btn;
		
		//	@FindBy(xpath="//input[@value='Void & Resign Contract in Browser']") 
		
		@FindBy(xpath="//input[@value='Sign Contract in Browser']")
		WebElement Sign_Contract_Btn;
		
		@FindBy(xpath="//div[@class='mt-5 mb-5']")
		WebElement Signature_Btn;
	
		
		// Initializing page object
		public Sign_on_browser_mail_and_reminder_function_Page()
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
			try {
			if(driver.findElement(By.xpath("//strong[@id='AER-eligible-list']")).isDisplayed())
			{
				System.out.println("Project is eligible for contract");
			}

			else {
				System.out.println("Project is not eligible for contract");

			}
			}catch (Exception e) {
				System.out.println(e);
			}
			Thread.sleep(20000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,450)", "");

			Thread.sleep(7000);	
			Next_Btn.click();
			System.out.println("**** Address Eligible Verified Successfully ****");
			
			}
		
		public void Credit_Application_Tab() throws InterruptedException
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,450)", "");
			Thread.sleep(1000);
			F_Name.clear();	
			Thread.sleep(1000);
			F_Name.sendKeys("Poll");
			Thread.sleep(1000);
			L_Name.clear();
			Thread.sleep(1000);
			L_Name.sendKeys("Testcase");
			Thread.sleep(1000);
			Email.sendKeys("poll@yopmail.com");
			Thread.sleep(1000);
			Phone.sendKeys("(934) 834-6389");
			Thread.sleep(1000);
			EstProjectCost.sendKeys("500000");
			
			Thread.sleep(2000);
			
			
			fill_now_btn.click();

			Thread.sleep(5000);

			// store window handle ids
			ArrayList<String> w = new ArrayList<String>(driver.getWindowHandles());
			//switch to open tab
			driver.switchTo().window(w.get(1));
			System.out.println("New tab title: " + driver.getTitle());
			Submit_Application.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy(0,450)", "");
			
			Thread.sleep(1000);
			PrpopetyInfo_Next_Btn.click();
			Thread.sleep(4000);
			SSN_No.sendKeys("00000000");
			Thread.sleep(2000);
			SSN_No.sendKeys("2");
			Thread.sleep(2000);
			DOB.sendKeys("05/12/1988");
			Thread.sleep(3000);
			Annual_Income.sendKeys("800000");
			Thread.sleep(2000);
			Save_First_Applicant.click();
			
			Thread.sleep(3000);
			
//			List<WebElement> cheklist = driver.findElements(By.xpath("//form[@id='addCertificationForm']//input[@type='checkbox']"));
//			
//			for(int i=0; i<cheklist.size(); i++)
//			{
//				cheklist.get(i).click();
//				System.out.println(cheklist.get(i).getAttribute("value"));
//			}
			
			
			checkbox1.click();
			
			checkbox2.click();
			
			checkbox3.click();
			
			checkbox4.click();
			
			Thread.sleep(2000);
			certifications_submit_button.click();
			
			Thread.sleep(2000);
			popup_checkbox.click();
			
			Credit_Signature_submit_button.click();
			
			// store window handle ids
			ArrayList<String> ww = new ArrayList<String>(driver.getWindowHandles());
			//switch to open tab
			driver.close();
			driver.switchTo().window(ww.get(0));
			Thread.sleep(1000);
			System.out.println("**** Applicant Details Send to Credit Portal Successfully ****");
					
		}
		
		
		
		public void Submit_Contract() throws InterruptedException
		{
			
			
			contract_tabs.click();
			
			Product_drp.click();
			Select_Product_type.click();
			Thread.sleep(2000);
			
			Salesperson_drp.click();
			Thread.sleep(2000);
			
			Select se = new Select(driver.findElement(By.xpath("//select[@id='home-salesperson-id']")));
			se.selectByValue("30136");
			
			Program_drp.click();
			Thread.sleep(1000);
			Select Prog = new Select(driver.findElement(By.xpath("//select[@id='program-id']")));			
			Prog.selectByValue("6");
			Thread.sleep(2000);
			
			Select Term = new Select(driver.findElement(By.xpath("//select[@id='term']")));
			Term.selectByValue("15");
			
			Cost_Value.sendKeys("40000");
			Thread.sleep(2000);				
			
			Select improve= new Select(driver.findElement(By.xpath("//select[@id='contract-addendum-improvement-types-0-improvement-type-id']")));
			improve.selectByValue("4");
			
			Thread.sleep(2000);
			Quantity_Value.sendKeys("12");
			
			Thread.sleep(2000);
			Validate_Btn.click();
			Thread.sleep(3000);
			
			Sign_Contract_Btn.click();
			Thread.sleep(3000);
			
			Attest_Btn.click();
			Thread.sleep(1000);
			
			Proceed_Btn.click();
			
			Thread.sleep(25000);
			Signature_Btn.click();
			
			ArrayList<String> w = new ArrayList<String>(driver.getWindowHandles());
			//switch to open tab
			driver.switchTo().window(w.get(1));	
			Thread.sleep(2000);
			driver.close();
			driver.switchTo().window(w.get(0));
			
			driver.findElement(By.xpath("//div[@class='modal-dialog modal-add custom-modal']//button[@aria-label='Close']")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[normalize-space()='Send Reminder']")).click();
			Thread.sleep(2000);
			 WebElement msg = driver.findElement(By.xpath("//div[@id='swal2-content']"));
		     System.out.println("Reminder mail status: " + msg.getText());
			
			driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[normalize-space()='More ...']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@id='sendemail']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//textarea[@id='email_message']")).sendKeys("Please submit Contract documents");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@id='btn-send-email']")).click();
			Thread.sleep(1000);
			
			Thread.sleep(1000);
			if(driver.findElement(By.xpath("//div[@class='toast-message']")).isDisplayed())
			{
				System.out.println("***** Email Sent Successfully");
				
			}
			else {
				System.out.println("***** Email Failed to send");
			}
			
			Thread.sleep(1000);
					
		}
}
