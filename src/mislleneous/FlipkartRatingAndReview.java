package mislleneous;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartRatingAndReview {

	public static void main(String[] args) {
		
	    System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 13 pro max");

		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		driver.findElement(By.xpath("(//div[@class='_3LWZlK'])[2]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
	    WebElement Review = driver.findElement(By.xpath("((//div[@class='gUuXy-'])[1]//span)[6]"));
	    
	    System.out.println(Review.getText());
		
	    WebElement Rating=driver.findElement(By.xpath("((//div[@class='gUuXy-'])[1]//span)[4]"));
	    
	    System.out.println(Rating.getText());
		
	}

}
