package normalproject;

import java.time.Duration;

import org.generic.FrameworkConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeRecruitment implements FrameworkConstants {
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
		
		driver.findElement(By.linkText("Recruitment")).click();
		WebElement dropDown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Job Title']/../..//div[contains(@class,'oxd-select-text--active')]")));
		dropDown.click();
		driver.findElement(By.xpath("//span[text()='Automaton Tester']")).click();
		dropDown =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Vacancy']/../..//div[contains(@class,'oxd-select-text')]")));
		dropDown.click();
		driver.findElement(By.xpath("//span[text()='Senior QA Lead']")).click();
		dropDown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Hiring Manager']/../..//div[contains(@class,'oxd-select-text')]")));
		dropDown.click();//span[text()='Rahul Patil']
		String name = driver.findElement(By.className("oxd-userdropdown-name")).getText();
		driver.findElement(By.xpath("//span[text()='"+name+"']")).click();
		dropDown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Status']/../..//div[contains(@class,'oxd-select-text')]")));
		dropDown.click();
		driver.findElement(By.xpath("//span[text()='Shortlisted']")).click();
//		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
		driver.findElement(By.xpath("//input[contains(@placeholder,'Enter')]")).sendKeys("Java, Selenium");
		String fromDate = "2026-03-02";
		String toDate = "2026-18-02";
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(fromDate);
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(toDate);
		dropDown =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Method of Application']/../..//div[contains(@class,'oxd-select-text')]")));
		dropDown.click();
		driver.findElement(By.xpath("//span[text()='Online']")).click();
		driver.findElement(By.xpath("//button[text()=' Search ']")).click();
		

	}

}
