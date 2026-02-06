package org.automation.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrameInDream11 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dream11.com/fantasy-sports");
//		driver.switchTo().frame(0);
//		driver.switchTo().frame("send-sms-iframe");
		driver.switchTo().frame(driver.findElement(By.id("send-sms-iframe")));
		driver.findElement(By.id("regEmail")).sendKeys("7352575110");
		driver.findElement(By.id("regUser")).click();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Industry Overview")).click();
	}

}
