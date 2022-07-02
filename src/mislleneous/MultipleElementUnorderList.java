package mislleneous;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElementUnorderList {

	public static void main(String[] args) {
		
	    System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		driver.findElement(By.name("q")).sendKeys("honda");
		
		List<WebElement> searchResults = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		
		for(WebElement search:searchResults)
		{
			System.out.println(search.getText());
		}
		
		String expectedResult="honda civic";
		
		for(WebElement Results:searchResults)
		{
			String actualResults = Results.getText();
			
			if(actualResults.equals(expectedResult));
			{
				Results.click();
				break;
				
			}
				
		}
		
		
	    	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
              		
	       //driver.findElement(By.linkText("News")).click();
			
			driver.findElement(By.partialLinkText("Ne")).click();
			
	}

}
