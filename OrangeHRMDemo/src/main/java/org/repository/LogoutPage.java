package org.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage{
	
	@FindBy(xpath = "//li[@class='oxd-userdropdown']")
	private WebElement userDropDown;
	
	@FindBy(linkText = "Logout")
	private WebElement logout;
	
	

	public WebElement getUserDropDown() {
		return userDropDown;
	}



	public WebElement getLogout() {
		return logout;
	}



	public LogoutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

}
