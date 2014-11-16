import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class Profile {

	public static void main(String[] args) {
		// ProfilesIni, FirefoxProfile **there are 2 classes for profiles in FF

		
		ProfilesIni prof = new ProfilesIni();
		FirefoxProfile p = prof.getProfile("Selenium_User");
		FirefoxDriver wd = new FirefoxDriver(p); 
		
		
		wd.close(); //close the FF window
		wd.quit(); //tears down the driver service
	}

}
