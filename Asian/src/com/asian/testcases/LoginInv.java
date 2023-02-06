package com.asian.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.asian.objects.LoginObjects;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LoginInv {

	private static WebDriver driver;

	@Test
	public static void signInTest() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\chinthala.teja\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.asianpaints.com/");
        System.out.println("Title is:"+driver.getTitle());
        String title = driver.getTitle();
        ExtentReports extent=new ExtentReports();
        ExtentHtmlReporter spark=new ExtentHtmlReporter("C:\\Users\\chinthala.teja\\Downloads\\ExtentReports\\Logininv.html");
        extent.attachReporter(spark);
         
  
        ExtentTest test=extent.createTest("Verify Daily Deals fields are displayed.");
      
		
		LoginObjects lgninObj = new LoginObjects(driver);

		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		LoginObjects.clickprofileIconButton();
		
		Thread.sleep(3000);
		
		LoginObjects.setTextInMobileNumberBox("939197246323");
		
		Thread.sleep(3000);
		
		LoginObjects.clickSubmitButton();
		
		Thread.sleep(3000);

		driver.close();
		
		extent.flush();
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		LoginObjects.driver = driver;
	}
}
