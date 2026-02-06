package org.automation.popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HadnlingConfirmationAlertINDemoQA {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoqa.com/alerts");
		WebElement button = driver.findElement(By.id("confirmButton"));
		Actions actions = new Actions(driver);
		actions.scrollToElement(button).scrollByAmount(0, 300).perform();
		button.click();
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert message : " + alert.getText());
		alert.accept();
		alert.dismiss();

	}

}
