package org.automation.groupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Vijay {
	@Test(groups = { "Telugu", "Kannada", "Malayalam" })
	public void lunchVijay() {
		Reporter.log("Vijay page lunching", true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Vijay_(actor)");
		driver.quit();

	}

}
