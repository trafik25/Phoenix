import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * This test case has two parts. Part 1 uses a for loop to verify that the links in 
 * a table are functional. The goal is to click the link, print the name of the link and
 * the title of the page where the link terminates. 
 * 
 * Additionally, the second part of the test uses a boolean statement to find out whether 
 * or not an element is on the page. This is much more reliable than using AssertTrue or 
 * the .isPresent, isVisible methods in Selenium. 
 */



public class WhileLoop_ExtractLink_verifyfunctionality {
	static WebDriver wd;  //declare webdriver globally
	public static void main(String[] args) {
		

		 wd = new FirefoxDriver();
		wd.get("http://www.bbc.com");
		
		//finding all links in a table or column 
		String part1="//*[@id='most_popular_tabs_media']/ul/li[";
		String part2="]/a";
		
	
			
		int i=1;
		while(isElementPresent(part1+i+part2)) {
		String text =	wd.findElement(By.xpath(part1+i+part2)).getText();
		System.out.println(text);
		wd.findElement(By.xpath(part1+i+part2)).click();
		System.out.println(wd.getTitle());
		wd.get("http://www.bbc.com");
		i++;
		
		}
		
		
		
	}
	 //is an element on the page present yes? Use a boolean statement, delcare webdriver as a global variable
	public static boolean isElementPresent(String element_xpath) {
		int count = wd.findElements(By.xpath(element_xpath)).size();
		
		if(count == 0)
			return false;
		else 
			return true;
		
		
	}
	
	
}

