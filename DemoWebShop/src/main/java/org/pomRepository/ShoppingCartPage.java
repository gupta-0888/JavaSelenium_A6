package org.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

	@FindBy(xpath = "//a[text()='Smartphone']/../..//input[@name='removefromcart']")
	private WebElement smartPhoneCartCheckItem;

	@FindBy(name = "updatecart")
	private WebElement updateCartBtn;

	@FindBy(name = "continueshopping")
	private WebElement continueShoppingBtn;
	
	@FindBy(id = "termsofservice")
	private WebElement termsOfServiceCheckBox;
	
	@FindBy(id = "checkout")
	private WebElement checkOutBtn;
	
	public ShoppingCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSmartPhoneCartCheckItem() {
		return smartPhoneCartCheckItem;
	}

	public WebElement getUpdateCartBtn() {
		return updateCartBtn;
	}

	public WebElement getContinueShoppingBtn() {
		return continueShoppingBtn;
	}

	public WebElement getTermsOfServiceCheckBox() {
		return termsOfServiceCheckBox;
	}

	public WebElement getCheckOutBtn() {
		return checkOutBtn;
	}

	public void removeSmartPhoneMethod() {
		smartPhoneCartCheckItem.click();
		updateCartBtn.click();	
	}
}
