import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Element_Present {

	public static void main(String[] args) {

		WebDriver wd = new FirefoxDriver();
		wd.get("http://www.gmail.com");
		
		int count = wd.findElements(By.xpath(".//*[@id='Email']")).size();
		System.out.println(count);
		
		
		wd.quit();
		
	}

}
