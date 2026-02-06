package org.automation.assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicDropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://vinothqaacademy.com/");
		Actions actions = new Actions(driver);
		WebElement demoSites =  driver.findElement(By.linkText("Demo Sites"));
		actions.moveToElement(demoSites).perform();
		List<WebElement> demoSitesPage =  driver.findElements(By.xpath("(//ul[@class='sub-menu'])[9]"));
		for(WebElement pages : demoSitesPage) {
			String aTag = pages.getText();
			System.out.println(aTag);
		}
		
	}

}
