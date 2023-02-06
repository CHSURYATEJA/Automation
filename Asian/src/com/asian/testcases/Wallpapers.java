package com.asian.testcases;
//Importing required libraries for Selenium and TestNG
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//Importing required library for Extent Reports
import com.asian.objects.PaintObjects;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//Class to test the functionality of buying a wallpapers from Asian Paints website
public class Wallpapers {
	// Declaring the WebDriver instance
    private WebDriver driver;
 // Method to set up the ChromeDriver and navigate to the Asian Paints website
    @BeforeMethod
    public void setUp() {
    	// Set up the ChromeDriver
        System.setProperty("webdriver.chrome.driver", 
        		"C:\\Users\\chinthala.teja\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        
        driver.manage().window().maximize();
    }
 // Test method to add a product to the cart
    @Test
    public void testHoverOver() throws InterruptedException {
    	// Navigate to the Asian Paints website
    	driver.get("https://www.asianpaints.com/");
        System.out.println("Title is:"+driver.getTitle());
        String title = driver.getTitle();
        ExtentReports extent=new ExtentReports();
     // Creating a test for the Extent report
        ExtentHtmlReporter spark=new ExtentHtmlReporter("C:\\Users\\chinthala.teja\\Downloads\\ExtentReports\\WallPapers.html");
        extent.attachReporter(spark);
     // Creating a test for the Extent report
        ExtentTest test=extent.createTest("Verify Daily Deals fields are displayed.");
        // Create an instance of the page object
        PaintObjects page = new PaintObjects(driver);
        // Perform the mouse hover action
        page.hoverOverElement(By.xpath("//*[@id=\"headerNav\"]/div[1]/ul/li[1]/a[2]/span[1]"));
     // Adding wait time of 3 seconds 
        Thread.sleep(3000);
     // Calling the clickWallpapersButton method from the PaintObjects class
        PaintObjects.clickWallpapersButton();
     // Adding wait time of 3 seconds 
        Thread.sleep(3000);
     // Flushing the ExtentReports instance
        extent.flush();
    }
 // This method is used to close the webdriver instance after the execution of each test method
    @AfterMethod
    public void tearDown() {
        // Close the driver
        driver.quit();
    }
}
