package org.Luma.Freamwork.testcases;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.Luma.Framework.Utility.Utility;
import org.Luma.Freamwork.Base.DriverInstance;
import org.Luma.Freamwork.Pages.CreateAccount;
import org.Luma.Freamwork.Pages.Dashboard;
import org.Luma.Freamwork.Pages.LoginPage;
import org.Luma.Freamwork.Pages.ShippingaddressPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_001_validateLoginFunctionality extends DriverInstance {

	@Test(dataProvider="Logindata")
	public void TC_001_login_functionality(HashMap<String ,String> inputData) throws IOException, InterruptedException 
			
	{
		
		
		    String fname = inputData.get("fname");
	        String lname = inputData.get("lname");
	        String email = inputData.get("email");
	        String createpass = inputData.get("createpass");
	        String createconfirmpass = inputData.get("createconfirmpass");
	        String uname = inputData.get("uname");
	        String pass = inputData.get("pass");
	        String cname = inputData.get("cname");
	        String address = inputData.get("address");
	        String address1 = inputData.get("address1");
	        String address2 = inputData.get("address2");
	        String cityname = inputData.get("cityname");
	        String zipcode = inputData.get("zipcode");
	        String phonenumber = inputData.get("phonenumber");
	        
		CreateAccount ca = new CreateAccount(driver);
		ca.clickCreateAccount();
		ca.firstName(fname);
		ca.lastName(lname);
		ca.emailId(email);
		ca.password(createpass);
		ca.confirmPassword(createconfirmpass);
		ca.buttonCreateAccount();
		Thread.sleep(2000);
		ca.singOutArrow();
		ca.logOut();
		
		driver.get(Utility.fetchPropertyValue("applicationURL").toString());
		LoginPage login = new LoginPage(driver);
		Thread.sleep(1000);
		login.clickOnSignIn();
		login.enterEmail(uname);
		login.enterPassword(pass);
		login.clickSignin();
		
		Dashboard das = new Dashboard(driver);
		Thread.sleep(1000);
		das.gear();
		Thread.sleep(500);
		das.clickBags();
		das.selectBag();
		das.addToCart();
		Thread.sleep(5000);
		das.clickIconAddToCart();
		das.checkoutButton();
		
		ShippingaddressPage sap = new ShippingaddressPage(driver);
		Thread.sleep(5000);
		sap.companyName(cname);
		sap.streetAddress(address);
		sap.streetAddress1(address1);
		sap.streetAddress2(address2);
		sap.cityName(cityname);
		sap.countryName();
		sap.stateName();
		sap.zipCode(zipcode);
		sap.phoneNumber(phonenumber);
		sap.nextButton();
	}
	@DataProvider(name="Logindata")
	public Object[][] testDataGenerator() throws IOException {
		List<HashMap<String ,String>> data =getJsonDataToMap(System.getProperty("user.dir")
				+"\\src\\test\\java\\org\\Luma\\Freamwork\\testdata\\purchaseData.json");
		return  new Object[][] {{data.get(0)}};
	}

}
