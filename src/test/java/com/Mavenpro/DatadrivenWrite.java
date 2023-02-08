package com.Mavenpro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DatadrivenWrite {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\HP\\eclipse-workspace\\Mavenpro\\DATA.xlsx");
		FileInputStream fl = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fl);
		Sheet createSheet = w.createSheet("Data");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("Mowni");
		w.getSheet("Data").getRow(0).createCell(1).setCellValue(123);
		w.getSheet("Data").createRow(1).createCell(0).setCellValue("Preetha");
		w.getSheet("Data").getRow(1).createCell(1).setCellValue(456);
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
		w.close();
		
	}

}
