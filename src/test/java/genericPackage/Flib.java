
package genericPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	// Reading data from excel file
	public String readexcel(String excelpath, String sheetname, int rowcount, int cellcount)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		Row row = sheet.getRow(rowcount);
		Cell cell = row.getCell(cellcount);
		String data = cell.getStringCellValue();
		return data;
	}

	// To get last row count.
	public int rowcount(String excelpath, String sheetname) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		int last = sheet.getLastRowNum();
		return last;
	}

	// Read the data from property file
	public String readpropertydata(String propertypath, String KeyValue) throws IOException {
		FileInputStream fis = new FileInputStream(propertypath); // provide the path of property file
		Properties prop = new Properties(); // to read data
		prop.load(fis);
		String data = prop.getProperty(KeyValue);
		return data;
	}
}
