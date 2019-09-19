package assessment;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckDuplicate {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get(
				"file:///C:/Users/Nagma%20Noshin%20Shaik/Downloads/selenium/Neha_Software_Installation/Java%20Programs/TSelenium/html/Ht1.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		WebElement sel = driver.findElement(By.id("mlb"));

		Select sc = new Select(sel);

		List<WebElement> opt = sc.getOptions();
		List<String> lst = new LinkedList<>();

		for (WebElement we : opt) {

			String k = we.getText();
			lst.add(k);

		}
		

		Collections.sort(lst);
		System.out.println(lst);

		HashSet<String> lst1 = new HashSet<>(lst);
		System.out.println(lst1);

		HashSet<String> str = new HashSet<>();
		System.out.println(str);

		for (int i = lst.size() - lst1.size(); i < lst.size(); i++) {

			String k = lst.get(i);

			str.add(k);
		}

		System.out.println(str);

	}

}
