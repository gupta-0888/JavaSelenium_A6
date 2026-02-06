package org.testPackage;

import org.genericLib.BaseTest;
import org.genericLib.Flib;
import org.pomRepository.BasePage;
import org.pomRepository.CellPhonesPage;
import org.pomRepository.CheckOutPage;
import org.pomRepository.ElectronicsPage;
import org.pomRepository.ShoppingCartPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(org.genericLib.MyListener.class)
public class TC_BuyAProduct_003_Test extends BaseTest {

	public static String excelPath = EXCEL_PATH_TEST;

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

		String city = Flib.getWorkbookCellValue(excelPath, "buyproductcreds", 1, 0);
		String address1 = Flib.getWorkbookCellValue(excelPath, "buyproductcreds", 1, 1);

//		String pinCode = Flib.getWorkbookCellValue(excelPath, "buyproductcreds", 1, 2);		
//		String contact = Flib.getWorkbookCellValue(excelPath, "buyproductcreds", 1, 3);

		String pinCode = Flib.getNumericCellValueMethod(excelPath, "buyproductcreds", 1, 2);
		String contact = Flib.getNumericCellValueMethod(excelPath, "buyproductcreds", 1, 3);

		CheckOutPage checkOutPage = new CheckOutPage(driver);
		checkOutPage.buyProduct(city, address1, pinCode, contact);

	}
}
