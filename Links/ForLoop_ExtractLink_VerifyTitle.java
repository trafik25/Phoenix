import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * This test case has uses a for loop to verify that the links in 
a table are functional. The goal is to click the link, print the name of the link and
the title of the page where the link terminates. 
 * 
 */




	public class ForLoop_ExtractLink_VerifyTitle {
		static WebDriver wd;  //declare webdriver globally
		public static void main(String[] args) {
		

		 wd = new FirefoxDriver();
		 wd.get("http://www.bbc.com");
		
		//finding all links in a table or column 
		String part1="//*[@id='most_popular_tabs_media']/ul/li[";
		String part2="]/a";
		
		//define how many link are in the table or column i<=5 less than or = to 5?
		for(int i=1;i<=5;i++) { //Remove the For Loop to use boolean statement below
		String text =	wd.findElement(By.xpath(part1+i+part2)).getText();
		System.out.println(text);
		wd.findElement(By.xpath(part1+i+part2)).click();
		System.out.println(wd.getTitle());
		wd.get("http://www.bbc.com");
	
		
		}
		
	  wd.quit();

	}
	
	
}

