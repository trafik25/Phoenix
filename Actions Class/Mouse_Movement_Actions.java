import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/* Mod 15 V 1
 * Reference the Java docs here for the Actions class
 * http://selenium.googlecode.com/git/docs/api/java/index.html
 * 
 * if there are any issues with Firefox you may have to introduce native events 
 *       FirefoxProfile fp = new FirefoxProfile();
 *       fp.setEnableNativeEvents(true);
 */      

public class Mouse_Movements {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver wd = new FirefoxDriver();
		wd.get("http://www.americangolf.co.uk");
		
		//to click elements that are not visible you must use the Actions Class
		Actions act = new Actions(wd);
		
		
		//To move to an element you must create a variable, then introduce that variable to the actions method 
		WebElement golfClub = wd.findElement(By.xpath(".//*[@id='navigation']/nav/ul/li[1]/a"));
		act.moveToElement(golfClub).build().perform();
		
		//Add Thread command to ensure webdriver has time to move the mouse over the element
		Thread.sleep(3000);
		WebElement ladies = wd.findElement(By.xpath(".//*[@id='navigation']/nav/ul/li[1]/div/div[1]/ul/li[2]/a"));
		act.moveToElement(ladies).build().perform();
		
		//click on the link Golf Clubs > Drivers, place above Ladies 
		//wd.findElement(By.xpath(".//*[@id='CLUBS_1']/div[1]/ul[2]/li/ul/li[2]/ul/li[1]/a")).click();
		
		
		wd.quit();
		
		
}

	private static Actions Actions(WebDriver wd) {
		// TODO Auto-generated method stub
		return null;
	}


}