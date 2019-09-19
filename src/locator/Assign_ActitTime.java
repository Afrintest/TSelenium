package locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_ActitTime {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");

		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("manager");

		driver.findElement(By.id("loginButton")).click();

		Thread.sleep(8000);

		List<WebElement> lst = driver.findElements(By.cssSelector("a,table"));
		System.out.println("Count: " + lst.size());

		for (WebElement w : lst) {
			// System.out.println("String:"+lst.get(i).getText());

			if (w.getTagName().equalsIgnoreCase("a")) {

				if ((w.getAttribute("href")) != null) {

					System.out.println("ahref: " + w.getAttribute("href"));

				} else if ((w.getAttribute("class")) != null) {

					String cls = w.getAttribute("class");

					System.out.println("aclass: " + cls);
				}

			}

			else if (w.getTagName().equalsIgnoreCase("table")) {

				if ((w.getAttribute("class")) != null) {

					String cls = w.getAttribute("class");

					System.out.println("t class: " + cls);
				} else if ((w.getAttribute("id")) != null) {
					String d = w.getAttribute("id");
					System.out.println("t id: " + d);
				}

			} else {
				System.out.println("No attribute");
			}
		}

	}

}
