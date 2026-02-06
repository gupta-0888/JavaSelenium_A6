package org.automation.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement state = driver.findElement(By.id("state"));
		Actions actions = new Actions(driver);
		actions.moveToElement(state).click().perform();		
		Select select = new Select(state);
		select.selectByIndex(2);
		
//		actions.click(state).sendKeys("Uttar Pardesh").build().perform();
		
	}

}
