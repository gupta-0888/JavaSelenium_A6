package org.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	@FindBy(name = "username")
	private WebElement usernameTF;
	
	@FindBy(name = "password")
	private WebElement passwordTF;
	
	@FindBy(xpath = "//button[text()=' Login ']")
	private WebElement loginBtn;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public WebElement getUsernameTF() {
		return usernameTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	

}
