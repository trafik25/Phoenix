import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Drop_Downs {

	public static void main(String[] args) {

		WebDriver wd = new FirefoxDriver();
		wd.get("http://www.steegle.com/websites/google-sites-howtos/horizontal-navigation-drop-down-menus");
		wd.findElement(By.xpath(".//*[@id='sites-searchbox-select-dropdown']")).click();
		wd.findElement(By.xpath(".//*[@id=':1']/div")).click();
		wd.findElement(By.xpath(".//*[@id='jot-ui-searchInput']")).sendKeys("Google");
		wd.findElement(By.xpath(".//*[@id='sites-searchbox-select-button']")).click();

		
		wd.quit();
		
		
	}

}
