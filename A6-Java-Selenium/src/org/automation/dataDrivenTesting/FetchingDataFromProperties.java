package org.automation.dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.automation.genericUtilities.Flib;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingDataFromProperties {
	public static void main(String[] args) throws IOException {
		File file = new File(".\\TestData\\DWS.properties");
//		File file = new File(System.getProperty("user.dir")+"\\TestData\\DWS.properties");	
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("email"));
		System.out.println(prop.getProperty("password"));

		if (prop.getProperty("browser").equals("chrome")) {
			new ChromeDriver();
		}

	}

}
