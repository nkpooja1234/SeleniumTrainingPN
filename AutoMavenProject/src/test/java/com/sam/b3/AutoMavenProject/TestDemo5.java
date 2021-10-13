package com.sam.b3.AutoMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestDemo5 {
	
public WebDriver myD;
	
	@Test
	@Parameters({"vUrl"})
	public void OpenApp(String vUrl)
	{
		System.setProperty("webdriver.edge.driver", "D:\\WebDriver\\edgedriver_win32\\msedgedriver.exe");//first parameter for webdriver for chrome and second one is exe file of chrome
		WebDriver myD=new EdgeDriver();
		myD.get(vUrl);
		
		//myD.get("https://www.google.com");
		String vTitle=myD.getTitle();
		System.out.println(vTitle);
		myD.close();
		
	}

}
