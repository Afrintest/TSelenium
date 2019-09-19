package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendParameters {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Nagma%20Noshin%20Shaik/Downloads/selenium/Neha_Software_Installation/Java%20Programs/TSelenium/html/FD1.html");
		WebElement un = driver.findElement(By.id("un"));
		Thread.sleep(2000);
		un.sendKeys("username");
		WebElement pw = driver.findElement(By.name("pwd"));
		Thread.sleep(2000);
		pw.sendKeys("Password");
		
		Thread.sleep(2000);
		
		driver.close();
		
	}
	
}
