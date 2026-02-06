package org.automation.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnFlipkartUsingLinkText {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("Motorola", Keys.ENTER);
		driver.findElement(By.linkText("MOTOROLA Edge 60 Pro (Pantone Sparkling Grape, 256 GB)")).click();
	}

}
