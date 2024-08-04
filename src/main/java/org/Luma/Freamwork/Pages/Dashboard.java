package org.Luma.Freamwork.Pages;

import java.io.IOException;

import org.Luma.Framework.Utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Dashboard {

	WebDriver driver;
	public Dashboard(WebDriver driver) {
		this.driver =driver;
	}
	
	public void gear()throws IOException {
		WebElement gearElement = driver.findElement(By.xpath("//span[contains(text(),'Gear')]"));
        Actions actions = new Actions(driver);
		actions.moveToElement(gearElement).perform();
	}
	public void clickBags() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("Bags_Xpath")))
		.click();
	}
	  
	public void selectBag() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("Select_Bag_Xpath")))
		.click();
	}
	
	public void addToCart() throws IOException {
		driver.findElement(By.id(Utility.fetchLocatorValue("addToCart_id")))
		.click();
	}
	public void clickIconAddToCart() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("click_icon_AddToCart_Xpath")))
		.click();
	}
	
	public void checkoutButton() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("click_Button_Checkout_Xpath")))
		.click();
	}
	
}
