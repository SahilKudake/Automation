package com.selenium.datadriven.config;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Purpose : Configuration file to read excel file from file system
 * 
 * @author Sahil Kudake
 *
 */
public class ExcelConfig {

	XSSFWorkbook workbook;
	XSSFSheet sheet;

	public void configurExcelSheet(String excelpath) {
		try {
			File file = new File(excelpath);
			FileInputStream fis = new FileInputStream(file);
			workbook = new XSSFWorkbook(fis);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public String getData(int sheetNumber, int row, int column) {
		sheet = workbook.getSheetAt(sheetNumber);
		String data = sheet.getRow(row).getCell(column).getStringCellValue();
		return data;
	}

	public int size(int sheetIndex) {
		int row = workbook.getSheetAt(sheetIndex).getLastRowNum();
		row++;
		return row;
	}
}
