import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTables {

	public static void main(String[] args) {

		WebDriver wd = new FirefoxDriver();
		wd.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		wd.get("http://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
	
		
		//Find the value of the 20th row .//table[@class='dataTable']/tbody/tr[20]
		//Complete Column 1 .//table[@class='dataTable']/tbody/tr/td[1]
		List<WebElement> compnames = wd.findElements(By.xpath(".//table[@class='dataTable']/tbody/tr/td[1]"));
		List<WebElement> currentprice = wd.findElements(By.xpath(".//table[@class='dataTable']/tbody/tr/td[4]"));

		
		for(int i=0;i<compnames.size();i++) {
			//Use the for Loop to print the values of the company name + its stock price
			//since (i) is the same meaning the company matches the price in the table
			System.out.println(compnames.get(i).getText() + "-----" + currentprice.get(i).getText()); 
		}
		
		wd.quit();
	}
	
	
}