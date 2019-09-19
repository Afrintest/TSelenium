package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcAgentLogin {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in");
		
			
		driver.findElement(By.xpath("//span[text()='AGENT LOGIN']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loginbutton")).click();
		Alert pop = driver.switchTo().alert();
		String s=pop.getText();
		System.out.println(s);
		pop.accept();
		
		driver.quit();
	}

}
