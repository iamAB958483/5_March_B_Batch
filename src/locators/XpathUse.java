package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUse {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
		
 		WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		//Xpath by Attribute-
		driver.findElement(By.xpath("//input[@value='Radio4']")).click();
		
		//Xpath by Text Method-		
		driver.findElement(By.xpath("//a[text()='Velocity Corporate Training Center'])"));

		//Xpath by Contains()------>by text
		driver.findElement(By.xpath("//h1[contains(text(),'Welcome To Practice Page')]"));		
		
		//Xpath by Contains()------>by attribute
		driver.findElement(By.xpath("//input[contains(@value,'option1')]"));
		
		//Xpath by index
		driver.findElement(By.xpath("(//input[@name='radio'])[2]"));
				
	}

}
