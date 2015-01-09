import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Radio_Buttons {

	public static void main(String[] args) {

		WebDriver wd = new FirefoxDriver();
		wd.get("http://www.echoecho.com/htmlforms10.htm");
		
		
		List<WebElement> radio = wd.findElements(By.xpath("//input[@name='group1']"));
		//print the total # of elements in the list (Radio buttons)
		System.out.println("Total Radio buttons in the list : " + radio.size());
		
		//Find that the variable value for any radio button is checked which happens when one is selected
		System.out.println(radio.get(0).getAttribute("Checked"));
		System.out.println(radio.get(1).getAttribute("Checked"));
 		System.out.println(radio.get(2).getAttribute("Checked"));

		//Select the radio button for a variable  --
		radio.get(2).click();
		//after selecting the radio button make sure it says checked and print that value
		System.out.println("-------------------");
		System.out.println(radio.get(0).getAttribute("Checked"));
		System.out.println(radio.get(1).getAttribute("Checked"));
		System.out.println(radio.get(2).getAttribute("Checked"));
	
		
		wd.quit();
	}

}
