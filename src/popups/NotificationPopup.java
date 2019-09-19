package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		opt.addArguments("--start-maximized");
		
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in");
		
		

	}

}
