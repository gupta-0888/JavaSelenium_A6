package org.autoamtion.assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToUnderstandHardAssert {

	@Test
	public void validLogin() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		String expectedWelcomeTitle = "Demo Web Shop";
		String expectedLoginTitle = "Demo Web Shop. Login";
		Assert.assertEquals(driver.getTitle(), expectedWelcomeTitle, "Welcome Page Title is not displayed !!");

		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(500);
		Assert.assertEquals(driver.getTitle(), expectedLoginTitle, "Login page is not displayed !!");
		driver.findElement(By.id("Email")).sendKeys("amankrgupta3033@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.id("Password")).sendKeys("Aman@7488");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(500);
	

	}
}
