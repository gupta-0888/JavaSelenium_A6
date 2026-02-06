package org.autoamtion.modulerFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	@FindBy(linkText = "Register")
	private WebElement registerLink;

	@FindBy(linkText = "Log in")
	private WebElement loginLink;

	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingCartLink;

	@FindBy(xpath = "//span[text()='Wishlist']")
	private WebElement wishListLink;

	@FindBy(partialLinkText = "BOOKS")
	private WebElement booksLink;

	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement computersLink;

	@FindBy(partialLinkText = "ELECTRONICS")
	private WebElement electronicsLink;

	@FindBy(linkText = "Log out")
	private WebElement logoutLink;

//	private WebDriver driver;

	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	public WebElement getWishListLink() {
		return wishListLink;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

}
