package TestSet2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NYSEValues {

	public static void main(String[] args) {

		//cool little Nasdaq test for nested table values
		
		//.//*[@id='mod-quotes-latest']
		FirefoxDriver wd = new FirefoxDriver();
		wd.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);  //wait for the elements price to load
		wd.get("http://money.cnn.com/");
		
		String marketName = "Nasdaq";
		
		List<WebElement> marketTable = wd.findElements(By.xpath(".//*[@id='mod-quotes-latest']/div[3]/table/tbody/tr[2]/td[1]"));
		List<WebElement> marketValue = wd.findElements(By.xpath(".//*[@id='mod-quotes-latest']/div[3]/table/tbody/tr[2]/td[2]/span"));

		for(int i=0;i<marketTable.size();i++) {
			
			if(marketTable.get(i).getText().equals(marketName)) 
				System.out.println(marketTable.get(i).getText() + ":" + marketValue.get(i).getText()); 
		}
		
		wd.quit();
		
	}

}
