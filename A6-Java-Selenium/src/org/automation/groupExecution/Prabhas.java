package org.automation.groupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Prabhas {

	@Test(groups = { "Telugu", "Kannada", "Malayalam" })
	public void lunchPrabhas() {
		Reporter.log("Prabhas page lunching", true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Prabhas");
		driver.quit();
	}

}
