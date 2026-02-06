package org.autoamtion.modulerFramework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	public static WebDriver driver;

	@BeforeClass
	public void browserSetUp() {
		String browser = Flib.getPropertyValue("chrome");
		String url = Flib.getPropertyValue("url");
		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);

	}

	@BeforeMethod
	public void login() {
		String email = Flib.getPropertyValue("email");
		String password = Flib.getPropertyValue("password");
		BasePage basePage = new BasePage(driver);
		basePage.getLoginLink().click();
		LoginPage loginPage = new LoginPage(driver);
		loginPage.getEmailTF().sendKeys(email);
		loginPage.getPasswordTF().sendKeys(password);
		loginPage.getLoginButton().click();

	}

	@AfterMethod
	public void logout() {
		BasePage basePage = new BasePage(driver);
		basePage.getLogoutLink().click();
	}

	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}

	}

}
