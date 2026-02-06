package org.automation.webdrivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingControlToNewTabOrWindow {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fantasiechocolate.com");
//		driver.switchTo().newWindow(WindowType.TAB);
		 Dimension size = driver.manage().window().getSize();
	        int width = size.getWidth();
	        int height = size.getHeight();

	        // Calculate one-fourth size
	        int newWidth = width / 2;
	        int newHeight = height / 2;

	        // Resize window to one-fourth of original area
	        Dimension newSize = new Dimension(newWidth, newHeight);
	        driver.manage().window().setSize(newSize);

	        // (Optional) Move the window so you can see it clearly
	        // For example, move to top-left corner
	        driver.manage().window().setPosition(new Point(0, 1));



//		driver.get("https://lepure.in");
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		driver.get("https://manamchocolate.com");
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://royceindia.com");
//		Thread.sleep(3000);
//		driver.quit();
		

	}

}
