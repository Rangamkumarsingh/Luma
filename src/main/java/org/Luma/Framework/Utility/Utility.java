package org.Luma.Framework.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility {
	public static Object fetchPropertyValue(String key) throws IOException {
		//FileInputStream file = new FileInputStream("*./Config/config.properties");
		FileInputStream file = new FileInputStream("C:\\Users\\ranga\\Desktop\\JAVA\\Luma\\Config\\config.properties");
		Properties property = new Properties ();
		property.load(file);
		return property.get(key);
	}
	
	public static String fetchLocatorValue(String key) throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\ranga\\Desktop\\JAVA\\Luma\\Config\\Elements.properties");
		Properties property = new Properties ();
		property.load(file);
		return property.get(key).toString();
	}

}
