package org.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionUtils {
	WebDriver driver;
	WebDriverWait wait;

	public ActionUtils(WebDriver driver) {
		this.driver = driver;
		new WebDriverWait(driver, Duration.ofSeconds(15));

	}

	public void clickUsingActions(WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));

		new Actions(driver).moveToElement(element).pause(Duration.ofSeconds(5)).click().perform();
	}

}
