package org.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * The Class File is mainly used to interact with the File and fetch the Test
 * data needed for Automation Application
 * 
 * @author Aman
 */
public class FLib {

	/**
	 * This method accepts the key and it will fetch the value of the respective key
	 * in the given properties file
	 * 
	 * @param key [String]
	 * @return value [String]
	 */
	public static String getPropertyValue(String propPath, String key) {
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
	

}
