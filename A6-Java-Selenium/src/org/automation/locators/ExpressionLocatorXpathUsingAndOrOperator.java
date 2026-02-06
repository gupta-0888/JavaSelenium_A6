package org.automation.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExpressionLocatorXpathUsingAndOrOperator {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in/");
//		driver.findElement(By.xpath("//button[text()='Continue shopping")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 16");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//span[contains(text(),'iPhone 16') and contains(text(), 'Teal')]")).click();

	}

}
