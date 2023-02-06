package com.asian.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchObjects {
	//Declaring variables globally
	public static WebDriver driver;
	//Locators for search box, search icon, Colour selection tool, Wood tech product.	
	static By textbox_Search = By.xpath("//*[@id=\"headerSearch\"]/div[1]/form/div/input");
	static By button_SearchIcon = By.xpath("//*[@id=\"headerSearch\"]/div[1]/form/div/button/span");
	static By button_ColourSelectionTool = By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/section/div/div/div[2]/div/div/div[2]/div/div/a/div/h4");
	static By button_Woodtech = By.xpath("//*[@id=\"thin-banner-info\"]/ul/li[2]/a/img");
	//Applying Constructor
	public SearchObjects(WebDriver driver) {
		this.driver = driver;
	}
	//Method to find Search icon
	public static void clickSearchIconButton() {
		driver.findElement(button_SearchIcon).click();
	}
	//Method to find Search box
	public static void setTextInSearchBox(String string) {
		driver.findElement(textbox_Search).sendKeys("Colour selection tool");
	}
	//Method to find Colour selection tool
	public static void clickColourSelectionToolsButton() {
		driver.findElement(button_ColourSelectionTool).click();
	}
	//Method to find Wood tech product
	public static void clickWoodtechButton() {
		driver.findElement(button_Woodtech).click();
	}
}
