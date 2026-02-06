package org.automation.batchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Motorola {

	@Test
	public void lunchingEdge40() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://we.motorola.com/smartphones-motorola-edge-40-pro/p");
		Reporter.log("TestNG method 1", true);
	}

}
