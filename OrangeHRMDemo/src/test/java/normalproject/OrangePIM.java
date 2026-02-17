package normalproject;

import java.time.Duration;

import org.generic.FrameworkConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangePIM implements FrameworkConstants{
	public static String propPath = PROPERTIES_PATH_TEST;

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(2000);
		
		WebElement userName = driver.findElement(By.className("oxd-userdropdown-name"));
		String empName = userName.getText();
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(empName);
		driver.findElement(By.xpath("//label[text()='Employee Id']/../..//input[contains(@class,'oxd-input--active')]")).sendKeys("85296");
		WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Employment Status']/../..//div[contains(@class,'oxd-select-text')]")));
		dropdown.click();
		driver.findElement(By.xpath("//span[text()='Full-Time Contract']")).click();
		dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Include']/../..//div[contains(@class,'oxd-select-text')]")));
		dropdown.click();
		driver.findElement(By.xpath("//div[text()='Current Employees Only']")).click();
		driver.findElement(By.xpath("//label[text()='Supervisor Name']/../..//input[@placeholder='Type for hints...']")).sendKeys("");
		dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Job Title']/../..//div[contains(@class,'oxd-select-text--active')]")));
		dropdown.click();
		driver.findElement(By.xpath("//span[text()='Automaton Tester']")).click();
		dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Sub Unit']/../..//div[contains(@class,'oxd-select-text--active')]")));
		dropdown.click();
		driver.findElement(By.xpath("//span[text()='OrangeHRM']")).click();
		driver.findElement(By.xpath("//button[text()=' Search ']")).click();
		
	}
}
