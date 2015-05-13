/*
 * @author jakenherman
 */

import java.io.FileInputStream;
import java.io.File;
import java.util.Iterator;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
// Get all type of excel cell value as String using POI
public class RetestChecker {
 
    public static void main(String[] args) throws Exception {

        FileInputStream file = new FileInputStream(new File("test_sheet.xlsx"));
        //Get the workbook instance for XLS file 
        XSSFWorkbook workbook = new XSSFWorkbook(file);
 
        //Get first sheet from the workbook
        XSSFSheet sheet = workbook.getSheetAt(0);
        
        Row row = sheet.getRow(0);
        Cell x = row.getCell(3);
        int i = 2;
        
        System.out.println(x);
    }
  
}