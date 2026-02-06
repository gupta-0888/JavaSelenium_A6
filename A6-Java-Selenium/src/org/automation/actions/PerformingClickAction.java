package org.automation.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingClickAction {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.reliancedigital.in/");
		driver.findElement(By.xpath("//button[@class='No thanks']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search') and @aria-label]")).sendKeys("Mobiles", Keys.ENTER);
		Thread.sleep(5000);
		WebElement slider = driver.findElement(By.xpath("(//div[text()=' Price ']/../..//div[@class='vue-slider-dot-handle'])[1]"));
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(slider, 100, 682).perform();
	}

}
