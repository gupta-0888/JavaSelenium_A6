package org.automation.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingSelectClassYearMethodByValue {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg");
		WebElement yearDropDown = driver.findElement(By.id("year"));
		Select select = new Select(yearDropDown);
		List<WebElement> allOptions = select.getOptions();
		for (WebElement option : allOptions) {
			String value = option.getAttribute("value");
			select.selectByValue(value);
		}

	}

}
