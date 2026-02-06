package org.automation.groupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Rajnikanth {

	@Test(groups = { "Telugu", "Kannada", "Malayalam", "Hindi" })
	public void lunchRajnikanth() {
		Reporter.log("Rajnikanth page lunching", true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Rajinikanth");
		driver.quit();

	}
}
