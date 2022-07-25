package com.Super_Admin;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Pace_Base.Base_Pace;
import com.qa.Util.TC_TestUtil;

public class Decrease_Price_at_COC_Page extends Base_Pace 
{
	String Send_NTP = "https://test.homerunportal.com/crons/sendProjectNtp/";
	String Get_msg = "http://test.homerunportal.com/crons/getMessagesFromActiveQueue";
	String Invoice = "https://test.homerunportal.com/crons/generateFundingInvoice/";
	

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
	
	@FindBy(xpath = "//div[@class='wmawb-img text-center']") 
	WebElement Next_Btn;
	// End of Eligibility
	
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
		
		
		// Credit portal Login details 
		
		@FindBy(xpath = "//input[@id='email']")
		WebElement credit_email;
		
		@FindBy(xpath = "//input[@id='password']")
		WebElement credit_pass;
		
		@FindBy(xpath = "//input[@value='Sign In']")
		WebElement CreditLogin_Btn;
		

		@FindBy(xpath = "//tbody/tr[2]/td[11]/div[1]/a[1]")
		WebElement project_no;

		@FindBy(xpath = "//span[contains(text(),'PACE')]")
		WebElement PACE_Project;
		
		@FindBy(xpath = "//tbody/tr[2]/td[3]/p[1]/input[1]")
		WebElement VERIFIED_INCOME;
		
	// Credit Decision
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
		
		@FindBy(id="contract_addendum_improvement_types_1__qty_")
		WebElement Quantity_Value2;
			
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
		
		@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[2]/div[7]/div[1]/div[4]/div[1]/button[1]/div[1]/div[1]") 			  
		WebElement Initial_Sign_Btn_2;
		
		@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[3]/div[4]/div[1]/div[4]/div[1]/button[1]/div[1]/div[1]") 			  
		WebElement Initial_Sign_Btn_3;
		
		@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[3]/div[4]/div[1]/div[4]/div[2]/button[1]/div[1]/div[1]") 			  
		WebElement Initial_Sign_Btn_4;
		
		@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[3]/div[4]/div[1]/div[4]/div[3]/button[1]/div[1]/div[1]") 			  			
		WebElement Initial_Sign_Btn_5;
		
		@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[3]/div[4]/div[1]/div[4]/div[4]/button[1]/div[1]/div[1]") 			  
		WebElement Initial_Sign_Btn_6;
		
		@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[3]/div[5]/div[1]/div[4]/div[1]/button[1]/div[1]/div[1]") 			  
		WebElement Initial_Sign_Btn_7;
		
		@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[3]/div[5]/div[1]/div[4]/div[2]/button[1]/div[1]/div[1]") 			  
		WebElement Initial_Sign_Btn_8;
		
		@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[3]/div[6]/div[1]/div[4]/div[2]/button[1]/div[1]/div[1]") 			  
		WebElement Initial_Sign_Btn_9;
		
		@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[4]/div[9]/div[1]/div[4]/div[1]/button[1]/div[1]/div[1]") 			  
		WebElement Initial_Sign_Btn_10;
		
		@FindBy(xpath="//body/div[@id='container']/div[@id='envelope']/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/div[1]/section[4]/div[12]/div[1]/div[4]/div[1]/button[1]/div[1]/div[1]") 			  
		WebElement Initial_Sign_Btn_11;
		
		@FindBy(xpath="//body/div[@id='container']/div[5]/div[1]/div[1]/div[1]/button[1]") 
		WebElement Finish_Btn;
	
		@FindBy(xpath="//div[@class='modal-dialog modal-add custom-modal']//button[@aria-label='Close']") 
		WebElement Close_Popup;
		
		@FindBy(xpath="//button[@id='contractNxt']") 
		WebElement Next_btn;
		
		// ***************Submit NTP Tab *****************
		

		@FindBy(xpath="//button[normalize-space()='Approve']") 
		WebElement Approve_Btn;
		
		
		
		@FindBy(xpath="//div[@id='ntp_collapseFiveTerm']//button[@type='button'][normalize-space()='Success']") 
		WebElement TCC_Success_Btn;
		
		
		@FindBy(xpath="//label[@for='Term-Confirmation-Call-english']") 
		WebElement TCC_English;
		
