import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/*
 * Alerts start at line 45.
 * 
 * 
 */

public class Managing_Alerts {

	public static void main(String[] args) {

		
		
		WebDriver wd = new FirefoxDriver();
		//wd.manage().window().maximize();
		wd.get("http://www.rediff.com");  //URL here
		
		
		
		//Managing Alerts on a screen with a Lightbox 
		//Click on Signin on reddit.com
		wd.findElement(By.xpath(".//*[@id='signin_info']/a[1]")).click();
		wd.findElement(By.xpath(".//*[@id='btn_login']")).click();;
		
		Alert al = wd.switchTo().alert();
		System.out.println(al.getText());
		al.accept(); //accept the alert 
		wd.switchTo().defaultContent(); //brings you back to the browser
		
		
		wd.quit(); //closes the window specified 
	}

}
