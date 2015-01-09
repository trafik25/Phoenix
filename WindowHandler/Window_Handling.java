import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//Mod14Pt3-- 11:11

public class Rediff {

	public static void main(String[] args) {

		
		//Do you want to use ChromeDriver? You must set the system property 
		//System.setProperty("wd.chromedriver", "path to Chrome exe");
		
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		Set<String> windows = wd.getWindowHandles(); //gets the ID of the open windows
		System.out.println("Total Windows open -->" + windows.size()); //size of the set of Windows
		
		//retrieving a window ID
		Iterator<String> it =  windows.iterator(); //will iterate over each element of the set, or how many windows are open
		System.out.println(it.next());  //prints ID of the window for FF Browser window
		wd.get("http://www.rediff.com");  //URL here
		
		//manage the popup--if popup is present
		System.out.println("**********************************"); //Separator 
		windows = wd.getWindowHandles(); //retrieve window IDs again (declared this at the top)
		it =  windows.iterator(); //get the iterator again do this for each window
		
		System.out.println("Total Windows open -->" + windows.size());  //get the ID of both windows 
		String mainWindow = it.next(); //iterate to the next window
		//String popUpWindow = it.next(); //if there is a popup
		System.out.println(mainWindow);
		//System.out.println(popUpWindow); //if there is a popup
		
		//wd.switchTo().window(arg); //switches command to whatever window you want
			//place the variable name of the window in the argument 
		wd.close(); //closes the window specified 
		
		
		wd.quit();
		
	}

}
