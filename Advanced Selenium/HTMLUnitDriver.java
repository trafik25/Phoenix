import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;


public class HTMLUnitDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxDriver driver = new FirefoxDriver();
		
		HtmlUnitDriver html = new HtmlUnitDriver(BrowserVersion.FIREFOX_17);  //emulate a browser Browserversion.BROWSER 
		driver.get("http://gmail.com");
		System.out.println(driver.getTitle());
		
	}

}
