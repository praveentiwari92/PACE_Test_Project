package com.Super_Admin;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Pace_Base.Base_Pace;

public class Add_Bank_Page extends Base_Pace{
	
	String Send_NTP = "https://uat.homerunportal.com/crons/sendProjectNtp/";
	String Get_msg = "http://uat.homerunportal.com/crons/getMessagesFromActiveQueue";
	String Invoice = "https://uat.homerunportal.com/crons/generateFundingInvoice/";
	
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
	
	// Add Bank 
	
	@FindBy(xpath = "//button[normalize-space()='Bank']") 
	WebElement Add_Bank_Btn;
	
	@FindBy(xpath = "//button[normalize-space()='Open Here (Bank)']") 
	WebElement Open_Here_Btn;
	
	@FindBy(xpath = "//button[normalize-space()='Continue']") 
	WebElement Continue_Btn_1;
	
	@FindBy(xpath = "//h2[normalize-space()='Chase']") 
	WebElement Select_Chase;
	
	@FindBy(xpath = "//span[normalize-space()='Continue']") 
	WebElement Continue_Btn_2;
	
	@FindBy(id = "username") 
	WebElement Username;
	
	@FindBy(id = "password") 
	WebElement Password;
	
	@FindBy(id="submit-credentials")
	WebElement Submit_Credentials;
	
	@FindBy(id="submit-device")
	WebElement submit_device;
	
	@FindBy(id="code")
	WebElement code;
	
	@FindBy(id="submit-code")
	WebElement submit_code;

	@FindBy(id="checking")
	WebElement checking;
	
	@FindBy(id="submit-accounts")
	WebElement submit_accounts;
	
	@FindBy(id="terms")
	WebElement terms;
	
	@FindBy(id="submit-confirmation")
	WebElement submit_confirmation;
	
	@FindBy(xpath="//div[normalize-space()='Plaid Checking']")
	WebElement Plaid_Checking;
	
	@FindBy(xpath="//span[normalize-space()='Continue']")
	WebElement Continue_Btn_3;
	
	@FindBy(xpath="//span[normalize-space()='Continue']")
	WebElement Continue_Btn_4;
	
	@FindBy(xpath="//button[@class='swal2-cancel swal2-styled']")
	WebElement Done_Btn;
	
	
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
	
	// Add_Bank_From_More_Menu
	
	@FindBy(xpath="//a[normalize-space()='More ...']") 
	WebElement More_Btn;
	
	@FindBy(xpath="//a[normalize-space()='Bank Link']") 
	WebElement Add_Bank_Link;
	
	@FindBy(xpath="//td[@class='bank-link-btn-web']//button[@type='button'][normalize-space()='Open Here (Bank)']") 
	WebElement Open_Here_Btn2;
	
	
	
