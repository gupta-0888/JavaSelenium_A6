package org.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompletedPage {

	@FindBy(xpath = "//strong[text()='Your order has been successfully processed!']")
	private WebElement orderPlacedMsg;

	public CompletedPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrderPlacedMsg() {
		return orderPlacedMsg;
	}

}
