package org.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PIMPage extends BasePage {

	public PIMPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement hintEmployeeName;

	@FindBy(xpath = "//label[text()='Employee Id']/../..//input[contains(@class,'oxd-input--active')]")
	private WebElement enterEmployeeID;

	@FindBy(xpath = "//label[text()='Employment Status']/../..//div[contains(@class,'oxd-select-text')]")
	private WebElement dropDownEmploymentStatus;

	@FindBy(xpath = "//span[text()='Full-Time Contract']")
	private WebElement employmentStatusFullTime;

	@FindBy(xpath = "//label[text()='Include']/../..//div[contains(@class,'oxd-select-text')]")
	private WebElement dropDownInclude;

	@FindBy(xpath = "//div[text()='Current Employees Only']")
	private WebElement includeCurrnetEmployeesOnly;

	@FindBy(xpath = "//label[text()='Supervisor Name']/../..//input[@placeholder='Type for hints...']")
	private WebElement enterSupervisorName;

	@FindBy(xpath = "//label[text()='Job Title']/../..//div[contains(@class,'oxd-select-text--active')]")
	private WebElement dropDownJobTitle;

	@FindBy(xpath = "(//div[@role='option'])[2]")
	private WebElement jobFirstOption;

	@FindBy(xpath = "//label[text()='Sub Unit']/../..//div[contains(@class,'oxd-select-text--active')]")
	private WebElement dropDownSubUnit;

	@FindBy(xpath = "//span[text()='OrangeHRM']")
	private WebElement unitOrange;

	@FindBy(xpath = "//button[text()=' Search ']")
	private WebElement btnSearch;

	public void employeeInformation() throws InterruptedException {
		Thread.sleep(5000);
		hintEmployeeName.sendKeys(getUserName().getText());
		enterEmployeeID.sendKeys("23456");
		dropDownEmploymentStatus.click();
		employmentStatusFullTime.click();
		dropDownInclude.click();
		includeCurrnetEmployeesOnly.click();
		enterSupervisorName.sendKeys(getUserName().getText());
		dropDownJobTitle.click();
		jobFirstOption.click();
		dropDownSubUnit.click();
		unitOrange.click();
		btnSearch.click();

	}

}
