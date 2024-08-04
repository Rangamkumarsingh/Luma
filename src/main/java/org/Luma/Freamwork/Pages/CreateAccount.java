package org.Luma.Freamwork.Pages;

import java.io.IOException;

import org.Luma.Framework.Utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	WebDriver driver;
	public CreateAccount(WebDriver driver) {
		this.driver =driver;
	}
 
	public void clickCreateAccount() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("Create_Account_Xpath")))
		.click();;
	}
	
	public void firstName( String fname) throws IOException {
		driver.findElement(By.id(Utility.fetchLocatorValue("firstName_id")))
		.sendKeys(fname);
	}
	
	public void lastName( String lname) throws IOException {
		driver.findElement(By.id(Utility.fetchLocatorValue("lastName_id")))
		.sendKeys(lname);
	}
	 
	public void emailId( String email) throws IOException {
		driver.findElement(By.id(Utility.fetchLocatorValue("emailId_id")))
		.sendKeys(email);
	}
	
	public void password( String createpass) throws IOException {
		driver.findElement(By.id(Utility.fetchLocatorValue("password_id")))
		.sendKeys(createpass);
	}
	
	public void confirmPassword( String createconfirmpass) throws IOException {
		driver.findElement(By.id(Utility.fetchLocatorValue("confirmPassword_id")))
		.sendKeys(createconfirmpass);
	}
	
	public void buttonCreateAccount() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("buttonCreateAccount_Xpath")))
		.click();
	}

	public void singOutArrow() throws IOException {
		 driver.findElement(By.xpath(Utility.fetchLocatorValue("singout_Arrow_xpath")))
		 .click();	
	}
	
	public void logOut() throws IOException {
		 driver.findElement(By.xpath(Utility.fetchLocatorValue("logout_xpath")))
		 .click();	
	}
}
