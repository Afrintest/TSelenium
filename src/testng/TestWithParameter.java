package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestWithParameter {

	WebDriver driver;

	@Parameters({ "browser" })
	@Test
	public void DemoA(@Optional("firefox") String browser) {

		if (browser.equals("firefox")) {
			System.out.println("Edge");
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");	
			driver = new FirefoxDriver();
			System.out.println("Thread: "+Thread.currentThread().getName());
		
		} else {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Thread: "+Thread.currentThread().getName());
		}
		driver.navigate().to("http://localhost/login.do");

		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

	}

}
