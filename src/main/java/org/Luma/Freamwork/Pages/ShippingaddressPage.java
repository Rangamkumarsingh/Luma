package org.Luma.Freamwork.Pages;

import java.io.IOException;

import org.Luma.Framework.Utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ShippingaddressPage {
	
	WebDriver driver;
	public ShippingaddressPage(WebDriver driver) {
		this.driver =driver;
	}
 
	public void companyName(String cname) throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("companyName_Xpath")))
		.sendKeys(cname);
	}
   
	public void streetAddress (String address) throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("streetAddress_Xpath")))
		.sendKeys(address);
	}

	public void streetAddress1(String address1) throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("streetAddress1_Xpath")))
		.sendKeys(address1);
	}
 
	public void streetAddress2(String address2) throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("streetAddress2_Xpath")))
		.sendKeys(address2);
	}
	public void cityName(String cityname) throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("cityName_Xpath")))
		.sendKeys(cityname);
	}
	
	public void countryName() throws IOException {
		 WebElement dropdownCountry=driver.findElement(By.xpath(Utility.fetchLocatorValue("countryName_Xpath")));
		 dropdownCountry.click();
		 Select dropdown = new Select(dropdownCountry);
		 dropdown.selectByVisibleText("India");
	}
	
	public void stateName() throws IOException {
		 WebElement dropdownState=driver.findElement(By.xpath(Utility.fetchLocatorValue("stateName_Xpath")));
		 dropdownState.click();
		 Select dropdown = new Select(dropdownState);
		 dropdown.selectByVisibleText("Bihar");
	}
	
	public void zipCode(String zipcode) throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("zipCode_Xpath")))
		.sendKeys(zipcode);
	}
	
	public void phoneNumber(String phonenumber) throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("phoneNumber_Xpath")))
		.sendKeys(phonenumber);
	}
	
	public void nextButton() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("nextButton_Xpath")))
		.click();
	}
	
}
