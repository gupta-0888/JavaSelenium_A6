package org.automation.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingDragAndDropByOffset {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.reliancedigital.in/");
		WebElement popupButton =  driver.findElement(By.xpath("//button[@class='No thanks']"));
//		popupButton.click();
		
		Actions actions = new Actions(driver);
//		actions.click(popupButton).perform();
		actions.moveToElement(popupButton).pause(2000).click().perform();
	}

}
