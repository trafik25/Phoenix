package TestSet2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class USStockValues {

	public static void main(String[] args) {

		WebDriver wd = new FirefoxDriver();
		wd.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		wd.get("http://money.cnn.com/data/markets/?iid=C_All_MKTS");
	
		//print a complete list of elements listed under stocks 
		List<WebElement> stockPrices = wd.findElements(By.xpath(".//*[@id='wsod_marketsOverview']"));
		
		for(int i=0;i<stockPrices.size();i++) {
			System.out.println(stockPrices.get(i).getText());
		}
		
		wd.quit(); 
	}
		
	}
	

	
	
