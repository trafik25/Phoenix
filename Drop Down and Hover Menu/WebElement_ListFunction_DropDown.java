import java.util.List;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * This example extracts the entire list of months on the dropdown list
 * on the Facebook signup page using the WebElement method
 * 
 */

public class WebElement_ListFunction_DropDown {

	public static void main(String[] args) {

		WebDriver wd = new FirefoxDriver();
		wd.get("http://facebook.com/");
		//give the xpath of the dropdown menu below
		WebElement monthdrop = wd.findElement(By.id("month"));  //store webelement object month
		List<WebElement> months = monthdrop.findElements(By.tagName("option"));
		
		
		//print all the elements in the list. 
		for (int i=0;i<months.size();i++)
		{
		String value= months.get(i).getText();
		System.out.println(value);
		}
		
		
		
		wd.quit();
		
		
	}

}
