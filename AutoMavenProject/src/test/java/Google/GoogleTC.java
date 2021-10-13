package Google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleTC {
	
	@Test
	public void Ts001()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\WebDriver\\chromedriver_win32\\chromedriver.exe");//first parameter for webdriver for chrome and second one is exe file of chrome
		WebDriver myD=new ChromeDriver();
		myD.get("https://www.google.com/");
		myD.manage().window().maximize();
		
		
	}

}
