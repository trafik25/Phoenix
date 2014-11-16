import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Selenium_basics {

	public static void main(String[] args)  {
		
		FirefoxDriver wd  = new FirefoxDriver() ; //object for this class
		
		//***find the EXE for whatever version of FF you want to use***
		//FirefoxBinary binary =  new FirefoxBinary("location of exe FF file");
		//FirefoxDriver driver1 = new FirefoxDriver(binary, null);
		
		
		//Chrome is a 3rd party driver
		/*System.setProperty("webdriver.chrome.driver" , "(location of exe)");
		ChromeDriver c1 =  new ChromeDriver(); */
		
		//IEDriver is a 3rd party driver
		/*System.setProperty("webdriver.ie.driver" , "(H:\\IEDriverServer.exe of exe)");
		InternetExplorerDriver c1 =  new InternetExplorerDriver(); */
		
	}
	
	
}
