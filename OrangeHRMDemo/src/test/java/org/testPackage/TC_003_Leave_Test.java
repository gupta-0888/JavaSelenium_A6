package org.testPackage;

import org.generic.BaseTest;
import org.repository.BasePage;
import org.repository.LeavePage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(org.generic.MyListener.class)
public class TC_003_Leave_Test extends BaseTest{
	
	@Test
	public void runLeave() {
		BasePage basePage = new BasePage(driver);
		basePage.getLeaveLink().click();
		LeavePage leavePage = new LeavePage(driver);
		leavePage.leaveList();
		
	}

}
