package org.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage {

	@FindBy(partialLinkText = "Camera, photo")
	private WebElement cameraPhotoLink;

	@FindBy(partialLinkText = "Cell phones")
	private WebElement cellPhonesLink;

	public ElectronicsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCameraPhotoLink() {
		return cameraPhotoLink;
	}

	public WebElement getCellPhonesLink() {
		return cellPhonesLink;
	}

}
