package normalproject;

import java.time.Duration;

import org.generic.FrameworkConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRM implements FrameworkConstants {
	static WebDriver driver;

	public static void clickUsingJS(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	public static String propPath = PROPERTIES_PATH_TEST;

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
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		WebElement dropdown = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(@class,'oxd-select-text')])[1]")));
		dropdown.click();
		driver.findElement(By.xpath("//div[@class='oxd-select-wrapper']/..//span[text()='Admin']")).click();

		String name = driver.findElement(By.className("oxd-userdropdown-name")).getText();
		WebElement placeHolder = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
		placeHolder.sendKeys(name);

		WebElement suggestion = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@role='listbox'])[1]")));

		Actions actions = new Actions(driver);
		actions.moveToElement(suggestion).pause(Duration.ofSeconds(3)).click().perform();

		dropdown = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//label[text()='Status']/../..//div[contains(@class,'oxd-select-text')]")));
		dropdown.click();
		driver.findElement(By.xpath("//div[@class='oxd-select-wrapper']/..//span[text()='Enabled']")).click();
		driver.findElement(By.xpath("//label[text()='Username']/../..//input[contains(@class,'oxd-input')]"))
				.sendKeys("Rohit Gupta");
		driver.findElement(By.xpath("//label[text()='Password']/../..//input[contains(@class,'oxd-input')]"))
				.sendKeys("rohit123");
		driver.findElement(By.xpath("//label[text()='Confirm Password']/../..//input[contains(@class,'oxd-input')]"))
				.sendKeys("rohit123");
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
	}

}
