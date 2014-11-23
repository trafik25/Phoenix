import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SpecificLinks_Alt {

	public static void main(String[] args) {

		WebDriver wd = new FirefoxDriver();
		wd.get("http://www.bbc.com");
		
		String part1="//*[@id='most_popular_tabs_media']/ul/li[";
		String part2="]/a";
		
		for(int i=1;i<=5;i++) {
		String text =	wd.findElement(By.xpath(part1+i+part2)).getText();
		System.out.println(text);
		wd.findElement(By.xpath(part1+i+part2)).click();
		System.out.println(wd.getTitle());
		wd.get("http://www.bbc.com");

		
		
		
		
		}
		
		wd.quit();
		
	}
	
	
}