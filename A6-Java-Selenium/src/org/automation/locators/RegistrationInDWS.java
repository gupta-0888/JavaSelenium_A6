package org.automation.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationInDWS {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Aman");
		driver.findElement(By.id("LastName")).sendKeys("Gupta");
		driver.findElement(By.id("Email")).sendKeys("amankrgupta3033@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Aman@7488");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Aman@7488");
		driver.findElement(By.id("register-button")).click();

	}

}
