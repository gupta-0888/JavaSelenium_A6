package org.autoamtion.modulerFramework;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

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
