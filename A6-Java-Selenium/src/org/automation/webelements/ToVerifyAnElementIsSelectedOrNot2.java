package org.automation.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAnElementIsSelectedOrNot2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement penCheckBox = driver.findElement(By.xpath("//input[@value='Pen' and @name]"));
		System.out.println(penCheckBox.isSelected() ? "pen Check Box is selected" : "pen Check Box is not selected");
		WebElement bookCheckBox = driver.findElement(By.xpath("//input[@value='Book']"));
		System.out.println(bookCheckBox.isSelected() ? "book Check Box is selected" : "book Check Box is not selected");
	}

}
