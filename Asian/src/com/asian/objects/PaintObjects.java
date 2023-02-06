package com.asian.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PaintObjects {
	//Declaring variables globally
    private static WebDriver driver;  
    /*Locators for Interior paints, Exterior paints, waterproofing, wood, metal , Paint Budget Calculator 
    Area, Enquire now , Indeas gallery, living room, White room, Wallpapers, Interior textures, Palmwave, Pincode, Check, Add to cart, Buynow*/
    static By button_InteriorPaints = By.xpath("//*[@id=\"PAINTPRODUCTS\"]/li[1]/a");
    static By button_ExteriorPaints = By.xpath("//*[@id=\"PAINTPRODUCTS\"]/li[2]/a");
    static By button_WaterProofing = By.xpath("//*[@id=\"PAINTPRODUCTS\"]/li[3]/a");
    static By button_Wood = By.xpath("//*[@id=\"PAINTPRODUCTS\"]/li[4]/a");
    static By button_Metal = By.xpath("//*[@id=\"PAINTPRODUCTS\"]/li[5]/a");
    static By button_PaintBudgetCalculator = By.xpath("//*[@id=\"TOOLS\"]/li[1]/a");
    static By textbox_Area = By.xpath("//*[@id=\"budget-calculator-comp\"]/div/div[2]/div[1]/div/div/div[1]/div[1]/form/div/div[1]/input");
    static By button_EnquireNow = By.xpath("//*[@id=\"budget-calculator-comp\"]/div/div[2]/div[1]/div/div/div[1]/div[1]/form/div/div[2]/a");
    static By button_IdeasGallery = By.xpath("/html/body/div[1]/div/div[1]/div/div/header/div[2]/div[3]/nav/div[3]/div[1]/div[2]/div/div/div[3]/ul/li[2]/a");
    static By button_Livingroom = By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div/div/div/div[2]/div[1]/a/div[1]/img");
    static By button_Whiteroom = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[1]/div/div[2]/div[3]/div[1]/a/div/img");
    static By button_Wallpapers = By.xpath("//*[@id=\"EXPLORECOLOURS\"]/li[4]/a");
    static By button_InteriorTexture = By.xpath("//*[@id=\"EXPLORECOLOURS\"]/li[2]/a");
    static By button_PalmWeave = By.xpath("//*[@id=\"plpListing\"]/section[2]/div[2]/ul/li[1]/a/span");
    static By textbox_Pin = By.xpath("//*[@id=\"checkPincode\"]");
    static By button_Check = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[8]/div/form/div[1]/div[1]/button");
    static By button_Addtocart = By.xpath("//*[@id=\"add-to-cart-click\"]");
    static By button_BuyNow = By.xpath("//*[@id=\"buy-now-click\"]");
    //Applying constructor
    public PaintObjects(WebDriver driver) {
        this.driver = driver;
    }
    //Method to Hover over on Paints and textures
    public void hoverOverElement(By by) {
        WebElement element = driver.findElement(by);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }
    //Method to find Interior Button
	public static void clickInteriorPaintsButton() {
		driver.findElement (button_InteriorPaints).click();
	}
	//Method to find Exterior button
	public static void clickExteriorPaintsButton() {
		driver.findElement (button_ExteriorPaints).click();
	}
	//Method to find Water proofing Button
	public static void clickWaterProofingButton() {
		driver.findElement (button_WaterProofing).click();	
	}
	//Method to find Wood button
	public static void clickWoodButton() {
		driver.findElement (button_Wood).click();
	}
	//Method to find Metal button
	public static void clickMetalButton() {
		driver.findElement (button_Metal).click();
	}
	//Method to find Paint budget calculator
	public static void clickPaintBudgetCalculatorButton() {
		driver.findElement (button_PaintBudgetCalculator).click();
	}
	//Method to find Area box
	public static void setTextInAreaBox(String string) {
		driver.findElement (textbox_Area).sendKeys("1200");
	}
	//Method to find Enquirenow Button
	public static void clickEnquireNowButton() {
		driver.findElement (button_EnquireNow).click();
	}
	//Method to find Ideas Gallery Button
	public static void clickIdeasGalleryButton() {
		driver.findElement(button_IdeasGallery).click();
	}
	//Method to find Living room button
	public static void clickLivingroomButton() {
		driver.findElement(button_Livingroom).click();				
	}
	//Method to find White room
	public static void clickWhiteroomButton() {
		driver.findElement(button_Whiteroom).click();
	}
	//Method to find Wall papers
	public static void clickWallpapersButton() {
		driver.findElement(button_Wallpapers).click();
	}
	//Method to find Interior Texture button
	public static void clickInteriorTextureButton() {
		driver.findElement(button_InteriorTexture).click();
	}
	//Method to find Palmweave button
	public static void clickPalmWeaveButton() {
		driver.findElement(button_PalmWeave).click();
	}
	//Method to find Pincode bpx
	public static void setTextInPinBox() {
		driver.findElement(textbox_Pin).sendKeys("110001");
	}
	//Method to find Check button
	public static void clickCheckButton() {
		driver.findElement(button_Check).click();
	}
	//Method to find Addto cart button
	public static void clickAddtocartButton() {
		driver.findElement(button_Addtocart).click();
	}
	//Method to find Buynow button
	public static void clickBuyNowButton() {
		driver.findElement(button_BuyNow).click();
	}
}
