package org.automation.popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingSimpleAlert {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://retail.sbi.bank.in/retail/login.htm");
		Actions actions = new Actions(driver);
		actions.contextClick().perform();
//		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();


		driver.findElement(By.partialLinkText("CONTINUE TO LOGIN")).click();
	}

}
