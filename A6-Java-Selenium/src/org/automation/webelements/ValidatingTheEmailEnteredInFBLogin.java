package org.automation.webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingTheEmailEnteredInFBLogin {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String email = "amankrgupta3033@gmail.com";
		WebElement emailTextBox = driver.switchTo().activeElement();
		emailTextBox.clear();
		emailTextBox.sendKeys(email);
		System.out.println(emailTextBox.getAttribute("class"));
		String enteredEmail = emailTextBox.getAttribute("value");
		if (email.equals(enteredEmail))
			System.out.println("email has been sucessfully entered");
		else
			System.err.println("email has not been entered");

	}

}
