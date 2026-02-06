package org.genericLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



/**
 * The Class File is mainly used to interact with the File and fetch the Test
 * data needed for Automation Application
 * 
 * @author Aman
 */
public class Flib {

	/**
	 * This method accepts the key and it will fetch the value of the respective key
	 * in the given properties file
	 * 
	 * @param propPath [String]
	 * @param key [String]
	 * @return value [String]
	 * 
	 */
	public static String getPropertyValue(String propPath,String key) {
		File file = new File(propPath);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String value = prop.getProperty(key);
		return value;

	}

	/**
	 * This method accepts the sheetName, rowIndex, cellIndex to fetch a cell value
	 * from the given workbook
	 * @param excelPath [String]
	 * @param sheetName [String]
	 * @param rowIndex  [int]
	 * @param cellIndex [int]
	 * @return value [String]
	 */

	public static String getWorkbookCellValue(String excelPath, String sheetName, int rowIndex, int cellIndex) {
		File file = new File(excelPath);
		FileInputStream fis = null;
		Workbook wb = null;
		try {
			fis = new FileInputStream(file);
			wb = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		}
		String value = wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).toString();
		return value;
	}
	
	/**
	 * This method accepts the sheetName, rowIndex, cellIndex to fetch a cell value from the given workbook
	 * numeric number convert into String value
	 * 
	 * @param excelPath [String]
	 * @param sheetName [String]
	 * @param rowNo [int]
	 * @param cellNo [int]
	 * @return value [String] 
	 */

	public static String getNumericCellValueMethod(String excelPath, String sheetName, int rowNo, int cellNo) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(excelPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Workbook wb = null;
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | IOException e) {
			e.printStackTrace();
		}
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		double data = cell.getNumericCellValue();
		int data1 = (int) data;

		return String.valueOf(data1);

	}
	
	/**
	 * This method generate a Random number with in range 1000 to 9999
	 * as a four digit number
	 * @return value [int]
	 */
	public static int generateRandomNumber() {
		Random random = new Random();
		return random.nextInt(1000, 9999);
	}

}
