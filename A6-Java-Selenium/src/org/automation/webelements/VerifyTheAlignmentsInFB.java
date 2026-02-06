package org.automation.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheAlignmentsInFB {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailTextBox = driver.findElement(By.id("email"));
		WebElement passTextBox = driver.findElement(By.id("passContainer"));

		Dimension emailTBSize = emailTextBox.getSize();
		Dimension passTBSize = passTextBox.getSize();
		Point emailTBLoc = emailTextBox.getLocation();
		Point passTBLoc = passTextBox.getLocation();

		System.out.println(emailTBLoc.getX() + "   " + passTBLoc.getX());
		if (emailTBLoc.getX() == passTBLoc.getX())
			System.out.println("left alignment is proper");
		else
			System.out.println("left alignment is improper");

		System.out.println(
				emailTBLoc.getX() + emailTBSize.getWidth() + "     " + passTBLoc.getX() + passTBSize.getWidth());

		if (emailTBLoc.getX() + emailTBSize.getWidth() == passTBLoc.getX() + passTBSize.getWidth())
			System.out.println("right alignmet is proper");
		else
			System.out.println("right alignment is improper");

		System.out.println(passTBLoc.getY() + "  " + (emailTBLoc.getY() + emailTBSize.getHeight()));
		if (passTBLoc.getY() - (emailTBLoc.getY() + emailTBSize.getHeight()) > 0)
			System.out.println("elements are not overlapped");
		else
			System.out.println("elements are overlapped");
	}

}
