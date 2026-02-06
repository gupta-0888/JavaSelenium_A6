package org.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonesPage {
	
	@FindBy(xpath = "//a[text()='Smartphone']/../..//input[@value='Add to cart']")
	private WebElement smartPhoneAddToCartBtn;
	
	@FindBy(linkText = "Used phone")
	private WebElement userPhone;
	
	@FindBy(xpath = "//a[text()='Phone Cover']/../..//input[@value='Add to cart']")
	private WebElement phoneCoverAddToCart;
	
	@FindBy(xpath = "//p[contains(text(),'The product ')]")
	private WebElement productAdderdToCartMsg;
	
	public CellPhonesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSmartPhoneAddToCartBtn() {
		return smartPhoneAddToCartBtn;
	}

	public WebElement getUserPhone() {
		return userPhone;
	}

	public WebElement getPhoneCoverAddToCart() {
		return phoneCoverAddToCart;
	}

	public WebElement getProductAdderdToCartMsg() {
		return productAdderdToCartMsg;
	}
	
	

}
