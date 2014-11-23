import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class DesiredCap {

	public static void main(String[] args) {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setJavascriptEnabled(true);
		//capabilities.setCapability(CapabilityType.Proxy, value);
		
		FirefoxDriver wd = new FirefoxDriver(capabilities); 
		
	}

}
