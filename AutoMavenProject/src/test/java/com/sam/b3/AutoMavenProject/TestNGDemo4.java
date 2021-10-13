package com.sam.b3.AutoMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestNGDemo4 {
	
public WebDriver myD;
	
	@Test
	public void OpenApp()
	{
		System.setProperty("webdriver.edge.driver", "D:\\WebDriver\\edgedriver_win32\\msedgedriver.exe");
		WebDriver myD=new EdgeDriver();
		myD.get("https://www.amazon.in");
		String vTitle=myD.getTitle();
		System.out.println(vTitle);
		myD.close();
		
	}

}
