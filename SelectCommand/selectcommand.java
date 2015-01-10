package TestSet2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	
	public static void main(String[] args) {

		FirefoxDriver wd = new FirefoxDriver();
		wd.get("http://www.echoecho.com/tooldropdown.htm");
		
		new Select(wd.findElement(By.name("choice"))).selectByVisibleText("YAHOO");		
		
		WebElement button = wd.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form[1]/div/p/input"));
		button.click();
		
		wd.quit();
		
	}
}
