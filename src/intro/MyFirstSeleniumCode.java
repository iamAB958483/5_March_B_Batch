package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumCode {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com");
		
		//driver.close();
		
		//driver.quit();
		
		driver.manage().window().maximize();
	
		//driver.manage().window().minimize();
		
		driver.navigate().to("https://vctcpune.com/");
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		driver.navigate().to("https://www.w3schools.com/sql/");
		String title= driver.getTitle();
		
		System.out.println(title);
		System.out.println(driver.getTitle());
		String url=driver.getCurrentUrl();
		System.out.println("url is "+url);
		System.out.println(driver.getCurrentUrl());
	
	}
}	