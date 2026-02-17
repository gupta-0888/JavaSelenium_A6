package org.testPackage;

import org.generic.BaseTest;
import org.repository.BasePage;
import org.repository.PIMPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(org.generic.MyListener.class)
public class TC_002_PIM_Test extends BaseTest{
	
	@Test
	public void runPIM() throws InterruptedException {
		BasePage basePage = new BasePage(driver);
		basePage.getPimLink().click();
		PIMPage pimPage = new PIMPage(driver);
		pimPage.employeeInformation();
		
	}

}
