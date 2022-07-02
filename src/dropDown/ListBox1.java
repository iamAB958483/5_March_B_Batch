package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox1 {

	public static void main(String[] args) throws InterruptedException {
	
		
	    System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]")).click();
		Thread.sleep(4000);
		
		//1.Identify list box to be handled and store it in reference variable
		WebElement day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		
		//2.Create an object of Select class which will accept WebElement as
		Select s= new Select(day);
		
		/*3.By using one of the select class methods we can select values form list box like
		   1.selectByVisibleText:selectByVisibleText(String arg())
		   2.selectByIndex:selectByIndex(int arg())
		   3.selectByValue:selectByValue(String arg())
		*/
		Thread.sleep(1000);
		s.selectByVisibleText("8");
		Thread.sleep(1000);
		s.selectByIndex(9);
		Thread.sleep(1000);
		s.selectByValue("15");
		
		//For Month-------------->
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s1= new Select(month);
		Thread.sleep(1000);
		s1.selectByVisibleText("Dec");
		Thread.sleep(1000);
		s1.selectByIndex(3);
		Thread.sleep(1000);
		s1.selectByValue("9");
		
		
		//For Year--------------->
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select s2= new Select(year);
		Thread.sleep(1000);
		s2.selectByVisibleText("2012");
		Thread.sleep(1000);
		s2.selectByIndex(19);
		Thread.sleep(1000);
		s2.selectByValue("1920");
		
		
		
	}

}
