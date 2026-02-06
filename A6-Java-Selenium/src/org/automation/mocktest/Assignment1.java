package org.automation.mocktest;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Aman/Downloads/Assign.html");
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		Set<String> allWindowIDs = driver.getWindowHandles();
		String swiggyURL = "https://www.swiggy.com/";
		for (String window : allWindowIDs) {
			Thread.sleep(2000);
			driver.switchTo().window(window);
			String url = driver.getCurrentUrl();
			if (url.equals(swiggyURL)) {
				driver.manage().window().maximize();
				driver.close();
			}
		}

	}

}
