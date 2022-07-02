package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingExample4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File MyFile=new File("E:\\New folder\\Book2.xlsx");
		
		Sheet Mysheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
		
		// I want to read one column.................Static coding
		
//		for(int i=0;i<=3;i++)
//		{
//			 String value = Mysheet.getRow(i).getCell(2).getStringCellValue();
//    		 System.out.println(value);
//		}
		
		// Dynamic Coding
		
		int lastRowNum = Mysheet.getLastRowNum();	
		int totalRowCount =lastRowNum;
		System.out.println(totalRowCount);

		for(int i=0;i<=totalRowCount;i++)
		{
			 String value = Mysheet.getRow(i).getCell(3).getStringCellValue();
			 System.out.println(value);
		}
		
		
		
		
	}

}
