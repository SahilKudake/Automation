package com.selenium.hybridframework.config;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Purpose : Configuration program to read excel sheet from file system
 * 
 * @author Sahil Kudake
 *
 */
public class ExcelConfig {
	XSSFWorkbook workbook;
	XSSFSheet sheet;

	public void configExcelsheet(String path) {
		try {
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			workbook = new XSSFWorkbook(fis);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public String getData(int sheetNumber, int row, int col) {
		sheet = workbook.getSheetAt(sheetNumber);
		String data = sheet.getRow(row).getCell(col).getStringCellValue();
		return data;
	}

	public int size(int sheetIndex) {
		int row = workbook.getSheetAt(sheetIndex).getLastRowNum();
		row++;
		return row;
	}

}
