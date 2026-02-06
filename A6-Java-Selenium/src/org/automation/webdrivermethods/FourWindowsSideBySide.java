package org.automation.webdrivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FourWindowsSideBySide {
	public static void main(String[] args) throws InterruptedException {
		// Create 4 ChromeDriver instances
		WebDriver driver1 = new ChromeDriver();
		WebDriver driver2 = new ChromeDriver();
		WebDriver driver3 = new ChromeDriver();
		WebDriver driver4 = new ChromeDriver();

		// Open pages (can be the same or different)
//		driver1.get("https://example.com");
//		driver2.get("https://example.com");
//		driver3.get("https://example.com");
//		driver4.get("https://example.com");

		// Get screen width & height from one window
		Dimension screenSize = driver1.manage().window().getSize();
		int screenWidth =  screenSize.getWidth();
        int screenHeight =  screenSize.getHeight();

		// Divide width into 4 equal parts
		

		
//		int newWidth = fullWidth / 4;
		int overlapFix = 0;
		int newWidth = (screenWidth + overlapFix * 2) / 4;
		int newHeight = screenHeight;

		// Apply new size to each window
		Dimension windowSize = new Dimension(newWidth, newHeight);

		driver1.manage().window().setSize(windowSize);
		driver1.manage().window().setPosition(new Point(0, 0));

		driver2.manage().window().setSize(windowSize);
		driver2.manage().window().setPosition(new Point(newWidth * 2, 0));

		driver3.manage().window().setSize(windowSize);
		driver3.manage().window().setPosition(new Point(newWidth * 3, 0));

		driver4.manage().window().setSize(windowSize);
		driver4.manage().window().setPosition(new Point(newWidth * 4, 0));

		System.out.println("Four Chrome windows opened side by side (||||).");

		// Keep windows open for observation
		Thread.sleep(10000); // 10 seconds

//		// Close all
//		driver1.quit();
//		driver2.quit();
//		driver3.quit();
//		driver4.quit();
	}
}
