package org.testPackage;

import org.generic.BaseTest;
import org.repository.AdminPage;
import org.repository.BasePage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(org.generic.MyListener.class)
public class TC_001_Admin_Test extends BaseTest {

	public static String propPath = PROPERTIES_PATH_TEST;
//	String sheetName = "Add User";

	@Test
	public void runAdmin() {
		BasePage basePage = new BasePage(driver);
		basePage.getAdminLink().click();
		AdminPage adminPage = new AdminPage(driver);
		adminPage.clickAddButton();
		adminPage.addUser();
		
		
	}

}
