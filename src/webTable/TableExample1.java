package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample1 {

	public static void main(String[] args) throws InterruptedException {
		
	        System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		
			WebDriver driver=new ChromeDriver();
			
			//driver.manage().window().maximize();

			driver.get("https://vctcpune.com/selenium/practice.html");
			
			Thread.sleep(1000);

			List<WebElement> NoRows = driver.findElements(By.xpath("//tr"));
			List<WebElement> NoColumn = driver.findElements(By.xpath("//th"));
			
			int TotalNoRows = NoRows.size();
			int TotalNoColumn = NoColumn.size();
			
			System.out.println("Total Number of Rows "+TotalNoRows);
			System.out.println("Total Number of Column "+TotalNoColumn);
			
			for(int i=1;i<=TotalNoRows;i++)
			{
			
				for(int j=1;j<=TotalNoColumn;j++)
				{
			
				if (i==1)//"tr=1" then element will be "th"
				{
					String Text = driver.findElement(By.xpath("//table//tr["+i+"]//th["+j+"]")).getText();
					System.out.println(Text + " ");
				}
				else //Here "tr=2" then element will be "td"
				{
					String Text1 = driver.findElement(By.xpath("//table//tr["+i+"]//td["+j+"]")).getText();
					System.out.println(Text1 + " ");
				}
				}
				
				System.out.println();
				
			}
			
			
	}

}
