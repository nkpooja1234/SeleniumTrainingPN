package com.sam.b3.AutoMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDriver\\chromedriver_win32\\chromedriver.exe");//first parameter for webdriver for chrome and second one is exe file of chrome
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		 String title=driver.getTitle();
		 System.out.println("Page Title: "+title);
		 driver.close();

	}

}
