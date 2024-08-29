package com.gentech.excel.assignments;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Assignment1 {
    public static void main(String[] args) {
        writeContent();
    }

    private static void writeContent() {
        FileOutputStream fout = null;
        Workbook wb = null;
        try {
            File file = new File("E:\\Gentech\\Flowers.xlsx");
            if (file.exists() && !file.canWrite()) {
                throw new IOException("File is currently in use by another process: " + file.getAbsolutePath());
            }

            wb = new XSSFWorkbook();
            Sheet sh = wb.createSheet("Flowers");

            // List of flower names
            String[] flowers = {
                    "Rose", "Lily", "Tulip", "Daffodil", "Sunflower", "Daisy", "Orchid",
                    "Marigold", "Jasmine", "Lavender", "Peony", "Chrysanthemum", "Carnation",
                    "Hyacinth", "Magnolia", "Petunia", "Poppy", "Iris", "Violet", "Hibiscus"
            };

            // Write flower names to the first column
            for (int i = 0; i < flowers.length; i++) {
                Row row = sh.createRow(i);  // Create a new row for each flower
                Cell cell = row.createCell(0);  // Create a new cell in the first column
                cell.setCellValue(flowers[i]);  // Set the flower name in the cell
            }

            fout = new FileOutputStream(file);
            wb.write(fout);
            System.out.println("Excel file written successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fout != null) {
                    fout.close();
                }
                if (wb != null) {
                    wb.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
