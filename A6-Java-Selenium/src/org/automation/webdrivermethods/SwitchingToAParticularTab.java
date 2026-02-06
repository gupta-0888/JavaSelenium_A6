package org.automation.webdrivermethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingToAParticularTab {
	public static void main(String[] args) throws InterruptedException {
		String expectedURL = "https://www.fossil.com/en-in/";

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sonatawatches.in/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://jokerandwitch.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.fossil.com/en-in/");
		String expectedTitle = driver.getTitle();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://shop.timexindia.com/");

		Set<String> allWindowIDs = driver.getWindowHandles();
		for (String windowId : allWindowIDs) {
			driver.switchTo().window(windowId);
			Thread.sleep(2000);
			String actualTitle = driver.getTitle();
			if(expectedTitle.equals(actualTitle)) {
				break;
			}
//			String actualURL = driver.getCurrentUrl();
//			if (expectedURL.equals(actualURL)) {
//				break;
//			}

		}
	}

}
