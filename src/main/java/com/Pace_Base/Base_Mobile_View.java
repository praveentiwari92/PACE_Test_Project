package com.Pace_Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v102.emulation.Emulation;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.qa.Util.TC_TestUtil;

public class Base_Mobile_View {
	private static final ChromeDriverService Capabilities = null;
	public static WebDriver driver;
	public static Properties prop;
	public static Logger logger;

	public Base_Mobile_View()  {

		try {

//			Properties prop=new Properties();
//			FileInputStream ip = new FileInputStream(System.getProperty("C:\\Users\\Praveen\\eclipse-workspace\\POM\\config.properties"));
//			prop.load(ip);

			prop = new Properties();
			String projectRootPath = TC_TestUtil.getProjectDirectory();
			FileInputStream ip = null;
			 if(TC_TestUtil.isWindows()) {
				 ip = new FileInputStream(projectRootPath + "\\" + "Pace.properties");
	    	  }else {
	    		 ip = new FileInputStream(projectRootPath + "/" + "Pace.properties");
	    	  }
			prop.load(ip);

			}
		catch (FileNotFoundException e) {
		e.printStackTrace();
		}

		catch (IOException e) {
			e.printStackTrace();
		}
}

	public static void Initialization() {

		String browsername = prop.getProperty("browser");
		logger= Logger.getLogger(Base_Mobile_View.class);
		
	//	PropertyConfigurator.configure("Log4j.properties");

		if(browsername.equals("chrome"))
		{
			if (TC_TestUtil.isWindows()) {
				System.out.println("This is Windows");
				System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
			} else if (TC_TestUtil.isMac()) {
				System.out.println("This is Mac");
				System.setProperty("webdriver.chrome.driver", "chromedriver");
			} else if (TC_TestUtil.isUnix()) {
				System.out.println("This is Unix or Linux");
				System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
				System.setProperty("webdriver.chrome.whitelistedIps", "127.0.0.1");
				System.out.println("This is Unix or pass Linux");

			} else if (TC_TestUtil.isSolaris()) {
				System.out.println("This is Solaris");
				System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver");
			} else {
				System.out.println("Your OS is not support!!");
			}
		
			ChromeOptions options =new ChromeOptions();		
			options.addArguments("window-size=360,800");
		
		//	options.addArguments("headless", "no-sandbox");
//			options.addArguments("enable-automation");
//			options.addArguments("--disable-dev-shm-usage");
//			options.addArguments("--disable-infobars");
			driver = new ChromeDriver(options);
//			driver.manage().window().maximize();
			


			
		

		}
		else if (browsername.equals("firefox"))
		{
			if (TC_TestUtil.isWindows()) {
				System.out.println("This is Windows");
				System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
			} else if (TC_TestUtil.isMac()) {
				System.out.println("This is Mac");
				System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver");
			} else if (TC_TestUtil.isUnix()) {
				System.out.println("This is Unix or Linux");
				System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver");
			} else if (TC_TestUtil.isSolaris()) {
				System.out.println("This is Solaris");
				System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver");
			} else {
				System.out.println("Your OS is not support!!");
			}
			
		}

	//	driver = new FirefoxDriver();
	//	driver.manage().window().maximize();
	//	driver.manage().deleteAllCookies();
//		FirefoxBinary firefoxbinary = new FirefoxBinary();
//		firefoxbinary.addCommandLineOptions("window-size=1820,1080");
//		firefoxbinary.addCommandLineOptions("headless", "no-sandbox");
//		firefoxbinary.addCommandLineOptions("--disable-dev-shm-usage");
//		FirefoxOptions fox = new FirefoxOptions();
//		fox.setBinary(firefoxbinary);
//		driver = new FirefoxDriver(fox);
		
		
		//FireFox
//		FirefoxBinary firefoxbinary = new FirefoxBinary();
//		firefoxbinary.addCommandLineOptions("--headless","no-sandbox");
//		firefoxbinary.addCommandLineOptions("--disable-dev-shm-usage");
	//	FirefoxOptions fox = new FirefoxOptions();
	//	fox.setBinary(firefoxbinary);
	//	driver = new FirefoxDriver(fox);  // remove fox from arguments to run without headless mode
		
		driver.manage().timeouts().pageLoadTimeout(TC_TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TC_TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
			

	}

}
