package DDFW;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.examples.WorkbookProperties;

public class DataDrivenFrame_Work {

	public static void main(String[] args) throws IOException
	{
		FileInputStream fis = new FileInputStream("D:\\subha.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet s = wb.getSheet("Sheet1");
		int rc = s.getLastRowNum();
		for (int i = 0; i < rc; i++) 
		{
			XSSFRow r = s.getRow(i);
			int cc = r.getLastCellNum();
			for (int j = 0; j <cc; j++) 
			{
				XSSFCell c = r.getCell(j);
				String str = c.getStringCellValue();
				System.out.println(str);
				
				
			}
			
			
		}
		
		

	}

}
