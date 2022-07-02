package kiteWithExcel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		    System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		    
			WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://kite.zerodha.com/");
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	        
	        File MyFile=new File("E:\\\\New folder\\\\Book3.xlsx");
	     
	        Sheet mySheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
	        
		    String userName = mySheet.getRow(0).getCell(0).getStringCellValue();
		    String password = mySheet.getRow(0).getCell(1).getStringCellValue();
		    String Kitepin = mySheet.getRow(0).getCell(2).getStringCellValue();
		    
		    KiteLoginPage login=new KiteLoginPage(driver);
		    login.sendUserName(mySheet.getRow(0).getCell(0).getStringCellValue());
		    login.sendPassword(password);
		    login.clickOnLoginButton();
		    
		    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		    
		    KitePinPage pin=new KitePinPage(driver);
		    pin.sendPin(Kitepin);
		    pin.clickOnContinueButton();
		    
		    
		    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		    
		    KiteHomePage home=new KiteHomePage(driver);
	        home.validateUserID(userName);
	        home.clickOnLogOutButton();
	        Thread.sleep(4000);
	        
	      //  driver.close();
	        
	        
	        
	        

	}

}
