package org.autoamtion.modulerFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	@FindBy(id = "BillingNewAddress_FirstName")
	private WebElement firstName;

	@FindBy(id = "BillingNewAddress_LastName")
	private WebElement lastName;

	@FindBy(id = "BillingNewAddress_Email")
	private WebElement emailTB;

	@FindBy(id = "BillingNewAddress_CountryId")
	private WebElement countryID;

	@FindBy(id = "BillingNewAddress_StateProvinceId")
	private WebElement statePrivienceID;

	@FindBy(id = "BillingNewAddress_City")
	private WebElement cityTB;

	@FindBy(id = "BillingNewAddress_Address1")
	private WebElement address1TB;

	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	private WebElement postalCodeTB;

	@FindBy(id = "BillingNewAddress_PhoneNumber")
	private WebElement phoneNumber;

	@FindBy(xpath = "//input[@onclick='Billing.save()']")
	private WebElement continueBilling;

	@FindBy(id = "shipping-address-select")
	private WebElement shippingAdress;

	@FindBy(xpath = "//input[@onclick='Shipping.save()']")
	private WebElement continueShipping;

	@FindBy(xpath = "//input[@onclick='ShippingMethod.save()']")
	private WebElement continueShippingMethod;

	@FindBy(xpath = "//input[@onclick='PaymentMethod.save()']")
	private WebElement paymentContinue;

	@FindBy(xpath = "//input[@onclick='PaymentInfo.save()']")
	private WebElement paymentContinueIfno;

	@FindBy(xpath = "//input[@value='Confirm']")
	private WebElement confirmOrder;

	public CheckOutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmailTB() {
		return emailTB;
	}

	public WebElement getCountryID() {
		return countryID;
	}

	public WebElement getStatePrivienceID() {
		return statePrivienceID;
	}

	public WebElement getCity() {
		return cityTB;
	}

	public WebElement getAddress1() {
		return address1TB;
	}

	public WebElement getPostalCode() {
		return postalCodeTB;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getContinueBilling() {
		return continueBilling;
	}

	public WebElement getShippingAdress() {
		return shippingAdress;
	}

	public WebElement getContinueShipping() {
		return continueShipping;
	}

	public WebElement getContinueShippingMethod() {
		return continueShippingMethod;
	}

	public WebElement getPaymentContinue() {
		return paymentContinue;
	}

	public WebElement getPaymentContinueIfno() {
		return paymentContinueIfno;
	}

	public WebElement getConfirmOrder() {
		return confirmOrder;
	}

	public void buyProduct( String city, String address1, String pinCode, String contact) {
		SelectUtility selectUtility = new SelectUtility();
		selectUtility.selectByVisibleTextMehod(countryID, "India");
		cityTB.sendKeys(city);
		address1TB.sendKeys(address1);
		postalCodeTB.sendKeys(pinCode);
		phoneNumber.sendKeys(contact+Flib.generateRandomNumber());
		continueBilling.click();
		continueShipping.click();
		continueShippingMethod.click();
		paymentContinue.click();
		confirmOrder.click();
		
	}
	
	
}
