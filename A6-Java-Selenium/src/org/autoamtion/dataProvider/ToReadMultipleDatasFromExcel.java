package org.autoamtion.dataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadMultipleDatasFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./TestData/DWS.xlsx");

		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("invalidcreds");
		int rowCount = sheet.getPhysicalNumberOfRows() - 1;
		System.out.println(rowCount);
		int cellCount = sheet.getRow(1).getPhysicalNumberOfCells();
		System.out.println(cellCount);

		String[][] creds = new String[rowCount][cellCount];

		for (int row = 1; row <= rowCount; row++) {
			for (int col = 0; col < cellCount; col++) {
				creds[row - 1][col] = sheet.getRow(row).getCell(col).toString();
			}
		}

		for (String[] arr : creds) {
			for (String data : arr) {
				System.out.print(data + ", ");
			}
			System.out.println();
		}
	}
}
