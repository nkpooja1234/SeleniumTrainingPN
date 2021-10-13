package com.sam.b3.AutoMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGDemo2 {
	
public WebDriver myD;
	
	@Test
	public void OpenApp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\WebDriver\\chromedriver_win32\\chromedriver.exe");//first parameter for webdriver for chrome and second one is exe file of chrome
		myD =new ChromeDriver();
		myD.get("https://www.google.com");
		String vTitle=myD.getTitle();
		System.out.println(vTitle);
		
		
	}
	
	@Test (dependsOnMethods = {"OpenApp"}, enabled = true)
	public void CloseApp()
	{
		myD.close();
	}
	

}
