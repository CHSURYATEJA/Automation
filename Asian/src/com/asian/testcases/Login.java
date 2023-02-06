package com.asian.testcases;
//Importing required libraries for Selenium and TestNG
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//Importing required library for Extent Reports
import com.asian.objects.LoginObjects;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//Declaring the class login
public class Login {
	// Declaring the WebDriver instance
	private static WebDriver driver;
	// Test case annotated with @Test
	@Test
	public static void LoginTest() throws InterruptedException {
		// Setting the path for the Chrome Driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\chinthala.teja\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// Initializing the Chrome Driver
		WebDriver driver = new ChromeDriver();
		// Navigating to the URL		
        driver.get("https://www.asianpaints.com/");
        // Printing the title of the page
        System.out.println("Title is:"+driver.getTitle());
        // Storing the title of the page in a variable
        String title = driver.getTitle();
        // Initializing the ExtentReports instance
        ExtentReports extent=new ExtentReports();
        // Creating an instance of ExtentHtmlReporter to specify the location and name of the HTML report
        ExtentHtmlReporter spark=new ExtentHtmlReporter("C:\\Users\\chinthala.teja\\Downloads\\ExtentReports\\Login.html");
     // Attaching the HTML report to the ExtentReports instance
        extent.attachReporter(spark);
     // Creating an instance of ExtentTest to specify the test  
        ExtentTest test=extent.createTest("Verify Daily Deals fields are displayed.");
     // Initializing the LoginObjects class
		LoginObjects lgninObj = new LoginObjects(driver);
		//driver.get("https://www.asianpaints.com/");
		driver.manage().window().maximize();
		// Adding a wait of 3 seconds
		Thread.sleep(3000);
		// Calling the method clickprofileIconButton from the LoginObjects class
		LoginObjects.clickprofileIconButton();
		// Adding a wait of 3 seconds
		Thread.sleep(3000);
		// Calling the method setTextInMobileBox from the LoginObjects class and passing the mobile number
		LoginObjects.setTextInMobileNumberBox("9391972463");
		// Adding a wait of 3 seconds
		Thread.sleep(3000);
		// Calling the method clickSubmitButton from the LoginObjects class
		LoginObjects.clickSubmitButton();
		// Adding a wait of 3 seconds
		Thread.sleep(3000);
		// Closing the browser window
		driver.close();
		// Flushing the ExtentReports instance
		extent.flush();
	}
	/*
	This method returns the current WebDriver instance
	@return the current WebDriver instance
	*/
	public static WebDriver getDriver() {
		return driver;
	}
	//This method sets the WebDriver instance
	public static void setDriver(WebDriver driver) {
		LoginObjects.driver = driver;
	}
}