		@FindBy(xpath="//label[normalize-space()='No']") 
		WebElement TCC_English_No;
		
		
		@FindBy(xpath="//button[@id='Term-Confirmation-Call']") 
		WebElement TCC_English_Done;
		
		// Courtesy Call
		@FindBy(xpath="//div[@id='ntp_collapseFiveCour']//button[@type='button'][normalize-space()='Success']") 
		WebElement CC_English_Btn;
		
		@FindBy(xpath="//label[@for='Courtesy-Call-english']") 
		WebElement CC_English;
		
		@FindBy(xpath="//div[@id='ntp_collapseFiveCour']//button[@type='button'][normalize-space()='Done']") 
		WebElement CC_English_Done;
		
		@FindBy(xpath="//button[@id='ntpNextStep']") 
		WebElement NTP_Next_Btn;
		
		// Funding Tab 
		
		@FindBy(id="generate-coi") 
		WebElement Generate_coi;
		
		@FindBy(xpath="//button[@data-type='projectcost']") 
		WebElement TPC_Confirm_Btn;
		
		@FindBy(xpath="//button[@data-type='termaddendum']") 
		WebElement Term_Confirm_Btn;
		
		
		@FindBy(xpath="//button[@data-type='rate']") 
		WebElement Rate_Confirm_Btn;
		
		
		@FindBy(xpath="//button[@data-type='fee']") 
		WebElement Fee_Confirm_Btn;
		
		@FindBy(xpath="//button[@data-type='netPayment']") 
		WebElement NetPayment_Confirm_Btn;
		
		@FindBy(xpath="//button[@data-type='transfer']") 
		WebElement Transfert_Confirm_Btn;
		
		
		@FindBy(xpath="//button[@data-type='account']") 
		WebElement Account_Confirm_Btn;
		
		@FindBy(xpath="//button[@data-type='routing']") 
		WebElement Routing_Confirm_Btn;
		
		@FindBy(xpath="//button[@data-type='contemail']") 
		WebElement Contemail_Confirm_Btn;
		
		@FindBy(xpath="//button[@data-type='contphone']") 
		WebElement Contphonel_Confirm_Btn;
		
		
		@FindBy(xpath="//button[normalize-space()='Attest']") 
		WebElement Attest_Confirm_Btn;
		
		@FindBy(xpath="//button[normalize-space()='Proceed']") 
		WebElement Proceed_Confirm_Btn;
		
		
		
	public Decrease_Price_at_COC_Page()
	{	 
		PageFactory.initElements(driver, this);
	}
	
	
	public void New_Project() throws InterruptedException
	{
		Thread.sleep(2000);
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
		Enter_Address.sendKeys("5142 Walrond Avenue");
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

		Thread.sleep(5000);	
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
		F_Name.sendKeys("Nisha");
		Thread.sleep(1000);
		L_Name.clear();
		Thread.sleep(1000);
		L_Name.sendKeys("Testcase");
		Thread.sleep(1000);
		Email.sendKeys("nisha@yopmail.com");
		Thread.sleep(1000);
		Phone.sendKeys("(945) 324-6383");
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
		SSN_No.sendKeys("000-00-0002");
		Thread.sleep(2000);
		DOB.sendKeys("05/12/1988");
		Thread.sleep(2000);
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
		
		Thread.sleep(3000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,-1550)", "");
		
		Thread.sleep(60000);
		driver.navigate().refresh();
		Thread.sleep(70000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		decision_drp.click();
		Thread.sleep(2000);
		decision_status.click();
		Thread.sleep(2000);
		Approve_Amount.clear();
		Thread.sleep(1000);
		Approve_Amount.sendKeys("500000");
		Thread.sleep(2000);
		Amt_Submit_btn.click();
		Thread.sleep(5000);
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
		
		Select se = new Select(driver.findElement(By.xpath("//select[@id='home-salesperson-id']")));
		se.selectByValue("30136");
		
	//	Program_drp.click();
		Thread.sleep(1000);
		Select Prog = new Select(driver.findElement(By.xpath("//select[@id='program-id']")));			
		Prog.selectByValue("25");
		Thread.sleep(2000);
		
		Select Term = new Select(driver.findElement(By.xpath("//select[@id='term']")));
		Term.selectByValue("10");
		
		Cost_Value.sendKeys("40000");
		Thread.sleep(2000);		
		
		Select improve= new Select(driver.findElement(By.xpath("//select[@id='contract-addendum-improvement-types-0-improvement-type-id']")));
		improve.selectByValue("6");
		
		Thread.sleep(2000);
		Quantity_Value.sendKeys("15");
		
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("window.scrollBy(0,300)", "");
		// add New Improvement
		driver.findElement(By.xpath("//span[normalize-space()='Add New']")).click();
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@title='Select Improvement Type']")).click();

		Thread.sleep(2000);	
		driver.findElement(By.xpath("//div[@aria-expanded='true']//span[@class='text'][normalize-space()='Air Sealing']")).click();
		Thread.sleep(2000);
		Quantity_Value2.sendKeys("15");
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
//		driver.findElement(By.xpath("//button[normalize-space()='Proceed']")).click();
//		Thread.sleep(30000);
		
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
				
		Finish_Btn.click();
		Thread.sleep(9000);
		
		driver.close();
		driver.switchTo().window(w.get(0));	
		
		Thread.sleep(2000);
		Close_Popup.click();
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Next_btn.click();
		
		System.out.println("**** Contract Send Successfully ****");
		
	}
	
