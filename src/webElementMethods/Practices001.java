package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practices001 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
			
        
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
        //driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 13 pro");
        
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13 pro");
        
        Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		
	}

	
}
