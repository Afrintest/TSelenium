package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeSrc {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("manager");
		
		String loc=driver.findElement(By.cssSelector("img[src='/img/default/login/timer.png?hash=1389259578']")).getAttribute("src");
		System.out.println(loc);
		System.out.println(loc.substring(0, loc.indexOf('?')));
		
		String[] k = loc.split("\\?");
		
			System.out.println(k[0]);
	}

}
