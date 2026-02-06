package org.automation.testScripts;

import java.time.Duration;

import org.automation.genericUtilities.Flib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTC {
	public static void main(String[] args) {
		WebDriver driver = null;
		String Browser = Flib.getPropertyValue("browser");
		String url = Flib.getPropertyValue("url");
		String email = Flib.getPropertyValue("email");
		String password = Flib.getPropertyValue("password");
		
		if(Browser.equals("chrome")) {
		 driver = new ChromeDriver();
		}else {
			System.out.println("Driver is not present");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

}
