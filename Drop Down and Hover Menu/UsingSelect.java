import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class UsingSelect {

	public static void main(String[] args) throws InterruptedException {
		
		//Initialize the driver
		WebDriver wd = new FirefoxDriver();
		//go to URL
		wd.get("https://developer.salesforce.com/en/signup?d=70130000000td6N");
		//Assign Webelement for the Listbox
		WebElement element = wd.findElement(By.id("job_role"));
		//Assign Select Object
		Select s = new Select(element);
		
		//Select value by text
		s.selectByVisibleText("Administrator");
		
		Thread.sleep(5000);
		
		//Get the size of the listbox
		int Firstboxsize = s.getOptions().size();
		
		//Select the last value by index
		s.selectByIndex(Firstboxsize-1);
	}

}
