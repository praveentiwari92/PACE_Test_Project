package com.Super_Admin;

import java.awt.Window;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Pace_Base.Base_Pace;

public class Report_Page extends Base_Pace {
	
	@FindBy(xpath = "//a[@href='/reports']")
	WebElement reports;
	
	@FindBy(xpath = "//ul[@class='nav nav-pills']//li[1]")
	WebElement Accounting;
	
	@FindBy(xpath = "//ul[@class='nav nav-pills']//li[2]")
	WebElement Funded;
	
	@FindBy(xpath = "//ul[@class='nav nav-pills']//li[3]")
	WebElement Sales;
	
	@FindBy(xpath = "//ul[@class='nav nav-pills']//li[4]")
	WebElement Compliance;
	
//	@FindBy(xpath = "//ul[@class='nav nav-pills']//li[5]")
//	WebElement Unsecured;
	
	@FindBy(xpath = "//button[normalize-space()='Run NOw']")
	WebElement Run_Report;
	
	@FindBy(xpath = "//a[normalize-space()='Export']")
	WebElement export;
	
	
	
	
// Initializing page object
	public Report_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
// Accounting Tab 	
	public void Accounting_Report() throws InterruptedException {
	WebElement ele = driver.findElement(By.xpath("//a[normalize-space()='More']"));
	Actions action = new Actions(driver);
	action.moveToElement(ele).perform();
	
	Thread.sleep(2000);
	WebElement report = driver.findElement(By.xpath("//a[@title='Reports']"));
	Actions actions = new Actions(driver);
	actions.moveToElement(report).perform();
	
// Open Report menu
	Thread.sleep(2000);
	reports.click();
	
// Open Accounting Report Tab
	Thread.sleep(2000);
	Accounting.click();
	
// Sales Report by Channel Manager
    String Report1 = Keys.chord(Keys.CONTROL,Keys.ENTER);
    // open the link in new tab, Keys.Chord string passed to sendKeys
    driver.findElement(By.xpath("//a[normalize-space()='Sales Report by Channel Manager']")).sendKeys(Report1);
    
//switch to open tab
    ArrayList<String> w = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(w.get(1));	
	Thread.sleep(1000);
	Run_Report.click();
	Thread.sleep(3000);
	export.click();
	Thread.sleep(2000);
	driver.close();
	driver.switchTo().window(w.get(0));	
	
// Funding Report
	String Report2 = Keys.chord(Keys.CONTROL,Keys.ENTER);
	// open the link in new tab, Keys.Chord string passed to sendKeys
	driver.findElement(By.xpath("//a[normalize-space()='Funding Report']")).sendKeys(Report2);
	ArrayList<String> rp2 = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(rp2.get(1));
	Thread.sleep(1000);
	Run_Report.click();
	Thread.sleep(2000);
	export.click();
	Thread.sleep(2000);
	driver.close();
	driver.switchTo().window(w.get(0));	
	
// 	Invoice Report
	String Report3 = Keys.chord(Keys.CONTROL,Keys.ENTER);
	// open the link in new tab, Keys.Chord string passed to sendKeys
	driver.findElement(By.xpath("//a[normalize-space()='Invoice Report']")).sendKeys(Report3);
	ArrayList<String> rp3 = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(rp3.get(1));
	Thread.sleep(1000);
	Run_Report.click();
	Thread.sleep(2000);
	export.click();
	Thread.sleep(2000);
	driver.close();	
	driver.switchTo().window(w.get(0));
	
 // NOA Report Data	
	String Report4 = Keys.chord(Keys.CONTROL,Keys.ENTER);
	// open the link in new tab, Keys.Chord string passed to sendKeys
	driver.findElement(By.xpath("//a[normalize-space()='NOA Report Data']")).sendKeys(Report4);
	ArrayList<String> rp4 = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(rp4.get(1));
	Thread.sleep(1000);
	Run_Report.click();
	Thread.sleep(2000);
	driver.close();	
	driver.switchTo().window(w.get(0));
	
	
	String Report5 = Keys.chord(Keys.CONTROL,Keys.ENTER);
	// open the link in new tab, Keys.Chord string passed to sendKeys
	driver.findElement(By.xpath("//a[normalize-space()='Credit Portal Detail Report Data']")).sendKeys(Report5);
	ArrayList<String> rp5 = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(rp5.get(1));
	Thread.sleep(1000);
	Run_Report.click();
	Thread.sleep(2000);
	driver.close();	
	driver.switchTo().window(w.get(0));
	
	}	
	public void Funding_Report() throws InterruptedException
	{
	
//  Open Funding Tab		
	Thread.sleep(2000);
	Funded.click();
	
	String Report1 = Keys.chord(Keys.CONTROL,Keys.ENTER);
	// open the link in new tab, Keys.Chord string passed to sendKeys
	driver.findElement(By.xpath("//a[normalize-space()='Daily Payment Report - Pace']")).sendKeys(Report1);
	ArrayList<String> rp1 = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(rp1.get(1));
	Thread.sleep(1000);
	Run_Report.click();
	Thread.sleep(4000);
	driver.close();	
	driver.switchTo().window(rp1.get(0));
	
	
	String Report2 = Keys.chord(Keys.CONTROL,Keys.ENTER);
	// open the link in new tab, Keys.Chord string passed to sendKeys
	driver.findElement(By.xpath("//a[normalize-space()='Daily Payment Report - Unsecured']")).sendKeys(Report2);
	ArrayList<String> rp2 = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(rp2.get(1));
	Thread.sleep(1000);
	Run_Report.click();
	Thread.sleep(4000);
	driver.close();	
	driver.switchTo().window(rp1.get(0));
	
	String Report3 = Keys.chord(Keys.CONTROL,Keys.ENTER);
	// open the link in new tab, Keys.Chord string passed to sendKeys
	driver.findElement(By.xpath("//a[normalize-space()='Auto Decision Report']")).sendKeys(Report3);
	ArrayList<String> rp3 = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(rp3.get(1));
	Thread.sleep(1000);
	Run_Report.click();
	Thread.sleep(2000);
	driver.close();	
	driver.switchTo().window(rp1.get(0));
	
	String Report4 = Keys.chord(Keys.CONTROL,Keys.ENTER);
	// open the link in new tab, Keys.Chord string passed to sendKeys
	driver.findElement(By.xpath("//a[normalize-space()='Outstanding Milestones Report']")).sendKeys(Report4);
	ArrayList<String> rp4 = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(rp4.get(1));
	Thread.sleep(1000);
	Run_Report.click();
	Thread.sleep(2000);
	driver.close();	
	driver.switchTo().window(rp1.get(0));
	
	}
	
