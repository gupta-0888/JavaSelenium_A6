package org.automation.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PassingDataInOrangeHRM {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		WebElement usernameTB = driver.findElement(By.name("username"));
		WebElement passwordTB = driver.findElement(By.name("password"));

		Actions actions = new Actions(driver);
//		actions.moveToElement(usernameTB).click().sendKeys("admin", Keys.TAB, "admin123", Keys.ENTER).perform();
		actions.sendKeys(usernameTB,"Admin", Keys.TAB).sendKeys("admin123").keyDown(Keys.ENTER).perform();

	}

}
