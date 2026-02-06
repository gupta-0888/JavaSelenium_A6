package org.autoamtion.dataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 {

	@DataProvider(name = "invalidcreds")
	public String[][] invalidLoginCreds() throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./TestData/DWS.xlsx");

		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("invalidcreds");
		int rowCount = sheet.getPhysicalNumberOfRows() - 1;
		int cellCount = sheet.getRow(1).getPhysicalNumberOfCells();
		String[][] creds = new String[rowCount][cellCount];
		for (int row = 1; row <= rowCount; row++) {
			for (int col = 0; col < cellCount; col++) {
				creds[row - 1][col] = sheet.getRow(row).getCell(col).toString();
			}
		}
		return creds;
	}

	@Test(dataProvider = "invalidcreds", dataProviderClass = org.autoamtion.dataProvider.DataProvider2.class)
	public void invalidLogin(String email, String password) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(500);
		driver.findElement(By.id("Email")).sendKeys(email);
		Thread.sleep(500);
		driver.findElement(By.id("Password")).sendKeys(password);
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(500);
		driver.quit();
	}

}
