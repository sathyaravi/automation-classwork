package week6day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {

	public static void main(String[] args) throws IOException {
		
		try ( //1. Set the excel workbook path
			XSSFWorkbook wbook1 = new XSSFWorkbook("./Read Excel/CreateLeadExcelData.xlsx")) {
			//step 2 - Get the sheet from the book
			XSSFSheet sheet = wbook1.getSheetAt(0);
			
			//step 3 - Get into the row
			int rowNum = sheet.getLastRowNum(); //print only the last row number without header
			System.out.println("Last row number :"+rowNum); 
			
			//get the count of rows including headers
			
			int headRowNum = sheet.getPhysicalNumberOfRows();
			
			System.out.println("No of rows count including header:"+headRowNum);
			
			XSSFRow row1 = sheet.getRow(0);
			
			
			//step 4 Get into the column using row
			
			XSSFCell cell = row1.getCell(1);
			
			//to get the count of cell values
			short lastcellNum = sheet.getRow(1).getLastCellNum();
			
			System.out.println("Last cell number:"+lastcellNum);
			
			//count all the cell including header
			
			String stringCellValue = sheet.getRow(1).getCell(1).getStringCellValue();
			
			System.out.println("stringCellValue"+stringCellValue);
			
			//To read the entire value from the cell
				
			String data = cell.getStringCellValue();
			System.out.println(data);
			
			//To get the entire data from the excel sheet
			for (int i = 1; i <=rowNum ; i++) {
				for (int j = 0; j < lastcellNum ; j++) {
					
					String stringCellValue2 = sheet.getRow(i).getCell(j).getStringCellValue();	
					System.out.println(stringCellValue2);
				}
			}
		}
		
		


		
		
		
	}

}
