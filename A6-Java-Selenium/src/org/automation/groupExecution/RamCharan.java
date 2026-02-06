package org.automation.groupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RamCharan {

	@Test(groups = { "Telugu", "Malayalam", "Hindi" })
	public void lunchRamCharan() {
		Reporter.log("Ram Charan page lunching", true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Ram_Charan");
		driver.quit();

	}

}
