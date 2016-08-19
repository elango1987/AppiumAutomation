package com.selappium.excel;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileInputStream;
import java.net.URLDecoder;
import java.util.Iterator;

/**
 * Created by ELANGO on 8/9/16.
 */
public class ReadFromExcel {

    public void ReadExcel() {

        try {

            String filepath = "/Users/ELANGO/IdeaProjects/AppiumAutomation/Selappium/ExternalFiles/Testcases.xls";
            System.out.print(filepath);

            FileInputStream file = new FileInputStream(new File(filepath).getAbsolutePath());

            HSSFWorkbook workbook = new HSSFWorkbook(file);
            HSSFSheet worksheet = workbook.getSheetAt(0);

            Iterator<Row> rowIterator = worksheet.iterator();

            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();

                Iterator<Cell> cellIterator = row.cellIterator();

                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();

                    System.out.println(cell.getStringCellValue());

                }

            }
            workbook.close();
            file.close();

        } catch (Exception e) {
            System.err.println("Test cases sheet not found. Please check");
            System.exit(-1);
        }

    }
}
