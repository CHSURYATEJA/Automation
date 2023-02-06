package com.asian.testcases;
//Importing necessary libraries for Selenium WebDriver and TestNG
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//Importing the PaintObjects class from the objects package
import com.asian.objects.PaintObjects;
//Importing necessary libraries for extent reports
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//Class for Add to Cart functionality
public class Addtocart {
	//Declaring the WebDriver instance globally
    private WebDriver driver;
    // Method to set up the Chrome driver and navigate to the test page
    @BeforeMethod
    public void setUp() {
        // Set up the driver
        System.setProperty("webdriver.chrome.driver", 
        		"C:\\Users\\chinthala.teja\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    // Test method for Add to Cart functionality
    @Test
    public void addTocart() throws InterruptedException {
    	// Navigate to the test page
    	driver.get("https://www.asianpaints.com/");
        System.out.println("Title is:"+driver.getTitle());
        String title = driver.getTitle();
        ExtentReports extent=new ExtentReports();
        // Creating a test for the Extent report
        ExtentHtmlReporter spark=new ExtentHtmlReporter("C:\\Users\\chinthala.teja\\Downloads\\ExtentReports\\Addtocart.html");
        extent.attachReporter(spark);
        // Creating a test for the Extent report
        ExtentTest test=extent.createTest("Verify Daily Deals fields are displayed.");
        // Create object of paintobject and driver instance is passed as parameter to construct Paint objects
        PaintObjects page = new PaintObjects(driver);
        // Perform the mouse hover action
        page.hoverOverElement(By.xpath("//*[@id=\"headerNav\"]/div[1]/ul/li[1]/a[2]/span[1]"));
        // Adding wait time of 3 seconds
        Thread.sleep(3000);
        // Calling the clickInteriorTextureButton method from the PaintObjects class
        PaintObjects.clickInteriorTextureButton();
        // Adding wait time of 3 seconds
        Thread.sleep(3000);
        // Calling the clickPalmWeaveButton method from the PaintObjects class
        PaintObjects.clickPalmWeaveButton();
        // Adding wait time of 3 seconds
        Thread.sleep(3000);
        // Calling the setTextInPinBox method from the PaintObjects class
        PaintObjects.setTextInPinBox();
        // Adding wait time of 3 seconds
        Thread.sleep(3000);
        // Calling the Check box method from the PaintObjects class
        PaintObjects.clickCheckButton();
        // Adding wait time of 3 seconds
        Thread.sleep(3000);
        // Calling the Add to cart method from the PaintObjects class
        PaintObjects.clickAddtocartButton();
        // Adding wait time of 3 seconds
        Thread.sleep(3000);
        // Closing the browser window
        driver.close();
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
