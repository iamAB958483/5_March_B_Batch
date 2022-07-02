package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
			
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(7000);
		
		WebElement textBox = driver.findElement(By.id("displayed-text"));
		
		boolean result=textBox.isDisplayed();
		System.out.println("TextBox Status is "+result);
		textBox.sendKeys("Hello Brother");
		
		driver.findElement(By.id("hide-textbox")).click();
		
		boolean result1=textBox.isDisplayed();
		
		System.out.println("TextBox Status is "+result1);
		
		
		
	}

}
