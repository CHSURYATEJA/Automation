package com.asian.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class  Tittle{
    private WebDriver driver;
    private final String URL = "https://www.asianpaints.com/";
    private final String EXPECTED_TITLE = "Trusted Wall Painting, Home Painting & Waterproofing in India - Asian Paints";

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chinthala.teja\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testHomepageTitle() {
        driver.get(URL);
        
        driver.get("https://www.asianpaints.com/");
        System.out.println("Title is:"+driver.getTitle());
        String title = driver.getTitle();
        ExtentReports extent=new ExtentReports();
        ExtentHtmlReporter spark=new ExtentHtmlReporter("C:\\Users\\chinthala.teja\\Downloads\\ExtentReports\\Tittle.html");
        extent.attachReporter(spark);
         
  
        ExtentTest test=extent.createTest("Verify Daily Deals fields are displayed.");
        
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, EXPECTED_TITLE);
        
        extent.flush();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
