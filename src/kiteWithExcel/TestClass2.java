package kiteWithExcel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		    System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		    
			WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://kite.zerodha.com/");
			
	        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	        
            File MyFile=new File("E:\\\\New folder\\\\Book3.xlsx");
	   
			Sheet mySheet = WorkbookFactory.create(MyFile).getSheet("Sheet2");
			
			int TotalRowCount = mySheet.getLastRowNum();
			
			for(int i=1;i<=TotalRowCount;i++)
			{
				String userName = mySheet.getRow(i).getCell(0).getStringCellValue();
			    String password = mySheet.getRow(i).getCell(1).getStringCellValue();
			    String Kitepin1 = mySheet.getRow(i).getCell(2).getStringCellValue();
			    
			    KiteLoginPage login=new KiteLoginPage(driver);
			    login.sendUserName(userName);
			    login.sendPassword(password);
			    login.clickOnLoginButton();
			    
			    
			    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
			    KitePinPage pin=new KitePinPage(driver);
			    pin.sendPin(Kitepin1);
			    pin.clickOnContinueButton();
			    
			    
			    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000)); 
			    KiteHomePage home=new KiteHomePage(driver);
		        home.validateUserID(userName);
		        home.clickOnLogOutButton();
		        Thread.sleep(4000); 
		        
		        WebElement Changeuser = driver.findElement(By.xpath("//a[@class='remove text-xxsmall']"));
		        Changeuser.click();
			}
			
			

	}

}
