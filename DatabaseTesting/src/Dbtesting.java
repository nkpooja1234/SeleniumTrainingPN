import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Set;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dbtesting {

	public static void main(String[] args) throws SQLException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\WebDriver\\chromedriver_win32\\chromedriver.exe");//first parameter for webdriver for chrome and second one is exe file of chrome
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		 String title=driver.getTitle();
		 System.out.println("Page Title: "+title);
	/*	String s="selenium";

		
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(s);
		Thread.sleep(1000);
		driver.findElement(By.name("btnK")).click();

		String title = driver.findElement(By.xpath("//form[@id=\"tsf\"]/div[1]/div[1]/div[2]/div/div[2]/input")).getAttribute("value");
System.out.println(title);
		if ( s.equals(title)) {
		  System.out.print("Pass");
		}
		else
		{
		 System.out.print("Fail");
		}
		Thread.sleep(3000);
		driver.close();*/
		
		/*
		int s=driver.findElements(By.tagName("a")).size();
		System.out.println(s);
		for(int i=0;i<s;i++) {
			
			String link=driver.findElements(By.tagName("a")).get(i).getAttribute("href");
			System.out.println(link);
			
			if(link.contains("signin"))
			{
				System.out.println("aaaa");
				//break;
			}
					
					
			
			
		}*/
		
		/*Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();
		*/
		
		/*Select sel =new Select(driver.findElement(By.name("param[start_month]")));
		sel.selectByIndex(0);
		Thread.sleep(3000);
		sel.selectByValue("2");
		Thread.sleep(3000);
		sel.selectByVisibleText("Dec");
		*/
		
		 //5th assignment
		 Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		Thread.sleep(3000);
		 Set w = driver.getWindowHandles();
		Iterator t = w.iterator();
		String h = (String) t.next();
		String p = (String) t.next();
		driver.switchTo().window(h);
		driver.switchTo().window(p);
		String helptitle=driver.getTitle();
		 System.out.println("Help Title:" +helptitle);
		driver.quit();
		 
		
		}



		}

//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ooja");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pooja");
	//driver.findElement(By.xpath("//input[@id='password-visibility-toggle'] and //input[@class='button__password-visibility']")).click();
	
	




