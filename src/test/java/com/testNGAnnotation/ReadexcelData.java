package com.testNGAnnotation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadexcelData {

	// How to read excel in your automation framework? **********
	public static void main(String[] args) throws IOException {
		// FileInputStream is java class to handle the location of file
		FileInputStream fileLocation = new FileInputStream("./TestData/ExcelData.xlsx");
		// workbook Apache pi class that handle the FileInputStream object to take
		// control of work book file
		XSSFWorkbook workbook = new XSSFWorkbook(fileLocation);
		// With help of workbook object we can call the get sheet method to take control
		// of the sheet
		XSSFSheet sheet = workbook.getSheet("testData");
		// create Iterator instance to take control all sheet values & ignore the header
		// with help of iterator instance.
		Iterator<Row> rowIteraor = sheet.iterator();
		rowIteraor.next();
		// In order to handle multiple data inside the excel sheet we have to create
		// array list object.
		ArrayList<String> list = new ArrayList<String>();
		// In order to take control all the data Increment or decrement we have to use
		// while loop to take control all the data
		while (rowIteraor.hasNext()) {
			// Inside the loop we can call the value by using get cell method or column
			// method.
			list.add(rowIteraor.next().getCell(1).getStringCellValue());
			System.out.println(list);
		}

	}

}
