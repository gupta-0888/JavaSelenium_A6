package org.testPackage;

import org.genericLib.BaseTest;
import org.pomRepository.BasePage;
import org.pomRepository.CellPhonesPage;
import org.pomRepository.ElectronicsPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(org.genericLib.MyListener.class)
public class TC_AddToCart_001_Test extends BaseTest {

	@Test
	public void addToCart() {
		BasePage basePage = new BasePage(driver);
		basePage.getElectronicsLink().click();

		ElectronicsPage electronicsPage = new ElectronicsPage(driver);
		electronicsPage.getCellPhonesLink().click();

		CellPhonesPage cellPhonesPage = new CellPhonesPage(driver);
		cellPhonesPage.getSmartPhoneAddToCartBtn().click();

		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(cellPhonesPage.getProductAdderdToCartMsg().isDisplayed(), true,
				"Prodcut is not Added to cart !!");
		
		softAssert.assertAll();
	}

}
