package com.asian.testcases;
//Importing necessary libraries for Selenium WebDriver and TestNG
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
//Importing the SearchObjects class from the objects package

import com.asian.objects.SearchObjects;
//Importing necessary libraries for extent reports
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//Class for paint colour selector  functionality
public class ColSel {
	//Declaring the WebDriver instance globally
	private static WebDriver driver;
	// Test case annotated with @Test
	@Test
	public static void SearchTest() throws InterruptedException {
		// Setting the path for the Chrome Driver
		System.setProperty("webdriver.chrome.driver", 
        		"C:\\Users\\chinthala.teja\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// Initializing the Chrome Driver
		driver = new ChromeDriver();
		// Navigating to the URL
		driver.get("https://www.asianpaints.com/");
		// Printing the title of the page
        System.out.println("Title is:"+driver.getTitle());
        // Storing the title of the page in a variable
        String title = driver.getTitle();
     // Initializing the ExtentReports instance
        ExtentReports extent=new ExtentReports();
     // Creating an instance of ExtentHtmlReporter to specify the location and name of the HTML report
        ExtentHtmlReporter spark=new ExtentHtmlReporter("C:\\Users\\chinthala.teja\\Downloads\\ExtentReports\\ColourSelector.html");
        extent.attachReporter(spark);
     // Creating an instance of ExtentTest to specify the test
        ExtentTest test=extent.createTest("Verify Daily Deals fields are displayed.");
     // Initializing the SearchObjects class
		SearchObjects SrcObj = new SearchObjects(driver);
		// Maximizing the browser window
		driver.manage().window().maximize();
		// Adding a wait of 3 seconds
		Thread.sleep(3000);
		// Calling the method setTextinSearchBox from the SearchObjects class
		SearchObjects.setTextInSearchBox("colour selection tools");
		// Adding a wait of 3 seconds
		Thread.sleep(3000);
		// Calling the method clickSearchIconBox from the SearchObjects class
		SearchObjects.clickSearchIconButton();
		// Adding a wait of 3 seconds
		Thread.sleep(3000);
		// Calling the method clickColourSelectionToolsButton from the SearchObjects class
		SearchObjects.clickColourSelectionToolsButton();
		// Adding a wait of 3 seconds
		Thread.sleep(3000);
		// Calling the method clickWoodtechButton from the SearchObjects class
		SearchObjects.clickWoodtechButton();
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
		SearchObjects.driver = driver;
	}
}
