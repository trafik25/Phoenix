import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/*
 * validate text input fields
 * text on buttons and on objects
 * 
 */


public class Declaring_Browser {

	public static void main(String[] args) {
		String browser = "Chrome";
		WebDriver wd = null;
		
		if(browser.equals("Chrome"))
			wd =  new FirefoxDriver();
		else if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "usr/bin/chromedriver");
			wd = new ChromeDriver();
		}  else if (browser.equals("IE")); {
		
	
			
	}
		
		
		
		//write, read and clear input fields
		
		/*
		 * Commented out validating text fields code
		 *
		WebDriver wd = new FirefoxDriver();
		wd.get("https://www.golfclubs.com/");
		String x = wd.findElement(By.xpath(".//*[@id='navbar-slide']/div[2]/div/form[1]/div/input")).getAttribute("value");		
		System.out.println(x);
		wd.findElement(By.xpath(".//*[@id='navbar-slide']/div[2]/div/form[1]/div/input")).sendKeys("nokia");		
		String y = wd.findElement(By.xpath(".//*[@id='navbar-slide']/div[2]/div/form[1]/div/input")).getAttribute("value");		
		System.out.println(y); //print the value you have entered in the search box 
		wd.findElement(By.xpath(".//*[@id='navbar-slide']/div[2]/div/form[1]/div/input")).clear();		
		*/
		
		
		
		//validate text on buttons
		
		WebDriver wd1 = new ChromeDriver();
		wd1.get("https://www.golfclubs.com/");
		String z = wd1.findElement(By.xpath(".//*[@id='email-signup-form']/div[2]/span/input")).getAttribute("value");
		System.out.println(z);
		
		wd1.close();

	}

}
