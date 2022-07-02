package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingEx8 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File MyFile=new File("E:\\New folder\\Book2.xlsx");
		
		 Sheet mySheet = WorkbookFactory.create(MyFile).getSheet("Sheet3");
		 
		 int totalRowCount = mySheet.getLastRowNum();	 
		 int totalCellCount = mySheet.getRow(totalRowCount).getLastCellNum()-1;
		 
		 for(int i=0;i<=totalRowCount;i++)
		 {
			 for(int j=0;j<=totalCellCount;j++)
	     {
				 
		 Cell cell = mySheet.getRow(i).getCell(j);
		 CellType type = cell.getCellType();
		 
		 if(type==CellType.STRING)
		 {
			 System.out.print(cell.getStringCellValue()+" ||");
		 }
		 
		 else if(type==CellType.BOOLEAN)
		 {
			 System.out.print(cell.getBooleanCellValue()+" ||");
		 }
		 
		 else if(type==CellType.NUMERIC)
		 {
			 System.out.print(cell.getNumericCellValue()+" ||");
		 }
		 
		 else if(type==CellType.BLANK)
		 {
			 System.out.print("==");
		 }
		 	 
	 }
			 System.out.println();	 
			 
		 }	

	}

}
