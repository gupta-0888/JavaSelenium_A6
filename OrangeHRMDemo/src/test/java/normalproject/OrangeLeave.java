package normalproject;

import java.time.Duration;

import org.generic.FrameworkConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeLeave implements FrameworkConstants{
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
		String empname = userName.getText();
		driver.findElement(By.linkText("Leave")).click();
		String startDate = "2026-28-02";
		String endDate = "2026-20-03";
		WebElement fromDate =  driver.findElement(By.xpath("//label[text()='From Date']/../..//input[@placeholder='yyyy-dd-mm']"));
		fromDate.click();
		fromDate.clear();
		fromDate.sendKeys(startDate);
		WebElement toDate =  driver.findElement(By.xpath("//label[text()='To Date']/../..//input[@placeholder='yyyy-dd-mm']"));
		toDate.click();
		toDate.clear();
		toDate.sendKeys(endDate);
		WebElement dropDown =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Leave Type']/../..//div[contains(@class,'oxd-select-text--active')]")));
		dropDown.click();
		driver.findElement(By.xpath("//span[contains(text(),'CAN - Matternity')]")).click();
		WebElement empName =  driver.findElement(By.xpath("//input[contains(@placeholder,'Type for hints...')]"));
		empName.sendKeys(empname);
		dropDown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Sub Unit']/../..//div[contains(@class,'oxd-select-text')]")));
		dropDown.click();
		driver.findElement(By.xpath("//span[contains(text(),'Quality')]")).click();
		driver.findElement(By.xpath("//button[text()=' Search ']")).click();
		
		
		
	}

}
