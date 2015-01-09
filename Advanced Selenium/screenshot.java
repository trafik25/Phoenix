import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
This is a simple program for taking a screenshot with Selenium Webdriver. To use it simply change the file location 
of where you would like to save your screenshot. 

*/


public class Screenshots {

	public static void main(String[] args) throws IOException {  

		WebDriver wd = new FirefoxDriver();
		wd.get("http://www.google.com");
	
		File scrFile = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
        // now save the screenshot to a file some place
        FileUtils.copyFile(scrFile, new File("path to your folder where you want to save screenshots"));
		
		
		
		
		
	}

}
