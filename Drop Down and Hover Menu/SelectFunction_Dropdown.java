import java.util.List;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * Using WebElement 
 * 
 * 
 */

public class SelectFunction_DropDown {

	public static void main(String[] args) {

		WebDriver wd = new FirefoxDriver();
		wd.get("http://dell.com");
		//give the xpath of the dropdown menu below
		
		
		WebElement dropdown = wd.findElement(By.className("ctry"));
		List<WebElement> alloptions = dropdown.findElements(By.tagName("option"));
		System.out.println("Total Options in this list -->"+ alloptions.size());
		dropdown.findElement(By.className("ctryName")).click();
		
	
		Select dropdown2 = new Select(wd.findElement(By.id("ctryTtip")));
		dropdown2.selectByValue("Sweden");

		
		//wd.quit();
		
		
	}

}
