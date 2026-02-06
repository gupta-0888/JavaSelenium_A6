package org.automation.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLocatorXpathUsingAndOrOperator2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Aman/Downloads/XpathLogicalAnd.html");
		WebElement firstName =  driver.findElement(By.xpath("//input[@id='f-name' or @name='first']"));
		firstName.clear();
		firstName.sendKeys("Aman");
		WebElement lastName = driver.findElement(By.xpath("//input[@id='l-name' or @name='last']"));
		lastName.clear();
		lastName.sendKeys("Gupta");
		driver.findElement(By.xpath("//input[@name='gender' and @value='M']")).click();
		
	}

}
