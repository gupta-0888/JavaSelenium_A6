package org.pomRepository;

import org.genericLib.Flib;
import org.genericLib.SelectUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	@FindBy(id = "billing-address-select")
	private WebElement newAddressDD;
	@FindBy(id = "BillingNewAddress_CountryId")
	private WebElement countryDD;
	@FindBy(id = "BillingNewAddress_City")
	private WebElement cityTB;
	@FindBy(id = "BillingNewAddress_Address1")
	private WebElement address1TB;
	@FindBy(id = "BillingNewAddress_PhoneNumber")
	private WebElement phoneNoTB;
	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	private WebElement postalCodeTB;
	@FindBy(id = "BillingNewAddress.FaxNumber")
	private WebElement faxNoTB;
	@FindBy(id = "PickUpInStore")
	private WebElement pickupCheckBox;
	@FindBy(id = "paymentmethod_0")
	private WebElement cashOnDileveryCheckBox;
	@FindBy(id = "paymentmethod_1")
	private WebElement moneyOrderCheckBox;
	@FindBy(id = "paymentmethod_2")
	private WebElement creditCardCheckBox;
	@FindBy(id = "paymentmethod_3")
	private WebElement purchaseOrderCheckBox;
	@FindBy(id = "shippingoption_0")
	private WebElement byGroundCheckBox;
	@FindBy(id = "shippingoption_1")
	private WebElement byAirCheckBox;
	@FindBy(id = "shippingoption_2")
	private WebElement by2DayAirCheckBox;

	@FindBy(xpath = "//span[@class='product-price order-total']")
	private WebElement totalPriceOfCart;
	@FindBy(xpath = "//span[text()='Tax: ']")
	private WebElement taxPrice;
	@FindBy(xpath = "//span[contains(text(),'Payment')]")
	private WebElement shippingChargesPrice;
	@FindBy(xpath = "//span[contains(text(),'Shipping:')]")
	private WebElement priceofAllProduct;

	@FindBy(xpath = "//input[@onclick='Billing.save()']")
	private WebElement billingContinueButton;
	@FindBy(xpath = "//input[@onclick='Shipping.save()']")
	private WebElement shippingButton;
	@FindBy(xpath = "//input[@onclick='ShippingMethod.save()']")
	private WebElement shippingMethodButton;
	@FindBy(xpath = "//input[@onclick='PaymentMethod.save()']")
	private WebElement paymentMethodButton;
	@FindBy(xpath = "//input[@onclick='PaymentInfo.save()']")
	private WebElement paymentInfoButton;
	@FindBy(xpath = "//input[@value='Confirm']")
	private WebElement confirmButton;

	@FindBy(xpath = "//h2[text()='Shipping address']/../..//a[text()='Back']")
	private WebElement backLink1;
	@FindBy(xpath = "//h2[text()='Shipping method']/../..//a[text()='Back']")
	private WebElement backLink2;
	@FindBy(xpath = "//h2[text()='Payment method']/../..//a[text()='Back']")
	private WebElement backLink3;
	@FindBy(xpath = "//h2[text()='Payment information']/../..//a[text()='Back']")
	private WebElement backLink4;
	@FindBy(xpath = "//h2[text()='Confirm order']/../..//a[text()='Back']")
	private WebElement backLink5;

	public CheckOutPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getCountryDD() {
		return countryDD;
	}

	public WebElement getCityTB() {
		return cityTB;
	}

	public WebElement getAddress1TB() {
		return address1TB;
	}

	public WebElement getPhoneNoTB() {
		return phoneNoTB;
	}

	public WebElement getPostalCodeTB() {
		return postalCodeTB;
	}

	public WebElement getFaxNoTB() {
		return faxNoTB;
	}

	public WebElement getPickupCheckBox() {
		return pickupCheckBox;
	}

	public WebElement getCashOnDileveryCheckBox() {
		return cashOnDileveryCheckBox;
	}

	public WebElement getMoneyOrderCheckBox() {
		return moneyOrderCheckBox;
	}

	public WebElement getCreditCardCheckBox() {
		return creditCardCheckBox;
	}

	public WebElement getPurchaseOrderCheckBox() {
		return purchaseOrderCheckBox;
	}

	public WebElement getByGroundCheckBox() {
		return byGroundCheckBox;
	}

	public WebElement getByAirCheckBox() {
		return byAirCheckBox;
	}

	public WebElement getBy2DayAirCheckBox() {
		return by2DayAirCheckBox;
	}

	public WebElement getTotalPriceOfCart() {
		return totalPriceOfCart;
	}

	public WebElement getTaxPrice() {
		return taxPrice;
	}

	public WebElement getShippingChargesPrice() {
		return shippingChargesPrice;
	}

	public WebElement getPriceofAllProduct() {
		return priceofAllProduct;
	}

	public WebElement getBillingContinueButton() {
		return billingContinueButton;
	}

	public WebElement getShippingButton() {
		return shippingButton;
	}

	public WebElement getShippingMethodButton() {
		return shippingMethodButton;
	}

	public WebElement getPaymentMethodButton() {
		return paymentMethodButton;
	}

	public WebElement getPaymentInfoButton() {
		return paymentInfoButton;
	}

	public WebElement getConfirmButton() {
		return confirmButton;
	}

	public WebElement getbackLink1() {
		return backLink1;
	}

	public WebElement getbackLink2() {
		return backLink2;
	}

	public WebElement getbackLink3() {
		return backLink3;
	}

	public WebElement getbackLink4() {
		return backLink4;
	}

	public WebElement getbackLink5() {
		return backLink5;
	}

	public void buyProduct(String city, String address1, String pinCode, String contact) {
		SelectUtility su = new SelectUtility();
		try {
			if (newAddressDD.isDisplayed()) {
				su.selectByVisibleTextMehod(newAddressDD, "New Address");
			}
		} catch (Exception e) {
			su.selectByVisibleTextMehod(countryDD, "India");
		}

		su.selectByVisibleTextMehod(countryDD, "India");
		cityTB.sendKeys(city);
		address1TB.sendKeys(address1);
		postalCodeTB.sendKeys(pinCode);
		phoneNoTB.sendKeys(contact);
		cityTB.sendKeys(city);
		address1TB.sendKeys(address1);
		postalCodeTB.sendKeys(pinCode);
		phoneNoTB.sendKeys(contact + Flib.generateRandomNumber());
		billingContinueButton.click();
		shippingButton.click();
		shippingMethodButton.click();
		paymentMethodButton.click();
		paymentInfoButton.click();
		confirmButton.click();

	}

}
