package org.automation.locators.dependantandindependant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAddToCartButtonInAmazon {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("noise earbuds");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String addToCartVS501 = "//span[contains(text(),'VS102') and contains(text(),'Black')]/../../../..//button[text()='Add to cart']";
		driver.findElement(By.xpath(addToCartVS501)).click();
		driver.findElement(By.xpath("//div[contains(@id,'cart-text')]")).click();
		
		

	}

}
