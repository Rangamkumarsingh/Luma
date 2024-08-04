package org.Luma.Freamwork.Pages;

import java.io.IOException;

import org.Luma.Framework.Utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver =driver;
	}
	public void clickOnSignIn () throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("clickOnSignIn_Xpath")))
		.click();
	}
	 
	public void enterEmail( String uname) throws IOException {
		driver.findElement(By.id(Utility.fetchLocatorValue("Login_Email_id")))
		.sendKeys(uname);
	}
	
   public void enterPassword(String pass) throws IOException {
	   driver.findElement(By.id(Utility.fetchLocatorValue("Login_password_id")))
	   .sendKeys(pass);
	}
   
   public void clickSignin() throws IOException {
	   driver.findElement(By.xpath(Utility.fetchLocatorValue("Login_singin_xpath"))).click();
	}
}
