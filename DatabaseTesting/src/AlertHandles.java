import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Click me!']")).click();
        Thread.sleep(1000);
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        
        
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//button[text()='Click me!'])[2]")).click();
        Thread.sleep(1000);
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(1000);
        driver.switchTo().alert().dismiss();
        
        
        
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Click for Prompt Box']")).click();
        Thread.sleep(1000);
       driver.switchTo().alert().sendKeys("Pooja");
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        
	}

}
