import java.util.List;

import org.apache.http.client.fluent.Request;
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
		
		//define how many links are in the table or column i<=5 less than or = to 5?
		//for(int i=1;i<=5;i++)  //Remove the For Loop to use boolean statement below
		/*
		 * add int and while loop below to engage the boolean statement for finding
		 * if the element is present on the page
		 *  
		 */
	     
		
			
		int i=1;
		while(isElementPresent(part1+i+part2)) {
		String text =	wd.findElement(By.xpath(part1+i+part2)).getText();
		System.out.println(text);
		wd.findElement(By.xpath(part1+i+part2)).click();
		
		//Check Response code of current URL --Call the boolean function below here
		checkResponse(wd.getCurrentUrl());
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
	}  {
		
		
	}
	
	
	//this function will check for HTTP Response code
	public static boolean checkResponse(String url) {
		try {
            int resp_code=  Request.Get(url).execute().returnResponse().getStatusLine()
                    .getStatusCode();
                    System.out.println("Response code for URL" + url + "is ->" + resp_code);
            	if(resp_code == 200) 
            		return true; 
            	else 
            		return false;
		
		} catch (Exception e) {
			return false;
    
	}
		
	}
	
	
	
}

