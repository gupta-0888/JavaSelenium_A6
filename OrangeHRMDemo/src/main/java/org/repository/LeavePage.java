package org.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeavePage extends BasePage {

	@FindBy(xpath = "//label[text()='From Date']/../..//input[@placeholder='yyyy-dd-mm']")
	private WebElement fromDate;

	@FindBy(xpath = "//label[text()='To Date']/../..//input[@placeholder='yyyy-dd-mm']")
	private WebElement toDate;

	@FindBy(xpath = "//label[text()='Leave Type']/../..//div[contains(@class,'oxd-select-text--active')]")
	private WebElement dropDownLeaveType;

	@FindBy(xpath = "//span[contains(text(),'CAN - Matternity')]")
	private WebElement leaveTypeMatternity;

	@FindBy(xpath = "//input[contains(@placeholder,'Type for hints...')]")
	private WebElement placeHolderEmpName;

	@FindBy(xpath = "//label[text()='Sub Unit']/../..//div[contains(@class,'oxd-select-text')]")
	private WebElement dropDownSubUnit;

	@FindBy(xpath = "//span[contains(text(),'Quality')]")
	private WebElement subUnitQualityAssurance;

	@FindBy(xpath = "//button[text()=' Search ']")
	private WebElement searchBtn;

	public LeavePage(WebDriver driver) {
		super(driver);
	}

	public void leaveList() {
		String fDate = "2026-28-02";
		String tDate = "2026-20-03";
		fromDate.click();
		fromDate.clear();
		fromDate.sendKeys(fDate);
		toDate.click();
		toDate.clear();
		toDate.sendKeys(tDate);
		dropDownLeaveType.click();
		leaveTypeMatternity.click();
		placeHolderEmpName.sendKeys(getUserName().getText());
		dropDownSubUnit.click();
		subUnitQualityAssurance.click();
		searchBtn.click();
	}
}
