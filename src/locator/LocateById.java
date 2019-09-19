package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateById {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Nagma%20Noshin%20Shaik/Downloads/FD.html");
		WebElement l1 = driver.findElement(By.id("a1"));
		Thread.sleep(2000);
		l1.click();
		

	}

}
