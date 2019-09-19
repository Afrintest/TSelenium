package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//a[text()='Login & Signup']")).click();
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		driver.quit();
		

	}

}
