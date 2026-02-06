package org.automation.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingDeselectionOptionInMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement dropDown = driver.findElement(By.id("multiselect1"));
		Select select = new Select(dropDown);
		if (select.isMultiple())
			System.out.println("Multi - select dropdown");
		else
			System.out.println("Single - select dropdown");
		List<WebElement> allOptions = select.getOptions();

//		for (int i = 0; i < allOptions.size(); i++) {
//			select.selectByIndex(i);
//		}
		
		for(WebElement option : allOptions) {
			String text = option.getText();
			select.selectByVisibleText(text);
		}

		Thread.sleep(2000);
		select.deselectByIndex(1);

		Thread.sleep(2000);
		select.deselectByVisibleText("Audi");

		Thread.sleep(2000);
		select.selectByVisibleText("Swift");

		Thread.sleep(2000);
		select.deselectByValue("volvox");
		Thread.sleep(2000);
		select.deselectAll();
	}

}
