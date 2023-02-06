package com.asian.testcases;
//Importing necessary libraries for Selenium WebDriver and TestNG
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//Importing the EnquireObjects class from the objects packa
import com.asian.objects.EnquireObj;
//Importing necessary libraries for extent reports
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//Class for Enquire functionality
public class Enquire {
	//Declaring the WebDriver instance globally
	private static WebDriver driver;
	// Test case annotated with @Test
	@Test
	public static void EnqTest() throws InterruptedException {
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
        ExtentHtmlReporter spark=new ExtentHtmlReporter("C:\\Users\\chinthala.teja\\Downloads\\ExtentReports\\Enquire.html");
     // Creating an instance of ExtentTest to specify the test
        extent.attachReporter(spark);
        ExtentTest test=extent.createTest("Verify Daily Deals fields are displayed.");
     // Initializing the EnquireObjects class
		EnquireObj EnqObj = new EnquireObj(driver);
		// Maximizing the browser window
		driver.manage().window().maximize();
		// Adding a wait of 3 seconds
		Thread.sleep(3000);
		// Calling the method setTextInNameBox from the EnquiryObjects class
		EnquireObj.setTextInNameBox("Surya");
		// Adding a wait of 3 seconds
		Thread.sleep(3000);
		// Calling the method setTextInGmailIDBox from the EnquiryObjects class
		EnquireObj.setTextInGmailIDBox("teja@gmail.com");
		// Adding a wait of 3 seconds
		Thread.sleep(2000);
		// Calling the method setTextInMobileNumberBox from the EnquiryObjects class
		EnquireObj.setTextInMobileNumberBox("9876543210");
		// Adding a wait of 3 seconds
		Thread.sleep(3000);
		// Calling the method setTextInNameBox from the EnquiryObjects class
		EnquireObj.setTextInPinCodeBox("110001");
		// Adding a wait of 3 seconds
		Thread.sleep(3000);
		// Calling the method clickEnquireNowButton from the EnquiryObjects class
		EnquireObj.clickEnquireNowButton();
		// Adding a wait of 3 seconds
		Thread.sleep(3000);
		// Closing the browser window
		driver.close();
		// Flushing the ExtentReports instance
		extent.flush();
	}
	//This method returns the current WebDriver instance @return the current WebDriver instance
	public static WebDriver getDriver() {
		return driver;
	}
	//This method sets the WebDriver instance
	public static void setDriver(WebDriver driver) {
		EnquireObj.driver = driver;
	}
}
