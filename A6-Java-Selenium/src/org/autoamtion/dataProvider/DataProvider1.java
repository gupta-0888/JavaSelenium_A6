package org.autoamtion.dataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {

	@DataProvider(name = "credentials")
	public String[][] dataProviderMethod() {
		String[][] data = { { "qspiders@gmail.com", "Qspiders@123" }, { "jspiders@yahoo.com", "JsPiDeRs@456" },
				{ "pYspiders@gmail.com", "Py-Spiders@789" } };
		return data;
	}

	@Test(dataProvider = "credentials", dataProviderClass = org.autoamtion.dataProvider.DataProvider1.class)
	public void login(String email, String password) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(500);
		driver.findElement(By.id("Email")).sendKeys(email);
		Thread.sleep(500);
		driver.findElement(By.id("Password")).sendKeys(password);
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(500);
		driver.quit();

	}

}
