package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class DtataOverRide {
	public static void main(String[] args) throws Exception {
		File file=new File("D:\\Selenium\\nykaaPT\\excel\\data1.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(fis);
		Sheet sheet=workbook.createSheet("first2");
		Row row=sheet.createRow(0);
		org.apache.poi.ss.usermodel.Cell cell=row.createCell(0);
		((org.apache.poi.ss.usermodel.Cell) cell).setCellValue("username");
		
		Sheet Sheet2=workbook.getSheet("Credentials");
		Row row2=Sheet2.getRow(0);
		org.apache.poi.ss.usermodel.Cell cell2=row2.createCell(1);
		cell2.setCellValue("password");
		workbook.getSheet("Credentials").createRow(1).createCell(2).setCellValue("g");
		FileOutputStream fos=new FileOutputStream(file);
		workbook.write(fos);
		workbook.close();
		
		
	}

}
