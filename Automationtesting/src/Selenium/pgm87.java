package Selenium;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class pgm87 {
	public static void main(String[] args)
	{
		FileInputStream fis=new FileInputStream("./Data/Tamil.xsls");
				Sheet wb=Workbook.createSheet();
		String Data=wb.getSheet("place").getRow(5).getCell(1).getStringCellValue();
		System.out.println(Data);
	}

}
