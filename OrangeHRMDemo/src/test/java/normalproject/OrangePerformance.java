package normalproject;

import java.time.Duration;

import org.generic.ActionUtils;
import org.generic.FrameworkConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangePerformance implements FrameworkConstants {
	public static String propPath = PROPERTIES_PATH_TEST;
	static WebDriver driver;
	
	public static void clickUsingJS(WebElement element) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", element);
	}
	
	public static void main(String[] args) throws InterruptedException {
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Performance")).click();
		String name = driver.findElement(By.className("oxd-userdropdown-name")).getText();
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Type')]")).sendKeys(name);
//		WebElement suggestion = wait
//				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@role='listbox'])[1]")));
//
//		Actions actions = new Actions(driver);
//		actions.moveToElement(suggestion).pause(Duration.ofSeconds(3)).click().perform();
		WebElement element = driver.findElement(By.xpath("(//div[@role='option'])[1]"));
		ActionUtils actionUtils = new ActionUtils(driver);
		actionUtils.clickUsingActions(element);



		WebElement dropDown = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//label[text()='Job Title']/../..//div[contains(@class,'oxd-select-text--active')]")));
		dropDown.click();
		driver.findElement(By.xpath("//span[text()='Automaton Tester']")).click();
		dropDown = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//label[text()='Sub Unit']/../..//div[contains(@class,'oxd-select-text--active')]")));
		dropDown.click();
		driver.findElement(By.xpath("//span[text()='OrangeHRM']")).click();
		dropDown = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//label[text()='Include']/../..//div[contains(@class,'oxd-select-text--active')]")));
		dropDown.click();
		driver.findElement(By.xpath("//span[contains(text(),'Current Employees')]")).click();
		dropDown = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//label[text()='Review Status']/../..//div[contains(@class,'oxd-select-text--active')]")));
		dropDown.click();
		driver.findElement(By.xpath("//span[contains(text(),'Progress')]")).click();
		driver.findElement(By.xpath("//button[text()=' Search ']")).click();

	}
}
