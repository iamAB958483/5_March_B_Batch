package POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogOutPage {

	   
			// 1.Data Members/Variables
	
			@FindBy(xpath="//div[@class='oajrlxb2 qu0x051f esr5mh6w e9989ue4 r7d6kgcz nhd2j8a9 p7hjln8o kvgmc6g5 cxmmr5t8 oygrvhab hcukyx3x i1ao9s8h esuyzwwr f1sip0of abiwlrkh p8dawk7l lzcic4wl bp9cbjyn s45kfl79 emlxlaya bkmhp75w spb7xbtv rt8b4zig n8ej3o3l agehan2d sk4xxmp2 rq0escxv j83agx80 taijpn5t jb3vyjys rz4wbd8a qt6c0cv9 a8nywdso l9j0dhe7 qypqp5cg q676j6op tdjehn4e'][1]") private WebElement Userid;
			
			@FindBy(xpath="//span[text()='Log Out']") private WebElement Logout;
	
	
			// 2.Constructor
			
			public FacebookLogOutPage (WebDriver driver)
			{
				PageFactory.initElements(driver,this);
			}
			
			// 3.Method
			
			public void FacebookLogOutPage()
			{
		        Userid.click();
			}
			

			public void clickonLogOutButton()
			{
				Logout.click();
			}



}
