package com.sam.b3.AutoMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Demo2 {
	
	public WebDriver driver;
	@Test
	 public void Google()
	 {
	 	WebDriver driver=new ChromeDriver();
	 	driver.get("https://www.linkedin.com/login");
	 }

	@BeforeTest
	public void Setup()
	 {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDriver\\chromedriver_win32\\chromedriver.exe");//first parameter for webdriver for chrome and second one is exe file of chrome
		driver =new ChromeDriver();//wedriver for chrome
		
	
	 }
	
	@AfterTest
	public void CloseBroser()
	 {
		driver.close();
		
	
	 }
	
	@BeforeSuite
	public void StartSuite()
	 {
		System.out.println("Start programming");
		
	
	 }
	
	@AfterSuite
	public void CloseSuite()
	 {
		System.out.println("closing programming");
		
	
	 }
	 }

	


