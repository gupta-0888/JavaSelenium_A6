package org.automation.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingSendKeysToPerformLogin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		WebElement emailTextBox = driver.switchTo().activeElement();
		emailTextBox.sendKeys("amankrgupta3033@gmail.com", Keys.CONTROL + "a");
//		emailTextBox.sendKeys(Keys.DELETE);
//		emailTextBox.sendKeys(Keys.BACK_SPACE);
//		emailTextBox.sendKeys(Keys.CONTROL + "x");
		emailTextBox.sendKeys(Keys.CONTROL + "c");
//		Thread.sleep(1000);
		emailTextBox.sendKeys(Keys.TAB, Keys.CONTROL + "v");
	}

}