	public void Sales_Report() throws InterruptedException
	{
	
//  Open Sales Tab		
	Thread.sleep(2000);
	Sales.click();
	
	String Report1 = Keys.chord(Keys.CONTROL,Keys.ENTER);
	// open the link in new tab, Keys.Chord string passed to sendKeys
	driver.findElement(By.xpath("//a[normalize-space()='Sales Leader Report']")).sendKeys(Report1);
	ArrayList<String> rp1 = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(rp1.get(1));
	Thread.sleep(1000);
	Run_Report.click();
	Thread.sleep(2000);
	export.click();
	Thread.sleep(2000);
	driver.close();	
	driver.switchTo().window(rp1.get(0));
	
	
	String Report2 = Keys.chord(Keys.CONTROL,Keys.ENTER);
	// open the link in new tab, Keys.Chord string passed to sendKeys
	driver.findElement(By.xpath("//a[normalize-space()='Sales Summary Report']")).sendKeys(Report2);
	ArrayList<String> rp2 = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(rp2.get(1));
	Thread.sleep(1000);
	Run_Report.click();
	Thread.sleep(2000);
	export.click();
	Thread.sleep(2000);
	driver.close();	
	driver.switchTo().window(rp1.get(0));
	
	String Report3 = Keys.chord(Keys.CONTROL,Keys.ENTER);
	// open the link in new tab, Keys.Chord string passed to sendKeys
	driver.findElement(By.xpath("//a[normalize-space()='ABAG Contractor Address Report']")).sendKeys(Report3);
	ArrayList<String> rp3 = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(rp3.get(1));
	Thread.sleep(1000);
	Run_Report.click();
	Thread.sleep(2000);
	driver.close();	
	driver.switchTo().window(rp1.get(0));
	
	String Report4 = Keys.chord(Keys.CONTROL,Keys.ENTER);
	// open the link in new tab, Keys.Chord string passed to sendKeys
	driver.findElement(By.xpath("//a[normalize-space()='Sent Contract Details Report']")).sendKeys(Report4);
	ArrayList<String> rp4 = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(rp4.get(1));
	Thread.sleep(1000);
	Run_Report.click();
	Thread.sleep(2000);
	driver.close();	
	driver.switchTo().window(rp1.get(0));
	
	}
	
	public void Compliance_Report() throws InterruptedException
	{
	
//  Open Sales Tab		
	Thread.sleep(2000);
	Compliance.click();
	
	String Report1 = Keys.chord(Keys.CONTROL,Keys.ENTER);
	// open the link in new tab, Keys.Chord string passed to sendKeys
	driver.findElement(By.xpath("//a[normalize-space()='Fraud Concern Report']")).sendKeys(Report1);
	ArrayList<String> rp1 = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(rp1.get(1));
	Thread.sleep(1000);
	Run_Report.click();
	Thread.sleep(2000);
	driver.close();	
	driver.switchTo().window(rp1.get(0));
	
	
	String Report2 = Keys.chord(Keys.CONTROL,Keys.ENTER);
	// open the link in new tab, Keys.Chord string passed to sendKeys
	driver.findElement(By.xpath("//a[normalize-space()='Unsecured Detail Report']")).sendKeys(Report2);
	ArrayList<String> rp2 = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(rp2.get(1));
	Thread.sleep(1000);
	Run_Report.click();
	Thread.sleep(2000);
	driver.close();	
	driver.switchTo().window(rp1.get(0));
	
	String Report3 = Keys.chord(Keys.CONTROL,Keys.ENTER);
	// open the link in new tab, Keys.Chord string passed to sendKeys
	driver.findElement(By.xpath("//a[normalize-space()='Compliance Analysis Report']")).sendKeys(Report3);
	ArrayList<String> rp3 = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(rp3.get(1));
	Thread.sleep(1000);
	Run_Report.click();
	Thread.sleep(2000);
	driver.close();	
	driver.switchTo().window(rp1.get(0));
	
	String Report4 = Keys.chord(Keys.CONTROL,Keys.ENTER);
	// open the link in new tab, Keys.Chord string passed to sendKeys
	driver.findElement(By.xpath("//a[normalize-space()='Customer Rating Report']")).sendKeys(Report4);
	ArrayList<String> rp4 = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(rp4.get(1));
	Thread.sleep(1000);
	Run_Report.click();
	Thread.sleep(2000);
	driver.close();	
	driver.switchTo().window(rp1.get(0));
	
	}
	
	
	
	
	
	
}