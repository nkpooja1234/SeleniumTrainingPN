import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://jqueryui.com/droppable/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        String text=driver.findElement(By.className("entry-title")).getText();
        Thread.sleep(3000);
        
        
        int s=driver.findElements(By.tagName("iframe")).size();
        
        //Implicit wait
       
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo frame']")));
        
        String vtest=driver.findElement(By.id("draggable")).getText();
        Thread.sleep(3000);
        WebElement source =driver.findElement(By.id("draggable"));
        Thread.sleep(3000);
        WebElement dest =driver.findElement(By.id("droppable"));
        Thread.sleep(3000);
        
        Actions act=new Actions(driver);
        Thread.sleep(3000);
        act.dragAndDrop(source, dest).build().perform();
        
        driver.switchTo().defaultContent();
        String text1=driver.findElement(By.className("entry-title")).getText();
        
        
        
        

	}

}
