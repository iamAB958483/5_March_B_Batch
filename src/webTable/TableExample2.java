package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample2 {

	public static void main(String[] args) {
		
		    System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.iplt20.com/points-table/men/2022");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
			
			List<WebElement> columns = driver.findElements(By.xpath("//table[contains(@class,' ih-td-tab ')]//tbody[1]//tr//th"));
			int NoOfcolumns = columns.size();
			System.out.println(NoOfcolumns);
			for(int i=1;i<=NoOfcolumns;i++)
			{
				WebElement columns1 = (WebElement) driver.findElements(By.xpath("//table[contains(@class,' ih-td-tab ')]//tbody[1]//tr//th["+i+"]"));
				System.out.println(columns1.getText()+" /");
			}
			System.out.println();
			
			
			List<WebElement> Rows = driver.findElements(By.xpath("//table[contains(@class,' ih-td-tab ')]//tbody[2]//tr//th"));
			int NoOfRows =Rows.size();
			for(int i=1;i<=NoOfRows;i++)
			{
				for(int j=1;j<=NoOfcolumns;j++)
				{
					WebElement values = driver.findElement(By.xpath("//table[contains(@class,'ih-td-tab ')]//tbody[2]//tr["+i+"]//td["+j+"]"));
					System.out.println(values.getText()+" /");
				}
				System.out.println();
			}

	}

}
