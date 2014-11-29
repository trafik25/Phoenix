import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class Screenshots {

	public static void main(String[] args) throws IOException {  

		WebDriver wd = new FirefoxDriver();
		wd.get("http://www.google.com");
	
		File scrFile = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
        // now save the screenshot to a file some place
        FileUtils.copyFile(scrFile, new File("file:///Users/thow/Desktop/Mixed/screenshot.png"));
		
		
		
		
		
	}

}