	public Add_Bank_Page()
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
			Search_Contractor.sendKeys("Dell Contractor");
			Select_Contractor.click();
			Enter_Address.clear();
			Enter_Address.sendKeys("3410 Montgomery Drive");
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
				System.out.println("Project is eligible for contract");
			}

			else {
				System.out.println("Project is not eligible for contract");

			}

			Thread.sleep(20000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,450)", "");

			Thread.sleep(8000);	
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
			F_Name.sendKeys("harry");
			Thread.sleep(1000);
			L_Name.clear();
			Thread.sleep(1000);
			L_Name.sendKeys("Testcase");
			Thread.sleep(1000);
			Email.sendKeys("harry3@yopmail.com");
			Thread.sleep(1000);
			Phone.sendKeys("(963) 915-6521");
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

			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy(0,450)", "");

			Thread.sleep(3000);
			PrpopetyInfo_Next_Btn.click();
			Thread.sleep(2000);
			SSN_No.sendKeys("00000000");
			Thread.sleep(2000);
			SSN_No.sendKeys("2");
			Thread.sleep(2000);
			DOB.sendKeys("05/12/1988");
			Thread.sleep(3000);
			Annual_Income.sendKeys("800000");
			Thread.sleep(2000);
			
			// Add Bank 
			Add_Bank_Btn.click();
			Thread.sleep(2000);
			
			Open_Here_Btn.click();
			Thread.sleep(2000);
			
			driver.switchTo().frame("plaid-link-iframe-1");
			Thread.sleep(1000);
			Continue_Btn_1.click();			
			Thread.sleep(2000);
			Select_Chase.click();	
			Thread.sleep(2000);
			Continue_Btn_2.click();	
			Thread.sleep(2000);
			
			ArrayList<String> wr = new ArrayList<String>(driver.getWindowHandles());
			//switch to open tab
			driver.switchTo().window(wr.get(2));
			Thread.sleep(2000);
		
			
			Username.sendKeys("user_good");
			Thread.sleep(1000);
			
			Password.sendKeys("pass_good");
			Thread.sleep(1000);
			
			Submit_Credentials.click();
			Thread.sleep(1000);
			
			submit_device.click();
			Thread.sleep(1000);
			
			code.sendKeys("111");
			Thread.sleep(1000);
			
			submit_code.click();
			Thread.sleep(1000);
			
			checking.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js11 = (JavascriptExecutor) driver;
			js11.executeScript("window.scrollBy(0,750)", "");
			
			Thread.sleep(1000);
			submit_accounts.click();
			Thread.sleep(2000);
			
			JavascriptExecutor js12 = (JavascriptExecutor) driver;
			js12.executeScript("window.scrollBy(0,750)", "");
			
			Thread.sleep(1000);
			terms.click();
						
			Thread.sleep(1000);
			submit_confirmation.click();
			
			
			ArrayList<String> win = new ArrayList<String>(driver.getWindowHandles());
			//switch to open tab
			driver.switchTo().window(win.get(1));
			driver.switchTo().frame("plaid-link-iframe-1");
			Thread.sleep(2000);
			driver.getTitle();
			
			Plaid_Checking.click();
			Thread.sleep(1000);
			
			Continue_Btn_3.click();
			
			Thread.sleep(2000);
			Continue_Btn_4.click();
			
		// Back to Main Window	
			driver.switchTo().defaultContent();
			
			Thread.sleep(5000);
			Done_Btn.click();
			
			Thread.sleep(1000);										
			Save_First_Applicant.click();

			Thread.sleep(2000);

			checkbox1.click();

			checkbox2.click();

			checkbox3.click();

			checkbox4.click();

			Thread.sleep(2000);
			certifications_submit_button.click();

			Thread.sleep(2000);
			popup_checkbox.click();

			Credit_Signature_submit_button.click();

			System.out.println("**** Applicant Details Send to Credit Portal Successfully ****");

			Close_window.click();
			
			System.out.println("****** Bank Added Successfully from Credit Application Page *******");
			
			ArrayList<String> pr_win = new ArrayList<String>(driver.getWindowHandles());
			//switch to open tab
			driver.switchTo().window(pr_win.get(0));
		}
	
		public void Add_Bank_From_More_Menu() throws InterruptedException
		{
			JavascriptExecutor js12 = (JavascriptExecutor) driver;
			js12.executeScript("window.scrollBy(0,-750)", "");
			Thread.sleep(2000);
			More_Btn.click();
			Thread.sleep(2000);
			Add_Bank_Link.click();
			Thread.sleep(2000);
			
			Open_Here_Btn2.click();
			Thread.sleep(2000);
			
			driver.switchTo().frame("plaid-link-iframe-1");
			Thread.sleep(1000);
			Continue_Btn_1.click();			
			Thread.sleep(2000);
			Select_Chase.click();	
			Thread.sleep(2000);
			Continue_Btn_2.click();	
			Thread.sleep(2000);
			
			ArrayList<String> wr = new ArrayList<String>(driver.getWindowHandles());
			//switch to open tab
			driver.switchTo().window(wr.get(1));
			Thread.sleep(2000);
		
			
			Username.sendKeys("user_good");
			Thread.sleep(1000);
			
			Password.sendKeys("pass_good");
			Thread.sleep(1000);
			
			Submit_Credentials.click();
			Thread.sleep(1000);
			
			submit_device.click();
			Thread.sleep(1000);
			
			code.sendKeys("111");
			Thread.sleep(1000);
			
			submit_code.click();
			Thread.sleep(1000);
			
			checking.click();
			Thread.sleep(1000);
			
			JavascriptExecutor js11 = (JavascriptExecutor) driver;
			js11.executeScript("window.scrollBy(0,750)", "");
			
			Thread.sleep(1000);
			submit_accounts.click();
			Thread.sleep(2000);
			
			JavascriptExecutor more = (JavascriptExecutor) driver;
			more.executeScript("window.scrollBy(0,750)", "");
			
			Thread.sleep(1000);
			terms.click();
			
			
			Thread.sleep(1000);
			submit_confirmation.click();
			Thread.sleep(2000);
			
			ArrayList<String> win = new ArrayList<String>(driver.getWindowHandles());
			//switch to open tab
			driver.switchTo().window(win.get(0));
			driver.switchTo().frame("plaid-link-iframe-1");
			Thread.sleep(2000);
			driver.getTitle();
			
			Plaid_Checking.click();
			Thread.sleep(1000);
			
			Continue_Btn_3.click();
			
			Thread.sleep(2000);
			Continue_Btn_4.click();
			
			
			driver.switchTo().defaultContent();
			Thread.sleep(5000);
			Done_Btn.click();
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			System.out.println("****** Bank Added Successfully from more menu *******");
			
		}
	
}
