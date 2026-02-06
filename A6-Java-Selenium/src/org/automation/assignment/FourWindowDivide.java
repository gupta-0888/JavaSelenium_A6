package org.automation.assignment;

import java.awt.Toolkit;
import java.util.ArrayList;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class FourWindowDivide {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
//		driver.switchTo().newWindow(WindowType.WINDOW);
		 // Open 3 new windows
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.switchTo().newWindow(WindowType.WINDOW);

        // Store all window handles
        ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());

        // Get screen size dynamically
        int screenWidth  = Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;

        int width  = screenWidth / 2;
        int height = screenHeight;

        // Window 1 - Top Left
        driver.switchTo().window(windows.get(0));
        driver.manage().window().setSize(new Dimension(width, height));
        driver.manage().window().setPosition(new Point(0, 0));
        driver.get("https://www.google.com");

        // Window 2 - Top Right
        driver.switchTo().window(windows.get(1));
        driver.manage().window().setSize(new Dimension(width, height));
        driver.manage().window().setPosition(new Point(width, 0));
        driver.get("https://www.youtube.com");

        // Window 3 - Bottom Left
        driver.switchTo().window(windows.get(2));
        driver.manage().window().setSize(new Dimension(width, height));
        driver.manage().window().setPosition(new Point(0, height));
        driver.get("https://www.facebook.com");

        // Window 4 - Bottom Right
        driver.switchTo().window(windows.get(3));
        driver.manage().window().setSize(new Dimension(width, height));
        driver.manage().window().setPosition(new Point(width, height));
        driver.get("https://www.linkedin.com");
	}
    
    
}
