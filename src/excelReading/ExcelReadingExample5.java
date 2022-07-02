package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingExample5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// Read Total Sheet
        File MyFile=new File("E:\\New folder\\Book2.xlsx");
		
		Sheet Mysheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
		

		// Read to sheet using static coding
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				String value = Mysheet.getRow(i).getCell(j).getStringCellValue();
			    System.out.println(value+" ");
			}
			 System.out.println();
		}
		

	}

}
