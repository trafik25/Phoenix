import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/* Mod 15 V 1  (18:48)
 * Reference the Java docs here for the Actions class
 * http://selenium.googlecode.com/git/docs/api/java/index.html
 * 
 * if there are any issues with Firefox you may have to introduce native events 
 *       FirefoxProfile fp = new FirefoxProfile();
 *       fp.setEnableNativeEvents(true);
 */      

public class ExtractingLinks_HoverMenu {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver wd = new FirefoxDriver();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wd.get("http://www.americangolf.co.uk");
		
		//to click elements that are not visible you must use the Actions Class
		Actions act = new Actions(wd);
		
		
		//To move to an element you must create a variable, then introduce that variable to the actions method 
		WebElement golfClub = wd.findElement(By.xpath(".//*[@id='navigation']/nav/ul/li[1]/a"));
		act.moveToElement(golfClub).build().perform();
		
		WebElement box = wd.findElement(By.xpath(".//*[@id='CLUBS_2']/div[1]"));
		List<WebElement> links = box.findElements(By.tagName("a"));
		System.out.println("Total links -->" + links.size());
		
		
		wd.quit();
		
		
}

	private static Actions Actions(WebDriver wd) {
		// TODO Auto-generated method stub
		return null;
	}


}