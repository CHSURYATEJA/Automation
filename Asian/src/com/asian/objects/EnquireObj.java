package com.asian.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class EnquireObj {
	//Declaring variables globally
	public static WebDriver driver;
	//Locators for Name, GmailId, Mobile Number, Pin code and Enquire now button
	static By textbox_Name = By.id("enquire-name");
	static By textbox_GmailID = By.id("enquire-email");
	static By textbox_MobileNumber = By.id("enquire-mobile");
	static By textbox_PinCode = By.id("enquire-pincode");
	static By button_EnquireNow = By.xpath("//*[@id=\"pdp-request-call-back-form\"]/div[2]/div[2]/button");
	//Applying constructor
	public EnquireObj(WebDriver driver) {
		this.driver = driver;
	}
	//Method to find Name and Entering Name 
	public static void setTextInNameBox(String string) {
		driver.findElement (textbox_Name).sendKeys("Surya");
	}
	//Method to find GmailId and Entering mailId
	public static void setTextInGmailIDBox(String string) {
		driver.findElement (textbox_GmailID).sendKeys("teja@gmail.com");	
	}
	//Method to find Mobile Number and Entering Mobile Number
	public static void setTextInMobileNumberBox(String string) {
		driver.findElement (textbox_MobileNumber).sendKeys("987653210");	
	}
	//method to find PinCode and Entering Pin Code
	public static void setTextInPinCodeBox(String string) {
		driver.findElement (textbox_PinCode).sendKeys("110001");	
	}
	//Method to find Enquire Now button.
	public static void clickEnquireNowButton() {
		driver.findElement (button_EnquireNow).click();
	}
}
