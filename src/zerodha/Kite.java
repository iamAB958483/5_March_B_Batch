package zerodha;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite {

	public static void main(String[] args) throws InterruptedException {
		
		    System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
		    
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://kite.zerodha.com/");
			
	        driver.manage().window().maximize();
			
			Thread.sleep(1000);
			
			WebElement UserName = driver.findElement(By.id("userid"));
			WebElement Password = driver.findElement(By.id("password"));
			WebElement LoginButton = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
			
			UserName.sendKeys("ELR321");
			Password.sendKeys("Dhana1111");
			LoginButton.click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			
			WebElement Pin = driver.findElement(By.id("pin"));
			WebElement ContinueButton = driver.findElement(By.xpath("//button[text()='Continue ']"));
			
			Pin.sendKeys("982278");
			ContinueButton.click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			
			WebElement Userid = driver.findElement(By.xpath("//span[@class='user-id']"));
			
			String actualUserid= Userid.getText();
			
			String expectedUserid="ELR321";
			
			if(actualUserid.equals(expectedUserid))
			{
				System.out.println("User ID is Matching......TC is Passed");
			}
			else 
			{
				System.out.println("User ID is Not Matching........TC is Failed ");
			}
			
			Userid.click();
			Thread.sleep(1000);
			
			WebElement LogOutButton = driver.findElement(By.xpath("//a[@target='_self']"));
		    LogOutButton.click();
		    Thread.sleep(1000);
		    
		    driver.quit();
		
	}

}
