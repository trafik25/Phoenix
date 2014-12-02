import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.Wait;




public class Explicit_Wait {

	
	/*
	 * Typically you would use Explicit wait for Ajax sites
	 * Explicit wait again is only for specific elements on the page
	 * do not mix with implicit waits 
	 */
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver wd = new FirefoxDriver();
		WebDriverWait myElement = (new WebDriverWait(wd, 10));	
		wd.get("http://www.commonfloor.com/apartments-for-sale");
		wd.findElement(By.xpath("//*[@id='sale_type_chzn']/a/span")).click();
		wd.findElement(By.xpath(".//*[@id='sale_type_chzn_o_1']")).click();

		//Wait for the Ajax element to appear 
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='listing_loader']/img")));
		System.out.println("A");
		//Wait for the Ajax element to disappear 
		Wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@id='listing_loader']/img")));
		System.out.println("B");
		
		
		
		
	}
}