	public void Submit_NTP() throws InterruptedException
	{
		//Upoad_Jurisdiction_Form.click();
		Thread.sleep(1000);
		driver.navigate().refresh();
		
		WebElement browse = driver.findElement(By.xpath("//div[@class='custom-upload-box S3filesContainer']//input[@name='file']"));
		
		String projectRootPath = TC_TestUtil.getProjectDirectory();
		
		if(TC_TestUtil.isWindows()) {
			browse.sendKeys(projectRootPath + "\\" +"Documents\\Document.pdf"); //Uploading the file using sendKeys
		}else {
			browse.sendKeys(projectRootPath + "/" +"Documents/Document.pdf"); //Uploading the file using sendKeys
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
//		Thread.sleep(2000);
//		Approve_Btn.click();
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(2000);
		TCC_Success_Btn.click();
		Thread.sleep(2000);
		TCC_English.click();
		Thread.sleep(2000);
		TCC_English_No.click();
		Thread.sleep(2000);
		TCC_English_Done.click();
		Thread.sleep(3000);
		
		CC_English_Btn.click();
		Thread.sleep(2000);
		CC_English.click();
		Thread.sleep(2000);
		CC_English_Done.click();
		Thread.sleep(2000);
		
		WebElement p=driver.findElement(By.xpath("//div[@class='custom-bread-left']//li[3]"));
	    //getText() to obtain text
		String s= p.getText();
		System.out.println("Project Number is : " + s);
	
		// Hit the send NTP API
		driver.switchTo().newWindow(WindowType.TAB);
		ArrayList<String> w = new ArrayList<String>(driver.getWindowHandles());
		//switch to open tab
		driver.switchTo().window(w.get(1));	
		Thread.sleep(2000);
		driver.get(Get_msg);
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		
		driver.get(Send_NTP+s); 
			
		Thread.sleep(3000);
		
		 WebElement text = driver.findElement(By.xpath("//body/br[2]"));
		   
         // Fetching the text using method and printing it     
         System.out.println("Element found using text: " + text.getText());
	
		
		Thread.sleep(2000);
		ArrayList<String> wr = new ArrayList<String>(driver.getWindowHandles());
		driver.close();
		driver.switchTo().window(wr.get(0));
		
		driver.navigate().refresh();
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='More ...']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Additional Review']")).click();
		
		Thread.sleep(1000);
		
		WebElement cheklist = driver.findElement(By.xpath("//label[@for='assessment']"));
						
		cheklist.click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='modal-dialog modal-add custom-modal modal-lock-project']//button[@aria-label='Close']")).click();
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		ArrayList<String> ww = new ArrayList<String>(driver.getWindowHandles());
		
		//switch to open tab
		driver.switchTo().window(ww.get(1));	
		
		driver.get(Get_msg);
		driver.navigate().refresh();
		
		Thread.sleep(8000);

		driver.switchTo().window(w.get(0));
		
		Thread.sleep(2000);
		ArrayList<String> we = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(we.get(1));
		driver.get(Send_NTP+s); 
		Thread.sleep(4000);
		driver.close();
		
		driver.switchTo().window(we.get(0));
		
		driver.navigate().refresh();
		Thread.sleep(8000);
		
