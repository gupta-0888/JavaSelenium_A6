package org.screenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CapturingScreenshotOfAWebpage {
	public static void main(String[] args) throws IOException {
		LocalDateTime ldt = LocalDateTime.now();
		String timestamp = ldt.toString().replace(':', '-');
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yamaha-motor-india.com/");

//		Step 1 :
		TakesScreenshot ts = (TakesScreenshot) driver;

//		Step 2 :
		File src = ts.getScreenshotAs(OutputType.FILE);

//		Step 3 :
//		File dest = new File("C:\\Users\\Aman\\OneDrive\\Desktop\\screenshot.png");
		File dest = new File("./Errorshots/screenshot" + timestamp + ".png");
		FileHandler.copy(src, dest);
	}

}
