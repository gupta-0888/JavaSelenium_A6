package org.automation.testScripts;

import java.time.Duration;

import org.automation.genericUtilities.Flib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTC {

	public static void main(String[] args) {
		String url = Flib.getPropertyValue("url");
		String sheetName = "Register";
		String gender = Flib.getWorkbookCellValue(sheetName, 1, 0);
		String firstName = Flib.getWorkbookCellValue(sheetName, 1, 1);
		String lastName = Flib.getWorkbookCellValue(sheetName, 1, 2);
		String email = Flib.getWorkbookCellValue(sheetName, 1, 3);
		String password = Flib.getWorkbookCellValue(sheetName, 1, 4);
			
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		driver.findElement(By.linkText("Register")).click();
		if(gender.equalsIgnoreCase("male")) {
			driver.findElement(By.id("gender-male")).click();
		}else {
			driver.findElement(By.id("gender-female")).click();
		}
		driver.findElement(By.id("FirstName")).sendKeys(firstName);
		driver.findElement(By.id("LastName")).sendKeys(lastName);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
		driver.findElement(By.id("register-button")).click();
		
	}

}
