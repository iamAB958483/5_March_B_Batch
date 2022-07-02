package kiteAppUtility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Utility 
{
	public static String readDataFormExcel(int row,int cell) throws EncryptedDocumentException, IOException
	{
		    File MyFile=new File("E:\\\\New folder\\\\Book3.xlsx");
		     
	        Sheet mySheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
	        
	        
	        String myValue=mySheet.getRow(row).getCell(cell).getStringCellValue();
	        
	        return myValue;
	}
	
	public static void takeScreenshot(WebDriver driver) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random=RandomString.make(2);
        File destination=new File("D:\\Screenshot\\Abhijit.png"+random+".png");	
 		FileHandler.copy(source, destination);
	}

}
