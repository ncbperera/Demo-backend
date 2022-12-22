package com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class T1 {

	public static void main(String[] args) throws IOException {
		String file = "C://Charitha-Drive//WorkSpaces//Demo//cities1k2.xlsx";
		FileInputStream inputStream = new FileInputStream(file);
		
		Workbook workbook = new XSSFWorkbook(inputStream);
		Sheet firstSheet = workbook.getSheetAt(0);
        Iterator<Row> rowIterator = firstSheet.iterator();
        
		/*
		 * Scanner sc = new Scanner(new File(file)); sc.useDelimiter("\n"); while
		 * (sc.hasNext()) { String s = sc.next(); String[] row = s.split(",");
		 * //idToNewIdMapping.put(row[1], row[2]); System.out.println("=name=="+row[1]);
		 * }
		 */

        rowIterator.next(); // skip the header row
        
        while (rowIterator.hasNext()) {
            Row nextRow = rowIterator.next();
            Iterator<Cell> cellIterator = nextRow.cellIterator();

            while (cellIterator.hasNext()) {
                Cell nextCell = cellIterator.next();

                int columnIndex = nextCell.getColumnIndex();

                switch (columnIndex) {
                case 0:
                    int id = (int) nextCell.getNumericCellValue();
                    System.out.println("=id=="+id);
                    break;
                case 1:
                	String name = nextCell.getStringCellValue();
                    System.out.println("=name=="+name);
                case 2:
                	String path = nextCell.getStringCellValue();
                    System.out.println("=path=="+path);
                }
            }
        }

        workbook.close();
//
	}

}
