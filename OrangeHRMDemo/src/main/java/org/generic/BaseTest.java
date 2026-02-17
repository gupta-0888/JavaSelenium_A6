package org.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.repository.LoginPage;
import org.repository.LogoutPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements FrameworkConstants {

	protected static WebDriver driver;
	public static String propPath = PROPERTIES_PATH_MAIN;
	

	@BeforeClass
	public void browserSetUp() {
		String browser = FLib.getPropertyValue(propPath, "browser");
		String url = FLib.getPropertyValue(propPath, "url");
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		} else {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@BeforeMethod
	public void login() {
		String username = FLib.getPropertyValue(propPath, "user");
		String password = FLib.getPropertyValue(propPath, "pass");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.getUsernameTF().sendKeys(username);
		loginPage.getPasswordTF().sendKeys(password);
		loginPage.getLoginBtn().click();

	}

	@AfterMethod
	public void logout() {
		LogoutPage logoutPage = new LogoutPage(driver);
		logoutPage.getUserDropDown().click();
		logoutPage.getLogout().click();

	}

	@AfterClass
	public void tearDown() {
		if (driver != null)
			driver.quit();
	}

}
