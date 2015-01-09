import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Specific_Links {

	public static void main(String[] args) {

		WebDriver wd = new FirefoxDriver();
		wd.get("http://www.bbc.com");

		//find all the links in a certain area or box on a page
		WebElement box = wd.findElement(By.xpath(".//*[@id='video_wrapper']/div[2]/ul"));
		List<WebElement> links = box.findElements(By.tagName("a"));
		System.out.println("Total Links --> "+ links.size());
		
		
		//print the text for all the links in that box
		for(int i=0;i<links.size();i++) {
	    	System.out.println(links.get(i).getText());
	    	links.get(i).click();
	    	System.out.println(wd.getTitle());
	    	wd.get("http://www.bbc.com");
	    	
	    	//building your own cache 
	    	/*
	    	 * When you are trying to test links from one page and navigate to 
	    	 * the other pages where the links terminate, cache is cleared 
	    	 * every time the driver navigates to another page so you must use the code
	    	 * below again, to build your own cache 
	    	 */ 
	    	box = wd.findElement(By.xpath(".//*[@id='video_wrapper']/div[2]/ul"));
	    	links = box.findElements(By.tagName("a"));
	    	System.out.println("*************************");

	    }
		
		
		
		
		
		
		wd.quit();
		
	}

}
