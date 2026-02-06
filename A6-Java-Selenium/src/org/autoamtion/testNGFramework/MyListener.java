package org.autoamtion.testNGFramework;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyListener extends BaseTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("[Test Case " + result.getName() + " has Started ]", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("[Test Case " + result.getName() + " has successfully executed ]", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("[Test Case " + result.getName() + " has Failed ]", true);
		LocalDateTime ldt = LocalDateTime.now();
		String timestamp = ldt.toString().replace(':', '-');
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Errorshots/" + result.getName() + timestamp + ".png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("[Test Case " + result.getName() + " has skipped ]", true);;
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("[Test Case " + result.getName() + " has failed with some success percentage ]", true);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("[Test Case " + result.getName() + " has failed due to timeouts ]", true);
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("<test>" + context.getName() + " has Started ", true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("<test>" + context.getName() + " has finished ", true);
	}

}
