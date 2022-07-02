package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedStudy {

	public static void main(String[] args) throws InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
			
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(5000);
		
		WebElement checkBox = driver.findElement(By.id("checkBoxOption1"));
		
		if(checkBox.isSelected())
		{
			System.out.println("CheckBox is already selected");
		}
		else
		{
			System.out.println("Selecting CheckBox Now");
			checkBox.isSelected();
			
			if(checkBox.isSelected())
			{
				System.out.println("CheckBox is Selected Now");
			}
			else
			{
				System.out.println("Failed to Selected CheckBox");
			}
		}
		
		

	}

}
