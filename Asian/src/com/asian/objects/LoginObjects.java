package com.asian.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginObjects {
	//Declaring variable globally
	public static WebDriver driver ;
	//Locators for Profile icon, Mobile number, Submit button, Application link button, Mobile , Send SMS, Find contractor, Pincode and Search.
	static By button_profileIcon = By.xpath("/html/body/div[1]/div/div[1]/div/div/header/div[2]/div[2]/div[1]/a[1]/span");
	static By textbox_MobileNumber = By.id("loginMobile");
	static By button_Submit = By.cssSelector(".ctaComp:nth-child(3) > .modal__variant-login--submit");
	static By button_App = By.xpath("/html/body/div[1]/div/div[1]/div/div/header/div[1]/div/div[1]/a[1]/span[2]");
	static By textbox_Mobile = By.xpath("//*[@id=\"paintingAppMobile\"]");
	static By button_SendSMS = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[3]/div/form/div/div[1]/button");
	static By button_findcontractor = By.xpath("/html/body/div[1]/div/div[1]/div/div/header/div[1]/div/div[1]/a[2]/span[2]");
	static By textbox_PinCode = By.xpath("//*[@id=\"ctaPincode\"]");
	static By button_Search = By.xpath("//*[@id=\"js-autoCompleteListArea\"]/div[2]/button");
	//Applying constructor
	public LoginObjects(WebDriver driver) {
		this.driver = driver;
	}
	//Method to find Profile Icon
	public static void clickprofileIconButton() {
		driver.findElement (button_profileIcon).click();
	}
	//Method to find MobileNumber
	public static void setTextInMobileNumberBox(String string) {
		driver.findElement (textbox_MobileNumber).sendKeys("9391972463");
	}
	//Method to find Submit
	public static void clickSubmitButton() {
		driver.findElement (button_Submit).click();
	}
	//Method to find Application link
	public static void clickAppButton() {
		driver.findElement (button_App).click();
	}
	//Method to find Mobile 
	public static void setTextInMobileBox(String string) {
		driver.findElement (textbox_Mobile).sendKeys("9391972463");	
	}
	//Method to find SendSMS
	public static void clickSendSMSBox() {
		driver.findElement (button_SendSMS).click();	
	}
	//Method to find Contractor
	public static void clickfindcontracorButton() {
		driver.findElement (button_findcontractor).click();
	}
	//Method to find PinCode
	public static void setTextInPinCodeBox(String string) {
		driver.findElement (textbox_PinCode).sendKeys("110001");
	}
	//Method to find Search
	public static void clickSearchButton() {
		driver.findElement(button_Search).click();
	}
}
