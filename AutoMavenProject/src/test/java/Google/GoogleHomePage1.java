package Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage1 {
	
	public WebDriver myD;

	public GoogleHomePage1(WebDriver myD) {
		super();
		this.myD = myD;
	}
	
	By SeachText=By.name("Serach");
	By SearchButton=By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input");
	
	public WebElement SearchText()
	{
		return myD.findElement(SeachText);
	}
	
	public WebElement SearchButton()
	{
		return myD.findElement(SearchButton);
	}

}
