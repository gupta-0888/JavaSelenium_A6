package org.autoamtion.modulerFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "gender-male")
	private WebElement genderMale;

	@FindBy(id = "gender-female")
	private WebElement genderFemale;

	@FindBy(id = "FirstName")
	private WebElement firstNameTF;

	@FindBy(id = "LastName")
	private WebElement lastNameTF;

	@FindBy(id = "Email")
	private WebElement emailTF;

	@FindBy(id = "Password")
	private WebElement passwordTF;

	@FindBy(id = "ConfirmPassword")
	private WebElement cnfPasswordTF;

	@FindBy(id = "register-button")
	private WebElement registerButton;

	public WebElement getGenderMale() {
		return genderMale;
	}

	public WebElement getGenderFemale() {
		return genderFemale;
	}

	public WebElement getFirstNameTF() {
		return firstNameTF;
	}

	public WebElement getLastNameTF() {
		return lastNameTF;
	}

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getCnfPasswordTF() {
		return cnfPasswordTF;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

}
