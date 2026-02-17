package org.repository;

import org.generic.ActionUtils;
import org.generic.SelectUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PerformancePage extends BasePage {

	ActionUtils actionUtils = new ActionUtils(driver);

	@FindBy(xpath = "//input[contains(@placeholder,'Type')]")
	private WebElement employeeNamePlaceHolder;

	@FindBy(xpath = "(//div[@role='option'])[1]")
	private WebElement option1;

	@FindBy(xpath = "//label[text()='Job Title']/../..//div[contains(@class,'oxd-select-text--active')]")
	private WebElement dropDownJobTitle;

	@FindBy(xpath = "(//div[@role='option'])[2]")
	private WebElement jobFirstOption;

	@FindBy(xpath = "//label[text()='Sub Unit']/../..//div[contains(@class,'oxd-select-text--active')]")
	private WebElement dropDownSubUnit;

	@FindBy(xpath = "//span[text()='OrangeHRM']")
	private WebElement unitOrange;

	@FindBy(xpath = "//label[text()='Include']/../..//div[contains(@class,'oxd-select-text--active')]")
	private WebElement dropDownInclude;

	@FindBy(xpath = "//span[contains(text(),'Current Employees')]")
	private WebElement includeCurrentEmp;

	@FindBy(xpath = "//label[text()='Review Status']/../..//div[contains(@class,'oxd-select-text--active')]")
	private WebElement dropDownReviewStatus;

	@FindBy(xpath = "//span[contains(text(),'Progress')]")
	private WebElement statusProgress;

	@FindBy(xpath = "//button[text()=' Search ']")
	private WebElement btnSearch;

	public PerformancePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
//	Actions actions = new Actions(driver);
	public void employeeReviews() {
		SelectUtility selectUtility = new SelectUtility();
		String name = getUserName().getText();
		employeeNamePlaceHolder.sendKeys(name);
//		actionUtils.clickUsingActions(option1);
		selectUtility.selectDropDownValue(dropDownJobTitle).click();
		jobFirstOption.click();
		selectUtility.selectDropDownValue(dropDownSubUnit).click();
		unitOrange.click();
		selectUtility.selectDropDownValue(dropDownInclude).click();
		includeCurrentEmp.click();
		selectUtility.selectDropDownValue(dropDownReviewStatus).click();
		statusProgress.click();
		btnSearch.click();

	}

}
