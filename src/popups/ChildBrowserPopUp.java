package popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	

	public static void main(String[] args) throws InterruptedException {
		
		    System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
	        
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://skpatro.github.io/demo/links/");
			
	        driver.manage().window().maximize();
			
			Thread.sleep(1000);
			
			driver.findElement(By.name("NewWindow")).click();
			
			Thread.sleep(1000);
			
			String idOfMainPage = driver.getWindowHandle();
			
			System.out.println("Main page id"+idOfMainPage);
			
			//All ids are recevied in set 
			Set<String> alllds=driver.getWindowHandles();
			
			//set need to convert AraayList
			ArrayList<String> ar=new ArrayList<>(alllds);
			
			for(int i=0;i<=ar.size()-1;i++)
			{
				System.out.println(ar.get(i));
			}
			
			String MainPageId = ar.get(0);
			String childPageId = ar.get(1);
			
			//To switch to child page
			
			driver.switchTo().window(childPageId);  //here selenium focus switched to child page
			
			Thread.sleep(1000);
			
			driver.manage().window().maximize();
				
		    Thread.sleep(1000);
		    
		    driver.findElement(By.id("the7-search")).sendKeys("Selenium");
		    
		    driver.close();
		    
		    //driver.quit();
		    
            Thread.sleep(1000);
            
            driver.switchTo().window(MainPageId);  //switching selenium focus from child page to main page
            
            //driver.switchTo().window(ar.get(0));
            
            // driver.findElement(By.name("New Tab")).click();	
			
			
	}

}
