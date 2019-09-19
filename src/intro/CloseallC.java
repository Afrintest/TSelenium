package intro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseallC {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://naukri.com");

		String parent = driver.getWindowHandle();

		Set<String> win = driver.getWindowHandles();

		List<String> l = new LinkedList<>(win);

		for (int i = l.size() - 1; i > 0; i--) {
			driver.switchTo().window(l.get(i));
			Thread.sleep(2000);
			driver.close();
		}

	}

	//
	// win.remove(parent);
	//
	// for(String s:win){
	// //if(!parent.equalsIgnoreCase(s)){
	// driver.switchTo().window(s);
	// System.out.println(driver.getTitle());
	// Thread.sleep(2000);
	// driver.close();

}
