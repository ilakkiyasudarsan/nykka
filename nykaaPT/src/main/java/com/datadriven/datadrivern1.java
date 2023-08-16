package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadrivern1 {
	public static void main(String[] args) throws Exception {
		File file=new File("D:\\Selenium\\nykaaPT\\excel\\data1.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook book=new XSSFWorkbook(fis);
		XSSFSheet sheet=book.createSheet("Colordata");
		XSSFRow row=sheet.createRow(0);
		book.createCellStyle();
		CellStyle.setFillBackgroundColor(IndexedColors.BLUE.getIndex(0));
		
		cellStyle.setFillPattern(FillPatternType.DIAMONDS);
		
	}

}
