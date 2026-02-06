package org.automation.webdrivermethods;

import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToTheRequiredWindow {

	public static void main(String[] args) throws InterruptedException 
	{	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sonatawatches.in/");
		String parentWindowID = driver.getWindowHandle();
		System.out.println(parentWindowID);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://jokerandwitch.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.fossil.com/en-in/");
		String actualTitle = driver.getTitle();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://shop.timexindia.com/");
		
		driver.switchTo().window(parentWindowID);
		Set<String> windowID = driver.getWindowHandles();
		System.out.println(windowID);
		
		for(String partWindow : windowID)
		{
			driver.switchTo().window(partWindow);
			String currTitle = driver.getTitle();
			Thread.sleep(2000);
			if(currTitle.equals(actualTitle))
				break;
			
		}
		
		
	}

}
