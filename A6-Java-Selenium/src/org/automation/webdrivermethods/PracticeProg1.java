package org.automation.webdrivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeProg1 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		Point position = driver.manage().window().getPosition();
		System.out.println(position);
		int x = size.getHeight();
		int y = size.getWidth()/4;
//		driver.manage().window().setSize(x,y);
		
	}

}
