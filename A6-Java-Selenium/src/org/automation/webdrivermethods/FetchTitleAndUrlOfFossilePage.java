package org.automation.webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTitleAndUrlOfFossilePage {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fossil.com/");
		String title = driver.getTitle();
		System.out.println("Title : " + title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL : " + currentUrl);
//		String sourceCode = driver.getPageSource();
//		System.out.println("SourceCode : " + sourceCode);
		driver.quit();

	}

}
