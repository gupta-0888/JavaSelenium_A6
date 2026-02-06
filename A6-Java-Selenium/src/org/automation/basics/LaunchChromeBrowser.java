package org.automation.basics;

import java.util.Random;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
//		WebDriver driver;
//		Scanner sc = new Scanner(System.in);
//		String browserName = sc.next();
//		if(browserName.equalsIgnoreCase("chrome")) {
//			driver = new ChromeDriver();
//		}else if(browserName.equalsIgnoreCase("edge")) {
//			driver = new EdgeDriver();
//		}

		Random random = new Random();
		int number = 1000 + random.nextInt(9000);
		System.out.println(number);
	}

}
