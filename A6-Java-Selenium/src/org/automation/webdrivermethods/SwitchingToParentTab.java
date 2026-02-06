package org.automation.webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingToParentTab {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sonatawatches.in/");
		String parentWindowID = driver.getWindowHandle();
		System.out.println(parentWindowID);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://jokerandwitch.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.fossil.com/en-in/");
		driver.switchTo().window(parentWindowID);
	}

}
