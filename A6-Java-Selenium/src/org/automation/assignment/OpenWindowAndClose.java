package org.automation.assignment;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWindowAndClose {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.flipkart.com/");
		String expectedTitle = driver.getTitle();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.amazon.in/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.purplle.com/");
		Set<String> allWindowIDs = driver.getWindowHandles();
		for(String windowId : allWindowIDs) {
			driver.switchTo().window(windowId);
			String actualTitle = driver.getTitle();
			Thread.sleep(2000);
			if(expectedTitle.equals(actualTitle)) {
				driver.close();
			}
		}

	
	}

}
