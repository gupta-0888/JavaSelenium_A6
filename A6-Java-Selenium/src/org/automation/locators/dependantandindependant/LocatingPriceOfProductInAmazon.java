package org.automation.locators.dependantandindependant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingPriceOfProductInAmazon {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("noise earbuds");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String priceOfEarbuds = "//span[contains(text(),'VS102') and contains(text(),'Black')]/../../../..//span[@class='a-price-whole']";
		WebElement priceText = driver.findElement(By.xpath(priceOfEarbuds));
		System.out.println("price : "+priceText.getText());
		
		
		

	}

}
