package org.automation.batchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Samsung {

	@Test
	public void lunchingS23() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.samsung.com/in/smartphones/galaxy-s23/buy/");
	}
	
	@Test
	public void lunchingS24Ultra() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.samsung.com/in/smartphones/galaxy-s24-ultra/");
	}
}
