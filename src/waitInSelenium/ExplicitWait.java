package waitInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
	    System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
		
	    WebDriver driver= new ChromeDriver();
	    
	    driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/");
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofMillis(5000));
		
		WebElement StudentReview=driver.findElement(By.xpath("(//a[text()='Student Review'])[1]"));
		
		w.until(ExpectedConditions.visibilityOf(StudentReview));
		
		StudentReview.click();
		
		
		
	}

		
}


