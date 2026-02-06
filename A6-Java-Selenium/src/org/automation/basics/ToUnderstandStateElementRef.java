package org.automation.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandStateElementRef {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		loginLink.click();
		WebElement emailTF = driver.findElement(By.id("Email"));
		emailTF.sendKeys("");
		WebElement passwordTF = driver.findElement(By.id("Password"));
		passwordTF.sendKeys("");
		WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Log in']"));
		loginBtn.click();
		driver.quit();
	}

}
