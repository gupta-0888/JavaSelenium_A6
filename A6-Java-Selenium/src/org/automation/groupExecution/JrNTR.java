package org.automation.groupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class JrNTR {

	@Test(groups = { "Telugu", "Kannada", "Malayalam", "Hindi" })
	public void lunchNtr() {
		Reporter.log("JR. NTR page lunching", true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/N._T._Rama_Rao_Jr.");
		driver.quit();
	}

}
