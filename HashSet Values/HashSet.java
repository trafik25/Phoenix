import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

//V14e3

/*
 * HashSet for holding multiple values in an Array
 * 
 * 
 */


public class Set_Java {

	public static void main(String[] args) {

		/*
		WebDriver wd = new FirefoxDriver();
		wd.get("URL");
		wd.findElement(By.xpath("xxxxxx"));
		wd.findElement(By.xpath("xxxxxx"));
		*/
		
		//no index such as an array USA is not (0) UK is not (1)
		//no duplicate values are allowed
		//no order to the items printed
 		
		Set<String> mySet = new HashSet<String>();
		mySet.add("USA");
		mySet.add("UK");
		mySet.add("China");
		mySet.add("Mexico");
		mySet.add("Italy");
		
		Iterator<String> i =  mySet.iterator();
		System.out.println(i.next());
		System.out.println(i.next()); //print your index
	}

}
