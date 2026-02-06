package org.automation.groupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Mahesh {

	@Test(groups = { "Telugu", "Kannada", "Malayalam", "Hindi" })
	public void lunchMahesh() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/N._T._Rama_Rao_Jr.");
		driver.quit();
	}
}
