package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingExample3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File MyFile=new File("E:\\New folder\\Book2.xlsx");
		
		Sheet Mysheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
		
		//Reading whole Row
		
//		for(int i=0;i<=3;i++)    //Static Coding
//		{
//			  String value = Mysheet.getRow(0).getCell(i).getStringCellValue();
//			  System.out.println(value);
//		}

	
		int lastRowNum = Mysheet.getLastRowNum();	
		int totalRowCount =lastRowNum;

		int lastCellNum = Mysheet.getRow(0).getLastCellNum();
		int totalCellCount = lastCellNum-1;
	
		System.out.println(totalRowCount);
		System.out.println(totalCellCount);
		
		for(int i=0;i<=totalCellCount;i++)    //Dynamic coding
		{
			 String value = Mysheet.getRow(0).getCell(i).getStringCellValue();
			 System.out.println(value);
		}
		
	}

}
