package org.automation.popups;

import java.time.LocalDateTime;

public class UnderstandingDynamicXpath {
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		int date = ldt.getDayOfMonth();
		String monthTemp = ldt.getMonth().toString();

		String month = monthTemp.charAt(0) + monthTemp.substring(1).toLowerCase();
		System.out.println("//p[text()='" + month + "']/../../..//span[text()='" + date + "']");
	}

}
