import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Implicit_Wait {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver wd = new FirefoxDriver();
		
		//Implicit wait is a global timeout
		//Explicit wait --specific to an element
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wd.get("http://www.yahoo.com");
		
		
		wd.findElement(By.xpath(".//*[@id='p_13838465-p']")).sendKeys("hello");
		//Thread.sleep(4000);
		String text = wd.findElement(By.xpath(".//*[@id='p_13838465-results']/li[1]/a")).getText();		
		System.out.println(text);
		
		
		wd.quit();
	}
}
