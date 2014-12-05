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
		
		
		//calculate total rows in a table and extract data <table class="dataTable">
		// xpath //table[@class='dataTable']/tbody/tr
		List<WebElement> rows = wd.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println(rows.size());
		 
		//To extract all data from all the rows you would write
		for(int i=0;i<rows.size();i++) {
			System.out.println(rows.get(i).getText());
		}
	
		
		
		wd.quit();
	}
	
	
}