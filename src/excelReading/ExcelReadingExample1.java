package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingExample1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File MyFile=new File("E:\\New folder\\Book1.xlsx");
		
	    String Name1 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	    System.out.println(Name1);
	    
	    String Name2 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	    System.out.println(Name2);
	    
	    double Num1 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
	    System.out.println(Num1);
	    
	    double Num2 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
	    System.out.println(Num2);
	    
	   boolean Value1 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(2).getCell(0).getBooleanCellValue();
	   System.out.println(Value1);
	     
	   boolean Value2 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(2).getCell(1).getBooleanCellValue();
	   System.out.println(Value2);
	   
	}

}
