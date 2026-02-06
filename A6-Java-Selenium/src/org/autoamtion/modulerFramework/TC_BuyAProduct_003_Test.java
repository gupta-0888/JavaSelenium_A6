package org.autoamtion.modulerFramework;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_BuyAProduct_003_Test extends BaseTest {

	@Test
	public void buyProduct() {
		BasePage bp = new BasePage(driver);
		bp.getElectronicsLink().click();

		ElectronicsPage electronicsPage = new ElectronicsPage(driver);
		electronicsPage.getCellPhonesLink().click();

		CellPhonesPage cellPhonesPage = new CellPhonesPage(driver);
		cellPhonesPage.getSmartPhoneAddToCartBtn().click();

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(cellPhonesPage.getProductAdderdToCartMsg().isDisplayed(), true,
				"Product is not added to cart!!");

		bp.getShoppingCartLink().click();

		ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
		shoppingCartPage.getSmartPhoneCartCheckItem().click();
		shoppingCartPage.getTermsOfServiceCheckBox().click();
		shoppingCartPage.getCheckOutBtn().click();

		String city = Flib.getWorkbookCellValue("buyproductcreds", 1, 0);
		String address1 = Flib.getWorkbookCellValue("buyproductcreds", 1, 1);
		
//		String pinCode = Flib.getWorkbookCellValue("buyproductcreds", 1, 2);		
//		String contact = Flib.getWorkbookCellValue("buyproductcreds", 1, 3);
		
		String pinCode = Flib.getNumericCellValueMethod("buyproductcreds", 1, 2);
		String contact = Flib.getNumericCellValueMethod("buyproductcreds", 1, 3);
		
		CheckOutPage checkOutPage = new CheckOutPage(driver);
		checkOutPage.buyProduct(city, address1, pinCode, contact);

	}
}
