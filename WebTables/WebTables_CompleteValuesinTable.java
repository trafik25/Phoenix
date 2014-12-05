import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Complete_List {

	public static void main(String[] args) {

		WebDriver wd = new FirefoxDriver();
		wd.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		wd.get("http://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
	
		//print a complete list of 
		List<WebElement> completeList = wd.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td"));
		
		for(int i=0;i<completeList.size();i++) {
			System.out.println(completeList.get(i).getText());
		}
		
		wd.quit(); 
	}
		
	}
	

	
	
