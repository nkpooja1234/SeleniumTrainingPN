package Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
	
	public WebDriver myD;

	public GoogleSearchPage(WebDriver myD) {
		super();
		this.myD = myD;
	}
	
	By SeachPage=By.name("Serach");
	

}
