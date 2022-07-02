package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		  System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]")).click();
		Thread.sleep(4000);
		
		WebElement day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		
		Select s= new Select(day);
		
		for(int i=0;i<=10;i++)
		{
			Thread.sleep(1000);
			s.selectByIndex(i);
		}
		
		for(int i=10;i>=0;i--)
		{
			Thread.sleep(1000);
			s.selectByIndex(i);
		}
		
		
		
	
		//For Month----------------->
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s1= new Select(month);
		
		
		for(int i=0;i<=11;i++)
		{
			Thread.sleep(1000);
			s1.selectByIndex(i);
		}
		
		for(int i=11;i>=0;i--)
		{
			Thread.sleep(1000);
			s1.selectByIndex(i);
		}
		
		
		//For Year
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select s2= new Select(year);
		
		for(int i=2022;i<=2015;i++)
		{
			Thread.sleep(1000);
			s2.selectByIndex(i);
		}
		
		for(int i=1910;i>=1905;i--)
		{
			Thread.sleep(1000);
			s2.selectByIndex(i);
		}
		
		
		
		
		
		
	}

}
