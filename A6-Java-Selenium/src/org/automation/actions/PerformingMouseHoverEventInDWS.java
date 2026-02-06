package org.automation.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingMouseHoverEventInDWS {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement menLink = driver.findElement(By.partialLinkText("ELECTRONICS"));
		Actions actions = new Actions(driver);
		actions.moveToElement(menLink).perform();
//		actions.moveToLocation(502, 197).perform();
		actions.moveByOffset(-120, 0).perform();
	}

}
