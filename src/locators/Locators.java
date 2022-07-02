package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
		
 		WebDriver driver= new ChromeDriver();
 		
 		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(100);
		
	  
		//For ID
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		
		//For Name
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		
		//For ClassName
		driver.findElement(By.className("submit-button")).click();
		
		
		//For TagName
		driver.findElement(By.tagName("input")).sendKeys("standard_user");

		
		//For Linked Text
    	driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();
		
		
		//For partial Linked Text
        driver.findElement(By.partialLinkText("Bolt")).click();
        
        //For CSS Selector
        driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("input#login-button")).click();
		
	}

}
