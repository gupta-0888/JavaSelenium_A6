package org.automation.mocktest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 17");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath(
				"//span[contains(text(),'iPhone 17 Pro 256 GB') and  contains(text(),'Silver')]/../../../..//button[text()='Add to cart']"))
				.click();
		driver.findElement(By.id("nav-cart")).click();
		WebElement iphone17proMax = driver.findElement(By.xpath(
				"(//span[contains(text(),'iPhone 17 Pro 256 GB') and  contains(text(),'Silver')]/../../../../../../..//span[contains(text(),'₹')])[2]"));
		System.out.println("price : " + iphone17proMax.getText());

		driver.quit();

	}

}
