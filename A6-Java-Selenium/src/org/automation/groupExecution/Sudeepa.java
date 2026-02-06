package org.automation.groupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sudeepa {

	@Test(groups = { "Telugu", "Kannada", "Malayalam" })
	public void lunchSudeepa() {
		Reporter.log("Sudeepa page lunching", true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Sudeepa");
		driver.quit();

	}

}
