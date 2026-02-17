package org.repository;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class BasePage {

	SoftAssert softAssert;
	WebDriverWait wait;
	WebDriver driver;
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		softAssert = new SoftAssert();
	}
	
	@FindBy(className = "oxd-userdropdown-name")
	 private WebElement userName;

	public WebElement getUserName() {
		return userName;
	}

	@FindBy(linkText = "Admin")
	private WebElement adminLink;

	@FindBy(linkText = "PIM")
	private WebElement pimLink;

	@FindBy(linkText = "Leave")
	private WebElement leaveLink;

	@FindBy(linkText = "Time")
	private WebElement timeLink;

	@FindBy(linkText = "Recruitment")
	private WebElement recruitmentLink;

	@FindBy(linkText = "My Info")
	private WebElement myInfoLink;

	@FindBy(linkText = "Performance")
	private WebElement performanceLink;

	@FindBy(linkText = "Dashboard")
	private WebElement dashboardLink;

	@FindBy(linkText = "Directory")
	private WebElement directoryLink;

	@FindBy(linkText = "Maintenance")
	private WebElement maintenanceLink;

	@FindBy(linkText = "Claim")
	private WebElement claimLink;

	@FindBy(linkText = "Buzz")
	private WebElement buzzLink;

	public WebElement getAdminLink() {
		return adminLink;
	}

	public WebElement getPimLink() {
		return pimLink;
	}

	public WebElement getLeaveLink() {
		return leaveLink;
	}

	public WebElement getTimeLink() {
		return timeLink;
	}

	public WebElement getRecruitmentLink() {
		return recruitmentLink;
	}

	public WebElement getMyInfoLink() {
		return myInfoLink;
	}

	public WebElement getPerformanceLink() {
		return performanceLink;
	}

	public WebElement getDashboardLink() {
		return dashboardLink;
	}

	public WebElement getDirectoryLink() {
		return directoryLink;
	}

	public WebElement getMaintenanceLink() {
		return maintenanceLink;
	}

	public WebElement getClaimLink() {
		return claimLink;
	}

	public WebElement getBuzzLink() {
		return buzzLink;
	}

	
	

}
