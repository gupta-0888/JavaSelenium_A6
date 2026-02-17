package org.repository;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminPage extends BasePage{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	@FindBy(xpath = "//button[text()=' Add ']")
	private WebElement addButton;
	
	@FindBy(xpath ="//label[text()='User Role']/../..//div[contains(@class,'oxd-select-text')]")
	private WebElement dropDownUserRole;
	
	@FindBy(xpath = "//div[@class='oxd-select-wrapper']/..//span[text()='Admin']")
	private WebElement userRoleAdmin;
	
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement hintEmployeeName;
	
	@FindBy(xpath = "(//div[@role='listbox'])[1]")
	private WebElement suggestionFirstOption;
	
	@FindBy(xpath = "//label[text()='Status']/../..//div[contains(@class,'oxd-select-text')]")
	private WebElement dropDownStatus;
	
	@FindBy(xpath = "//div[@class='oxd-select-wrapper']/..//span[text()='Enabled']")
	private WebElement statusEnabled;
	
	@FindBy(xpath = "//label[text()='Username']/../..//input[contains(@class,'oxd-input')]")
	private WebElement userNameTF;
	
	@FindBy(xpath = "//label[text()='Password']/../..//input[contains(@class,'oxd-input')]")
	private WebElement passwordTF;
	
	@FindBy(xpath = "//label[text()='Confirm Password']/../..//input[contains(@class,'oxd-input')]")
	private WebElement confirmPasswordTF;
	
	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement saveButton;
	
	

	public AdminPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickAddButton() {
		addButton.click();
	}
	
	public void addUser() {
		dropDownUserRole.click();
		userRoleAdmin.click();
		hintEmployeeName.sendKeys(getUserName().getText());
//		WebElement suggestion = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@role='listbox'])[1]")));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(suggestion).pause(Duration.ofSeconds(5)).click().perform();
		dropDownStatus.click();
		statusEnabled.click();
		userNameTF.sendKeys("Rohit Gupta");
		passwordTF.sendKeys("rohit123");
		confirmPasswordTF.sendKeys("rohit123");
		saveButton.click();
	}
}