package org.testPackage;

import org.generic.BaseTest;
import org.repository.BasePage;
import org.repository.PerformancePage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(org.generic.MyListener.class)
public class TC_005_Performance_Test extends BaseTest{

	@Test
	public void runPerformance() {
		BasePage basePage = new BasePage(driver);
		basePage.getPerformanceLink().click();
		PerformancePage performancePage = new PerformancePage(driver);
		performancePage.employeeReviews();
	}
}
