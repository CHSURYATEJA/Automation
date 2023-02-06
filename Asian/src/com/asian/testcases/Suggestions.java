package com.asian.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.asian.objects.PaintObjects;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Suggestions {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Set up the driver
        System.setProperty("webdriver.chrome.driver", 
        		"C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chinthala.teja\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testHoverOver() throws InterruptedException {
        // Navigate to the test page
    	   driver.get("https://www.asianpaints.com/");
           System.out.println("Title is:"+driver.getTitle());
           String title = driver.getTitle();
           ExtentReports extent=new ExtentReports();
           ExtentHtmlReporter spark=new ExtentHtmlReporter("C:\\Users\\chinthala.teja\\Downloads\\ExtentReports\\Suggestions.html");
           extent.attachReporter(spark);
            
     
           ExtentTest test=extent.createTest("Verify Daily Deals fields are displayed.");
         

        // Create an instance of the page object
        PaintObjects page = new PaintObjects(driver);

        // Perform the mouse hover action
        page.hoverOverElement(By.xpath("//*[@id=\"headerNav\"]/div[1]/ul/li[1]/a[2]/span[1]"));
         
        Thread.sleep(3000);
        
        PaintObjects.clickIdeasGalleryButton();
        
        Thread.sleep(3000);
        
        PaintObjects.clickLivingroomButton();
        
        Thread.sleep(3000);
        
        PaintObjects.clickWhiteroomButton();
        
        Thread.sleep(3000);
        
        extent.flush();
        
    }

    @AfterMethod
    public void tearDown() {
        // Close the driver
        driver.quit();
    }
}
