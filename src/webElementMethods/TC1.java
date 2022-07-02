package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {

	public static void main(String[] args) {
		
	    System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
			
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='Velocity Corporate Training Center']"));
		
		String actualText=ele.getText();
		
		String expectedtext="Velocity Corporate Training Center";
		
		if(actualText.equals(expectedtext))
		{
			System.out.println("Text is matching Test Case is Passed");
		}
		else
		{
			System.out.println("Text is Not matching Test Case is failed");
		}
		
		
	}

}
