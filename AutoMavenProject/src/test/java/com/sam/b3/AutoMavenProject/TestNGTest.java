package com.sam.b3.AutoMavenProject;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestNGTest {
	
	@BeforeTest
	public void setUP() throws InterruptedException
	{
		System.out.println("TEST STARTED ........");
		Thread.sleep(5000);
	}
	
	@AfterTest
	public void tearDown() throws InterruptedException
	{
		System.out.println("TEST ENDED........");
		Thread.sleep(5000);
	}

}
