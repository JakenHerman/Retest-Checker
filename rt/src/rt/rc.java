package rt;

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
public class rc {

	public static void main(String[] args) throws Exception {
    
		FileInputStream file = new FileInputStream(new File("src/rt/test_sheet.xlsx"));
        //Get the workbook instance for XLS file 
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        //Get first sheet from the workbook
        XSSFSheet sheet = workbook.getSheetAt(0);
        Row row = sheet.getRow(0);
        Cell x = row.getCell(3);
        System.out.println(x);
        
        workbook.close();
    }
	
	public void retestCheck(int i, int HSPercentile){
		String x = Integer.toString(i);
		/*
		 * be sure to 
		 * add a check to make sure
		 * if cell value isn't null
		 */
		
		if(x.length() >= 3){
			//SAT Handling
			int score = Integer.parseInt(x);
			
			if(score >= 960 && HSPercentile >= 50 && HSPercentile <= 74){
				//Accept
			}
			
			else if(score >= 1060 && HSPercentile >= 25 && HSPercentile <= 49){
				//Accept
			}
			
			else if(score >= 1100 && HSPercentile >= 0 && HSPercentile <= 24){
				//Mark as "close" to requirements
			}
			
			else if(HSPercentile >= 75){
				//Accept
			}
			
			else{
				//throw error or deny. Probably should check close handling first
			}
		}
		
		else if(x.length() <= 2){
			//ACT Handling
			int score = Integer.parseInt(x);
			
			if(score >= 20 && HSPercentile >= 50 && HSPercentile <=74){
				//Accept
			}
			
			else if(score >= 23 && HSPercentile >= 25 && HSPercentile <= 49){
				//Accept
			}
			
			else if(score >= 25 && HSPercentile >= 0 && HSPercentile <=24){
				//Mark as "close" to requirements
			}
			
			else if(HSPercentile >= 75){
				//Accept
			}
			
			else{
				//throw error or deny. Probably should check close handling first
			}
		}
		
		else{
			//do something 
		}
	}
	
}
	
	
