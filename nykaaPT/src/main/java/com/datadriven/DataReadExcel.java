package com.datadriven;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;

public class DataReadExcel {
	public static void main(String[] args) throws Exception {
		File file=new File("D:\\Selenium\\nykaaPT\\excel\\data1.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbookFactory().create(fis);
		XSSFSheet Sheet=wb.getSheet("sheet1");
		XSSFRow row=Sheet.getRow(3);
		XSSFCell cell=row.getCell(1);
				System.out.println(cell);
				//System.out.println(row);
	}

}
