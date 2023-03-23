package com.dsalgo.utilities;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {

	public static int totalRow;
	Workbook workbook;
	public List<Map<String, String>> getData(String excelFilePath, String sheetName)
			throws InvalidFormatException, IOException {

//		Workbook workbook = WorkbookFactory.create(new File(excelFilePath));
		workbook = WorkbookFactory.create(new File(excelFilePath));
		System.out.println("Excel File Path" +excelFilePath );
		Sheet sheet = workbook.getSheet(sheetName);
//		workbook.close();
		return readSheet(sheet);
	}

	private List<Map<String, String>> readSheet(Sheet sheet) throws IOException {

		Row row;
		Cell cell;

		totalRow = sheet.getLastRowNum();
		System.out.println("Total Row:---"+totalRow);
		List<Map<String, String>> excelRows = new ArrayList<Map<String, String>>();

		for (int currentRow = 1; currentRow <= totalRow; currentRow++) {

			row = sheet.getRow(currentRow);
			System.out.println("Current Row:---"+row);
			int totalColumn = row.getLastCellNum();
			System.out.println("totalColumn:---"+totalColumn);
			LinkedHashMap<String, String> columnMapdata = new LinkedHashMap<String, String>();

			for (int currentColumn = 0; currentColumn < totalColumn; currentColumn++) {

				cell = row.getCell(currentColumn);

				String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).getCell(currentColumn)
						.getStringCellValue();

				columnMapdata.put(columnHeaderName, cell.getStringCellValue());
			}

			excelRows.add(columnMapdata);
		}
		workbook.close();
		return excelRows;
	}

	public int countRow() {

		return totalRow;
	}

}
