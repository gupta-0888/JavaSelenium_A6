package org.automation.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToFetchSelectedAndUnSelectedOptionsList {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Aman/Downloads/Bikes.html");
		WebElement dropDown = driver.findElement(By.id("Bikes"));
		Select select = new Select(dropDown);
		select.selectByIndex(4);
		select.selectByVisibleText("Hero Xpulse");
		select.selectByValue("yrx");

		List<WebElement> allOptions = select.getOptions();
		for (WebElement option : allOptions) {
			System.out.println(option.getText());
		}
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		for (WebElement option : selectedOptions) {
			System.out.println(option.getText());
		}

		allOptions.removeAll(selectedOptions);

		System.out.println(select.getFirstSelectedOption().getText());
	}

}
