package org.autoamtion.modulerFramework;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_RemoveProductFromCart_002_Test extends BaseTest {

	@Test
	public void removeProductFromCart() {
		BasePage basePage = new BasePage(driver);
		basePage.getElectronicsLink().click();

		ElectronicsPage electronicsPage = new ElectronicsPage(driver);
		electronicsPage.getCellPhonesLink().click();

		CellPhonesPage cellPhonesPage = new CellPhonesPage(driver);
		cellPhonesPage.getSmartPhoneAddToCartBtn().click();

		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(cellPhonesPage.getProductAdderdToCartMsg().isDisplayed(), true,
				"Prodcut is not Added to cart !!");

		basePage.getShoppingCartLink().click();

		ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
		shoppingCartPage.removeSmartPhoneMethod();

		try {
			if (shoppingCartPage.getSmartPhoneCartCheckItem().isDisplayed()) {
				Reporter.log("Product is not removed fro cart", true);
			}
		} catch (Exception e) {
			Reporter.log("Product is removed from cart !!");
		}

		softAssert.assertAll();
	}

}
