package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		    System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
		 	
			WebDriver driver=new ChromeDriver();
			
		    driver.get("https://demo.guru99.com/test/drag_drop.html");
			
			driver.manage().window().maximize();
			
			Thread.sleep(1000);
			
			
			//Move to element using mouse actions
			
			Actions act =new Actions(driver);
			
	        WebElement MyElement1 = driver.findElement(By.xpath("//a[text()=' LOAN ']"));
			
			act.moveToElement(MyElement1).perform();

		
			//Click using Mouse Action
			
			WebElement testElement = driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[2]"));
			
			//1st Way........
	    	act.moveToElement(testElement).perform();
			
			act.click().perform();
			
			//2nd Way................
		//	act.moveToElement(testElement).click().build().perform();
			
            
			//3rd Way............
	  //    act.click(testElement).perform();
			
	
			//Right click----context click
			
			act.moveToElement(testElement).contextClick().click().build().perform();
			
			act.contextClick(testElement).perform();
		
	
	}
	

}
