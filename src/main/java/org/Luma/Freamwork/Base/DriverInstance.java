package org.Luma.Freamwork.Base;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.Luma.Framework.Utility.Utility;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DriverInstance  {

	public WebDriver driver;
	@BeforeMethod
	public void initiateDriverInstance() throws IOException {
		if(Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranga\\Desktop\\JAVA\\Luma\\Driver\\chromedriver.exe");
	 driver = new ChromeDriver();
		}
 
		else if(Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\ranga\\Desktop\\JAVA\\Luma\\Driver\\geckodriver.exe");
	 driver = new FirefoxDriver();
		}
		
		else if(Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\ranga\\Desktop\\JAVA\\Luma\\Driver\\internetexplorerdriver.exe");
	 driver = new InternetExplorerDriver();
		}
		else 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranga\\Desktop\\JAVA\\Luma\\Driver\\chromedriver.exe");
	 driver = new ChromeDriver();
		}
		driver.get(Utility.fetchPropertyValue("applicationURL").toString());
	}
	
public List<HashMap<String, String>> getJsonDataToMap(String Filepath) throws IOException {
		
		String jsonContent= FileUtils.readFileToString(new File(Filepath),StandardCharsets.UTF_8);
		
		ObjectMapper mapper = new ObjectMapper();
		
		 List<HashMap<String, String>> data = mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>() { 
		 });
		return data;
	}
	 
	@AfterMethod
	public void closeDriverInstance() {
		driver.quit();
	}
}