		ArrayList<String> sndNtp = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(sndNtp.get(0));
		
		driver.get(Get_msg);
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.switchTo().window(sndNtp.get(0));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='More ...']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Additional Review']")).click();
		
		Thread.sleep(1000);
		
		WebElement cheklist2 = driver.findElement(By.xpath("//label[@for='applications']"));
						
		cheklist2.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='modal-dialog modal-add custom-modal modal-lock-project']//button[@aria-label='Close']")).click();
		Thread.sleep(1000);
		driver.get(Send_NTP+s); 
		Thread.sleep(4000);

		driver.navigate().back();
		//driver.switchTo().window(sndNtp.get(0));
		driver.navigate().refresh();
		
		
		driver.get(Get_msg);
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		driver.navigate().back();
		
		Thread.sleep(4000);
		driver.switchTo().window(sndNtp.get(0));
		driver.get(Send_NTP+s); 
		
		driver.navigate().back();
		
		
		
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("window.scrollBy(0,1050)", "");
		
		Thread.sleep(2000);
		NTP_Next_Btn.click();
		System.out.println("**** NTP Send Successfully ****");
	
	}
		@SuppressWarnings("deprecation")
		public void Funding_Tab() throws InterruptedException, IOException
		{
			Thread.sleep(1000);
			Generate_coi.click();
			Thread.sleep(2000);
			
			// Decrease project cost to 10%
			Thread.sleep(1000);
			driver.findElement(By.xpath("//body[1]/div[9]/div[2]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/a[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//body[1]/div[9]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]")).click();
			Thread.sleep(2000);
			Cost_Value.clear();
			Cost_Value.sendKeys("36000");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='send-coc']")).click();
			driver.findElement(By.xpath("//input[@id='send-coc']")).click();
			Thread.sleep(2000);
			
			Attest_Btn.click();
			Thread.sleep(1000);
			
			Proceed_Btn.click();
			Thread.sleep(2000);
			TPC_Confirm_Btn.click();
						
			Term_Confirm_Btn.click();
					
			Rate_Confirm_Btn.click();
						
			Fee_Confirm_Btn.click();
			NetPayment_Confirm_Btn.click();
			Transfert_Confirm_Btn.click();
			Account_Confirm_Btn.click();
			Routing_Confirm_Btn.click();
			Contemail_Confirm_Btn.click();
			Contphonel_Confirm_Btn.click();
			Attest_Confirm_Btn.click();
			Proceed_Confirm_Btn.click();
			
			Thread.sleep(2000);
			
			WebElement browse = driver.findElement(By.xpath("//form[@id='completion-ceritificate']//input[@name='file']"));
			
			String projectRootPath = TC_TestUtil.getProjectDirectory();
			
			if(TC_TestUtil.isWindows()) {
				browse.sendKeys(projectRootPath + "\\" +"Documents\\Document.pdf"); //Uploading the file using sendKeys
			}else {
				browse.sendKeys(projectRootPath + "/" +"Documents/Document.pdf"); //Uploading the file using sendKeys
			}
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
			

			Thread.sleep(5000);
			WebElement Inspection = driver.findElement(By.xpath("//div[contains(@class,'u-left NFU-form-left NFUFL-img link-with-upload S3filesContainer ml-2')]//input[@name='file']"));
			
			if(TC_TestUtil.isWindows()) 
			{
				Inspection.sendKeys(projectRootPath + "\\" +"Documents\\Document.pdf"); //Uploading the file using sendKeys
			}else {
				Inspection.sendKeys(projectRootPath + "/" +"Documents/Document.pdf"); //Uploading the file using sendKeys
			}
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//button[normalize-space()='Approve']")).click();
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[normalize-space()='Success']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[normalize-space()='English']")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[normalize-space()='No']")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='Completion-Call']")).click();
			Thread.sleep(2000);

			// Building Permit Approve

			WebElement Permit = driver.findElement(By.xpath("//div[@id='building-permit_div']//input[@name='file']"));


			if(TC_TestUtil.isWindows()) 
			{
				Permit.sendKeys(projectRootPath + "\\" +"Documents\\Document.pdf"); //Uploading the file using sendKeys
			}else {
				Permit.sendKeys(projectRootPath + "/" +"Documents/Document.pdf"); //Uploading the file using sendKeys
			}
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
			Thread.sleep(5000);

			driver.findElement(By.xpath("//input[@value='Approve']")).click();

			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
			Thread.sleep(2000);
					
		
			WebElement invoice =driver.findElement(By.xpath("//div[@class='custom-bread-left']//li[3]"));
		      //getText() to obtain text
			String project_number = invoice.getText();
			System.out.println("Project Number is : " + project_number);
			
			driver.switchTo().newWindow(WindowType.TAB);
			ArrayList<String> w = new ArrayList<String>(driver.getWindowHandles());
			//switch to open tab
			driver.switchTo().window(w.get(1));	
			
			driver.get(Invoice+project_number); 
			Thread.sleep(5000);
			driver.navigate().refresh();
			Thread.sleep(2000);
			driver.switchTo().window(w.get(0));
			
			driver.get(Get_msg);
			Thread.sleep(12000);
			
			driver.navigate().back();
			Thread.sleep(1000);
			
			driver.get(Invoice+project_number); 
			Thread.sleep(2000);
			driver.navigate().back();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@id='funding-tab-link']")).click();
			Thread.sleep(2000);
			
			WebElement invoices_No =driver.findElement(By.xpath("//span[contains(text(),'Invoice #')]"));
			String project_Invoice = invoices_No.getText();
			
			String test = project_Invoice;
			test= test.replace("Invoice #   ", "");
			System.out.println(test);
			
			Thread.sleep(2000);
			String filePath = (projectRootPath + "\\" +"Documents\\Sample.csv");
			
			BufferedWriter writer = Files.newBufferedWriter(Paths.get(filePath));
	        CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
	                .withHeader("Invoice Number", "Date"));

	        csvPrinter.printRecord(test, "07/10/2022");
	        csvPrinter.flush();
	        System.out.println("Invoice Id has been Written in the File");
			csvPrinter.close();
			
			WebElement ele = driver.findElement(By.xpath("//a[normalize-space()='More']"));

			//Creating object of an Actions class
			Actions action = new Actions(driver);

			//Performing the mouse hover action on the target element.
			action.moveToElement(ele).perform();
			
			Thread.sleep(2000);
			WebElement report = driver.findElement(By.xpath("//a[@title='Reports']"));
			Actions actions = new Actions(driver);
			actions.moveToElement(report).perform();
		
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@href='/reports']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//ul[@class='nav nav-pills']//li[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[normalize-space()='Daily Payment Report - Pace']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[normalize-space()='Run NOw']")).click();
			
			Thread.sleep(20000);
			driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[@id='toggleWrapper']//li[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@class='project-details-box']//li[5]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='fundingPanel']//a[contains(text(),'Funding')]")).click();
			
			
			
			WebElement elem = driver.findElement(By.xpath("//a[normalize-space()='More']"));

			//Creating object of an Actions class
			Actions action3 = new Actions(driver);

			//Performing the mouse hover action on the target element.
			action3.moveToElement(elem).perform();

			Thread.sleep(2000);
			WebElement reports = driver.findElement(By.xpath("//a[normalize-space()='Bulk Operations']"));
			Actions actions4 = new Actions(driver);
			actions4.moveToElement(reports).perform();

			driver.findElement(By.xpath("//a[normalize-space()='Invoice Status To Paid']")).click();
			
			
			Thread.sleep(5000);

			WebElement Invoice_Status = driver.findElement(By.xpath("//div[@id='change-invoice-status']//input[@name='importcsv']"));

			

			if(TC_TestUtil.isWindows()) {
				Invoice_Status.sendKeys(projectRootPath + "\\" +"Documents\\Sample.csv"); //Uploading the file using sendKeys
			}else {
				Invoice_Status.sendKeys(projectRootPath + "/" +"Documents/Sample.csv"); //Uploading the file using sendKeys
			}
			
			driver.findElement(By.xpath("//div[@id='change-invoice-status']//button[@type='button'][normalize-space()='Import']")).click();
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@id='funding-tab-link']")).click();
			
			 String t = "Paid";
		      // getPageSource() to get page source
		      if ( driver.getPageSource().contains("Paid")){
		         System.out.println("Text: " + t + "**** Project Funded **** ");
		      } else {
		         System.out.println("Text: " + t + "**** Project Not Funded **** ");
		      }

		}
	
	

	
	
	
}
