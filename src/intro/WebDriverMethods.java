package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		
	    System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//ChromeDriver driver= new ChromeDriver();
		
		driver.navigate().to("https://www.redbus.in");
		String title = driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getTitle());
		
		String url= driver.getCurrentUrl();
		
		System.out.println("url is "+url);
		
		System.out.println(driver.getCurrentUrl());

	}

}
