package com.Super_Admin;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Pace_Base.Base_Pace;

public class Two_Signers_and_Contributors_Page extends Base_Pace
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
	
	// Login to Credit Portal

	@FindBy(xpath = "//input[@id='email']")
	WebElement credit_email;

	@FindBy(xpath = "//input[@id='password']")
	WebElement credit_pass;

	@FindBy(xpath = "//input[@value='Sign In']")
	WebElement CreditLogin_Btn;

	// View Project

	@FindBy(xpath = "//tbody/tr[2]/td[11]/div[1]/a[1]")
	WebElement project_no;

	@FindBy(xpath = "//span[contains(text(),'PACE')]")
	WebElement PACE_Project;

	@FindBy(xpath = "//tbody/tr[2]/td[3]/p[1]/input[1]")
	WebElement VERIFIED_INCOME;


	// Add new applicant

	@FindBy(xpath = "//tbody/tr[@class='edit-default-app-name']/td[4]/div[1]/div[1]/a[1]/div[1]/img[1]")
	WebElement Add_Btn;

	@FindBy(xpath = "//input[@id='add_applicant_first_name']")
	WebElement F_name_of_secnd_applicant;

	@FindBy(xpath = "//input[@id='add_applicant_last_name']")
	WebElement L_name_of_secnd_applicant;

	@FindBy(xpath = "//input[@id='add_applicant_email']")
	WebElement Email_of_secnd_applicant;

	@FindBy(xpath = "//input[@id='add_applicant_phone']")
	WebElement Phone_No_of_secnd_applicant;

	@FindBy(xpath = "//label[normalize-space()='Contributor']")
	WebElement Contributor;


	@FindBy(xpath = "//button[@value='fill_here']")
	WebElement Save_Btn_secnd_applicant;
	// End of new applicant Application


	@FindBy(id = "decision")
	WebElement decision_drp;

	@FindBy(xpath = "//select[@id='decision']//option[@value='Approved'][normalize-space()='Approved']")
	WebElement decision_status;

	@FindBy(xpath = "//input[@placeholder='Enter amount']")
	WebElement Approve_Amount;

	@FindBy(id = "btnUpdateAppStatus")
	WebElement Amt_Submit_btn;

	@FindBy(id = "submit_for_credit_final")
	WebElement submit_for_credit_final;

	@FindBy(xpath = "//button[normalize-space()='Yes']")
	WebElement Credit_Confirm_popup;

	@FindBy(id = "credit_final")
	WebElement Credit_Final_btn;

	@FindBy(xpath="//button[normalize-space()='Yes, continue']")
	WebElement Credit_Final_Popup;

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

	@FindBy(xpath="//label[@for='disclosureAccepted']") 
	WebElement Signature_Discloser_checkbox;

	@FindBy(xpath="//button[@id='action-bar-btn-continue']") 
	WebElement Continue_Btn;

	@FindBy(xpath="//span[normalize-space()='Start']") 
	WebElement Start_Btn;

	@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[1]/div[2]/div[1]/div[4]/div[1]/button[1]/div[1]/div[1]") 			  
	WebElement Initial_Sign_Btn_1;

	@FindBy(xpath="//button[normalize-space()='Adopt and Initial']") 
	WebElement Adopt_and_Initial_Btn;

	@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[3]/div[7]/div[1]/div[4]/div[1]/button[1]/div[1]/div[1]") 			  			   
	WebElement Initial_Sign_Btn_2;

	@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[5]/div[5]/div[1]/div[4]/div[1]/button[1]/div[1]/div[1]") 			  
	WebElement Initial_Sign_Btn_3;

	@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[5]/div[5]/div[1]/div[4]/div[2]/button[1]/div[1]/div[1]") 			  
	WebElement Initial_Sign_Btn_4;

	@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[5]/div[5]/div[1]/div[4]/div[3]/button[1]/div[1]/div[1]") 			  
	WebElement Initial_Sign_Btn_5;

	@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[5]/div[6]/div[1]/div[4]/div[1]/button[1]/div[1]/div[1]") 			  
	WebElement Initial_Sign_Btn_6;

	@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[5]/div[6]/div[1]/div[4]/div[2]/button[1]/div[1]/div[1]") 			  
	WebElement Initial_Sign_Btn_7;

	@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[5]/div[6]/div[1]/div[4]/div[3]/button[1]/div[1]/div[1]") 			  
	WebElement Initial_Sign_Btn_8;

	@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[5]/div[6]/div[1]/div[4]/div[4]/button[1]/div[1]/div[1]") 			  
	WebElement Initial_Sign_Btn_9;

	@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[5]/div[7]/div[1]/div[4]/div[1]/button[1]/div[1]/div[1]") 			  
	WebElement Initial_Sign_Btn_10;

	@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[7]/div[6]/div[1]/div[4]/div[1]/button[1]/div[1]/div[1]") 			  
	WebElement Initial_Sign_Btn_11;

	@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[7]/div[11]/div[1]/div[4]/div[1]/button[1]/div[1]/div[1]") 			  
	WebElement Initial_Sign_Btn_12;

	@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[7]/div[17]/div[1]/div[4]/div[1]/button[1]/div[1]/div[1]") 
	WebElement Initial_Sign_Btn_13;

	@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[9]/div[3]/div[1]/div[4]/div[2]/button[1]/div[1]/div[1]") 
	WebElement Initial_Sign_Btn_14;


	@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[13]/div[2]/div[1]/div[4]/div[1]/button[1]/div[1]/div[1]") 			   
	WebElement Initial_Sign_Btn_15;

	@FindBy(xpath="//body/div[@id='container']/div[5]/div[1]/div[1]/div[1]/button[1]") 
	WebElement Finish_Btn;

	@FindBy(xpath="//div[@class='alert alert-info alert-dismissible fade show mt-2']//div[2]") 
	WebElement sec_Applicant_Sign_Btn;


	@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[1]/div[2]/div[1]/div[4]/div[2]/button[1]/div[1]/div[1]") 			  			   
	WebElement Sign_Btn_1;

	@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[3]/div[7]/div[1]/div[4]/div[2]/button[1]/div[1]/div[1]") 			  			   
	WebElement Sign_Btn_2;

	@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[5]/div[5]/div[1]/div[4]/div[2]/button[1]/div[1]/div[1]") 
	WebElement Sign_Btn_3;

	@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[5]/div[5]/div[1]/div[4]/div[4]/button[1]/div[1]/div[1]") 
	WebElement Sign_Btn_4;

	@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[5]/div[5]/div[1]/div[4]/div[6]/button[1]/div[1]/div[1]")
	WebElement Sign_Btn_5;

	@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[5]/div[6]/div[1]/div[4]/div[2]/button[1]/div[1]/div[1]") 		
	WebElement Sign_Btn_6;

	@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[5]/div[6]/div[1]/div[4]/div[4]/button[1]/div[1]/div[1]") 
	WebElement Sign_Btn_7;

	@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[5]/div[6]/div[1]/div[4]/div[6]/button[1]/div[1]/div[1]") 
	WebElement Sign_Btn_8;

	@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[5]/div[6]/div[1]/div[4]/div[8]/button[1]/div[1]/div[1]") 
	WebElement Sign_Btn_9;

	@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[5]/div[7]/div[1]/div[4]/div[2]/button[1]/div[1]/div[1]") 
	WebElement Sign_Btn_10;

	@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[7]/div[6]/div[1]/div[4]/div[2]/button[1]/div[1]/div[1]") 
	WebElement Sign_Btn_11;

	@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[7]/div[11]/div[1]/div[4]/div[2]/button[1]/div[1]/div[1]") 
	WebElement Sign_Btn_12;

	@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[7]/div[17]/div[1]/div[4]/div[2]/button[1]/div[1]/div[1]") 
	WebElement Sign_Btn_13;

	@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[10]/div[3]/div[1]/div[4]/div[2]/button[1]/div[1]/div[1]") 
	WebElement Sign_Btn_14;

	@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[13]/div[2]/div[1]/div[4]/div[2]/button[1]/div[1]/div[1]") 
	WebElement Sign_Btn_15;

		
		
	// Initializing page object
	public Two_Signers_and_Contributors_Page()
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
			System.out.println("Project is eligible for contract");
		}

		else {
			System.out.println("Project is not eligible for contract");

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
		F_Name.sendKeys("sweety");
		Thread.sleep(1000);
		L_Name.clear();
		Thread.sleep(1000);
		L_Name.sendKeys("Testcase");
		Thread.sleep(1000);
		Email.sendKeys("demo0511@yopmail.com");
		Thread.sleep(1000);
		Phone.sendKeys("(974) 734-6389");
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
		Save_First_Applicant.click();

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
		//	Close_window.click();

		System.out.println("**** Applicant Details Send to Credit Portal Successfully ****");

	}	

	public void Credit_portal_Login()
	{

		credit_email.sendKeys("admin_credit@yopmail.com");
		credit_pass.sendKeys("123456");
		CreditLogin_Btn.click();
		System.out.println("**** Credit Portal Login Successfully ****");
	}

	public void View_Project() throws InterruptedException
	{
		project_no.click();
		Thread.sleep(2000);
		PACE_Project.click();
		Thread.sleep(3000);

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,1550)", "");

		VERIFIED_INCOME.clear();
		Thread.sleep(4000);
		VERIFIED_INCOME.sendKeys("700000");
		Thread.sleep(1000);
		VERIFIED_INCOME.sendKeys(Keys.TAB);
		Thread.sleep(4000);

		// Add 2nd Signer --->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

		driver.findElement(By.xpath("//tbody/tr[@class='edit-default-app-name']/td[5]/div[1]/div[1]/a[1]/div[1]/img[1]")).click();

		Thread.sleep(3000);

		F_name_of_secnd_applicant.sendKeys("Apex");
		L_name_of_secnd_applicant.sendKeys("Testcase");
		Email_of_secnd_applicant.sendKeys("apex@yopmail.com");
		Thread.sleep(1000);
		Phone_No_of_secnd_applicant.sendKeys("974) 734-6319");
		Thread.sleep(1000);
		Save_Btn_secnd_applicant.click();


		Thread.sleep(5000);

		// store window handle ids
		ArrayList<String> w = new ArrayList<String>(driver.getWindowHandles());
		//switch to open tab
		driver.switchTo().window(w.get(2));
		System.out.println("New tab title: " + driver.getTitle());
		Submit_Application.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)", "");

		Cont_PrpopetyInfo_Next_Btn.click();

		Thread.sleep(2000);
		SSN_No.sendKeys("00000000");
		Thread.sleep(2000);
		SSN_No.sendKeys("1");
		Thread.sleep(2000);
		DOB.sendKeys("05/12/1989");
		Thread.sleep(3000);
		Annual_Income.sendKeys("800000");
		Thread.sleep(2000);
		Save_First_Contributor.click();

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

		driver.findElement(By.xpath("//a[normalize-space()='Close Window']")).click();

		driver.switchTo().window(w.get(1));

		Thread.sleep(2000);

		// Add First Contributor ------>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

		driver.findElement(By.xpath("//tbody/tr[@class='edit-default-app-name']/td[5]/div[1]/div[1]/a[1]/div[1]/img[1]")).click();
		Thread.sleep(1000);
		F_name_of_secnd_applicant.sendKeys("praveen");
		L_name_of_secnd_applicant.sendKeys("Testcase");
		Email_of_secnd_applicant.sendKeys("pkt@yopmail.com");
		Thread.sleep(1000);
		Phone_No_of_secnd_applicant.sendKeys("974) 724-6319");
		Thread.sleep(1000);
		Contributor.click();
		Thread.sleep(1000);
		Save_Btn_secnd_applicant.click();
		Thread.sleep(2000);
		ArrayList<String> cc = new ArrayList<String>(driver.getWindowHandles());
		//switch to open tab
		driver.switchTo().window(cc.get(2));	

		Thread.sleep(3000);

		//	System.out.println("New tab title: " + driver.getTitle());
		Submit_Application.click();

		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("window.scrollBy(0,450)", "");

		Cont_PrpopetyInfo_Next_Btn.click();

		Thread.sleep(2000);
		SSN_No.sendKeys("00000000");
		Thread.sleep(2000);
		SSN_No.sendKeys("3");
		Thread.sleep(2000);
		DOB.sendKeys("05/12/1989");
		Thread.sleep(3000);
		Annual_Income.sendKeys("800000");
		Thread.sleep(2000);
		Save_First_Contributor.click();

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

		driver.findElement(By.xpath("//a[normalize-space()='Close Window']")).click();

		driver.switchTo().window(w.get(1));

		Thread.sleep(2000);


		// Add Contributor 2

		driver.findElement(By.xpath("//tbody/tr[@class='edit-default-app-name']/td[6]/div[1]/div[1]/a[1]/div[1]/img[1]")).click();
		Thread.sleep(1000);
		F_name_of_secnd_applicant.sendKeys("Abhi");
		L_name_of_secnd_applicant.sendKeys("Testcase");
		Email_of_secnd_applicant.sendKeys("abhi@yopmail.com");
		Thread.sleep(1000);
		Phone_No_of_secnd_applicant.sendKeys("974) 724-6318");
		Thread.sleep(1000);
		Contributor.click();
		Thread.sleep(1000);
		Save_Btn_secnd_applicant.click();
		Thread.sleep(2000);
		ArrayList<String> cc2 = new ArrayList<String>(driver.getWindowHandles());
		//switch to open tab
		driver.switchTo().window(cc2.get(2));	

		Thread.sleep(3000);

		//	System.out.println("New tab title: " + driver.getTitle());
		Submit_Application.click();

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,450)", "");

		Cont_PrpopetyInfo_Next_Btn.click();

		Thread.sleep(2000);
		SSN_No.sendKeys("00000000");
		Thread.sleep(2000);
		SSN_No.sendKeys("4");
		Thread.sleep(2000);
		DOB.sendKeys("06/14/1989");
		Thread.sleep(3000);
		Annual_Income.sendKeys("800000");
		Thread.sleep(2000);
		Save_First_Contributor.click();

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

		driver.findElement(By.xpath("//a[normalize-space()='Close Window']")).click();

		driver.switchTo().window(w.get(1));

		Thread.sleep(2000);


		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,-1550)", "");

		Thread.sleep(60000);
		driver.navigate().refresh();


		//	driver.navigate().refresh();
		Thread.sleep(2000);

		decision_drp.click();
		Thread.sleep(2000);

		decision_status.click();
		Thread.sleep(2000);

		Approve_Amount.clear();
		Thread.sleep(1000);

		Approve_Amount.sendKeys("500000");
		Thread.sleep(2000);
		Amt_Submit_btn.click();

		Thread.sleep(6000);
		submit_for_credit_final.click();
		Thread.sleep(2000);

		Credit_Confirm_popup.click();
		Thread.sleep(2000);

		Credit_Final_btn.click();
		Thread.sleep(3000);

		Credit_Final_Popup.click();

		// store window handle ids
		ArrayList<String> ww = new ArrayList<String>(driver.getWindowHandles());
		//switch to open tab
		driver.close();

		driver.switchTo().window(ww.get(0));	
		Thread.sleep(1000);

		System.out.println("**** Credit Status Final Successfully ****");
	}

	public void Submit_Contract() throws InterruptedException
	{

		contract_tabs.click();

		Product_drp.click();
		Select_Product_type.click();
		Thread.sleep(2000);

		Salesperson_drp.click();
		Thread.sleep(2000);
		Salesperson_drp_Value.click();
		Thread.sleep(1000);

		Program_drp.click();
		Thread.sleep(1000);
		Program_drp_value.click();

		Cost_Value.sendKeys("40000");

		Thread.sleep(2000);
		Select_Improvement_Type.click();
		Select_Improvement_Value.click();

		Thread.sleep(2000);
		Quantity_Value.sendKeys("25");

		//		Cost_Value.sendKeys("40000");
		Thread.sleep(2000);
		Validate_Btn.click();
		Thread.sleep(3000);

		Sign_Contract_Btn.click();
		Thread.sleep(3000);

		Attest_Btn.click();
		Thread.sleep(1000);

		Proceed_Btn.click();
		//	driver.findElement(By.xpath("//button[normalize-space()='Proceed']")).click();

		Thread.sleep(30000);
		Signature_Btn.click();


		// store window handle ids
		ArrayList<String> w = new ArrayList<String>(driver.getWindowHandles());
		//switch to open tab
		driver.switchTo().window(w.get(1));	
		Thread.sleep(15000);

		Signature_Discloser_checkbox.click();
		Thread.sleep(2000);
		Continue_Btn.click();
		Thread.sleep(2000);

		Start_Btn.click();

		Thread.sleep(2000);	
		Initial_Sign_Btn_1.click();
		Thread.sleep(2000);

		Adopt_and_Initial_Btn.click();
		Thread.sleep(5000);

		Initial_Sign_Btn_2.click();
		Thread.sleep(2000);

		Initial_Sign_Btn_3.click();
		Thread.sleep(2000);

		Initial_Sign_Btn_4.click();
		Thread.sleep(2000);

		Initial_Sign_Btn_5.click();
		Thread.sleep(2000);

		Initial_Sign_Btn_6.click();
		Thread.sleep(2000);

		Initial_Sign_Btn_7.click();
		Thread.sleep(2000);

		Initial_Sign_Btn_8.click();
		Thread.sleep(2000);

		Initial_Sign_Btn_9.click();
		Thread.sleep(2000);

		Initial_Sign_Btn_10.click();
		Thread.sleep(2000);

		Initial_Sign_Btn_11.click();
		Thread.sleep(2000);

		Initial_Sign_Btn_12.click();
		Thread.sleep(2000);


		Initial_Sign_Btn_13.click();
		Thread.sleep(2000);

		Initial_Sign_Btn_14.click();
		Thread.sleep(2000);

		Initial_Sign_Btn_15.click();
		Thread.sleep(2000);

		Finish_Btn.click();
		Thread.sleep(9000);

		sec_Applicant_Sign_Btn.click();

		ArrayList<String> wss = new ArrayList<String>(driver.getWindowHandles());
		//switch to open tab
		driver.switchTo().window(wss.get(2));	

		Thread.sleep(3000);
		Signature_Discloser_checkbox.click();

		Thread.sleep(1000);
		Continue_Btn.click();

		Start_Btn.click();

		Thread.sleep(2000);	
		Sign_Btn_1.click();
		Thread.sleep(2000);

		Adopt_and_Initial_Btn.click();
		Thread.sleep(5000);

		Sign_Btn_2.click();
		Thread.sleep(2000);

		Sign_Btn_3.click();
		Thread.sleep(2000);

		Sign_Btn_4.click();
		Thread.sleep(2000);

		Sign_Btn_5.click();
		Thread.sleep(2000);

		Sign_Btn_6.click();
		Thread.sleep(2000);

		Sign_Btn_7.click();
		Thread.sleep(2000);

		Sign_Btn_8.click();
		Thread.sleep(2000);

		Sign_Btn_9.click();
		Thread.sleep(2000);

		Sign_Btn_10.click();
		Thread.sleep(2000);

		Sign_Btn_11.click();
		Thread.sleep(2000);

		Sign_Btn_12.click();
		Thread.sleep(2000);

		Sign_Btn_13.click();
		Thread.sleep(2000);

		Sign_Btn_14.click();
		Thread.sleep(2000);

		Sign_Btn_15.click();
		Thread.sleep(2000);

		Finish_Btn.click();
		Thread.sleep(9000);

		if(driver.findElement(By.xpath("//h4[contains(text(),\"You're done!\")]")).isDisplayed())
		{
			System.out.println("Doc-Sign Process Completed for both Signature");
		}
		else {
			System.out.println("Doc-Sign Process Not Completed for both Signature");
		}


	}

	

}
