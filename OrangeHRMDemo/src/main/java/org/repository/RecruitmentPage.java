package org.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RecruitmentPage extends BasePage{

	String name = getUserName().getText().toString();
	
	
	@FindBy(xpath = "//label[text()='Job Title']/../..//div[contains(@class,'oxd-select-text--active')]")
	private WebElement dropDownJobTitle;
	
	@FindBy(xpath = "(//div[@role='option'])[2]")
	private WebElement jobFirstOption;
	
	@FindBy(xpath = "//label[text()='Vacancy']/../..//div[contains(@class,'oxd-select-text')]")
	private WebElement dropDownVacancy;
	
	@FindBy(xpath = "//span[text()='Senior QA Lead']")
	private WebElement vacancyQA;
	
	@FindBy(xpath = "//label[text()='Hiring Manager']/../..//div[contains(@class,'oxd-select-text')]")
	private WebElement dropDownHiringManager;
	
//	@FindBy(xpath = "//span[text()='']")
//	private WebElement managerUser;
	
	@FindBy(xpath = "//label[text()='Status']/../..//div[contains(@class,'oxd-select-text')]")
	private WebElement dropDownStatus;
	
	@FindBy(xpath = "//span[text()='Shortlisted']")
	private WebElement statusShortlisted;
	
	@FindBy(xpath = "//input[contains(@placeholder,'Enter')]")
	private WebElement enterKeywords;
	
	@FindBy(xpath = "//input[@placeholder='From']")
	private WebElement fromDate;
	
	@FindBy(xpath = "//input[@placeholder='To']")
	private WebElement toDate;
	
	@FindBy(xpath = "//label[text()='Method of Application']/../..//div[contains(@class,'oxd-select-text')]")
	private WebElement dropDownMethodApplication;
	
	@FindBy(xpath = "//span[text()='Online']")
	private WebElement methodOnline;
	
	@FindBy(xpath = "//button[text()=' Search ']")
	private WebElement btnSearch;
	
	
	
	
	
	public RecruitmentPage(WebDriver driver) {
		super(driver);
	}
	
	public void searchCandidate() {
		
		dropDownJobTitle.click();
		jobFirstOption.click();
		dropDownVacancy.click();
		vacancyQA.click();
		dropDownHiringManager.click();
//		managerUser.click();
		dropDownStatus.click();
		statusShortlisted.click();
		String from = "2026-03-02";
		String to = "2026-18-02";
		fromDate.sendKeys(from);
		toDate.sendKeys(to);
		dropDownMethodApplication.click();
		methodOnline.click();
		btnSearch.click();
		
		
	}

}
