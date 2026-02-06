package org.automation.webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingVontrolToAnActiveElement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("KGF Chapter 2");
		driver.get("http://facebook.com/");
		driver.switchTo().activeElement().sendKeys("Hemanth");
	}

}


