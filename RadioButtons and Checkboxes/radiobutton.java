package TestSet2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		FirefoxDriver wd = new FirefoxDriver();
		wd.get("http://www.echoecho.com/htmlforms10.htm");
		
		//wait for page to load 
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Click the first radio button in an array
		List<WebElement> radio = wd.findElements(By.name("radio1"));
		radio.get(0).click();  //click the first radio button 
		System.out.println("Total radio buttons in the list  : " + radio.size());
		
		//tells which radio button is checked and returns true or null
		System.out.println(radio.get(0).getAttribute("Checked"));
		System.out.println(radio.get(1).getAttribute("Checked"));
 		System.out.println(radio.get(2).getAttribute("Checked"));
		
		wd.quit();
		
		
		
		
	}

}
