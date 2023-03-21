package com.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven {
	public static void main(String[] args) throws IOException {

		File a = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Data\\excel\\Book1.xlsx");
		FileInputStream b = new FileInputStream(a);
		Workbook w = new XSSFWorkbook(b);
		Sheet sheetat = w.getSheetAt(0);
		Row r = sheetat.getRow(1);
		Cell ce = r.getCell(1);
		CellType data = ce.getCellType();

		if (data.equals(CellType.NUMERIC)) {
			int numericCellValue = (int) ce.getNumericCellValue();
			System.out.println(numericCellValue);
		}

		else if (data.equals(CellType.STRING)) {
			String stringCellValue = ce.getStringCellValue();
			System.out.println(stringCellValue);

		}
	}
}
