import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class UsingActions_Slider {

	public static void main(String[] args) {

		WebDriver wd = new FirefoxDriver();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wd.get("http://americangolf.co.uk/golf-clubs/sets-of-irons");
		
		Actions act = new Actions(wd);

		
		WebElement point = wd.findElement(By.xpath(".//*[@id='secondary']/div/div[2]/div[1]/div[1]/span[2]"));
		act.dragAndDropBy(point, -100, 0).build().perform();;  //use x basis because no Y coordinate exist x= -100 y = 0
		
		
		
		//wd.quit();
		
	}

}
