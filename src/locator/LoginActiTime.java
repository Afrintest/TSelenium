package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginActiTime {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		WebElement un=driver.findElement(By.id("username"));
		un.sendKeys("Neha");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		un.clear();
		un.sendKeys("admin");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());		
		
		driver.quit();
	}

}
