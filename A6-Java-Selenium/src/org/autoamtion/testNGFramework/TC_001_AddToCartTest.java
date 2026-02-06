package org.autoamtion.testNGFramework;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(org.autoamtion.testNGFramework.MyListener.class)
public class TC_001_AddToCartTest extends BaseTest{
	
	@Test
	public void addToCart() {
		driver.findElement(By.partialLinkText("ELECTRONICS")).click();
		driver.findElement(By.partialLinkText("Cell phones")).click();
		driver.findElement(By.xpath("//a[text()='Smartphone']/..//input[@value='Add to cart']")).click();
		
		
	}

}
