package org.automation.locators.dependantandindependant;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAllAddToCartInAmanzon {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
//		driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("harry potter book");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> addToCartButtons = driver.findElements(By.xpath("//button[text()='Add to cart']"));
		System.out.println(addToCartButtons.size());
		for (WebElement buttons : addToCartButtons) {
			Thread.sleep(1000);
			buttons.click();

		}

	}

}
