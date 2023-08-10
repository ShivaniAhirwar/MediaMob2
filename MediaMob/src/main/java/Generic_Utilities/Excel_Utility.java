package Generic_Utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility 
{
	 public String getDataFromExcel(String sheet,int  rowNum, int column) throws Throwable
	    {
	    	FileInputStream fis=new FileInputStream("./data/MediaMob.xlsx");
	    	Workbook wb=  WorkbookFactory.create(fis);
	    	Sheet sh = wb.getSheet(sheet);
		 

	  
	    	Row row = sh.getRow(rowNum);
			Cell cell = row.getCell(column);
			String data = cell.getStringCellValue();
			return data;
	    }
		
			
}
