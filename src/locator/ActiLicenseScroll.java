package locator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiLicenseScroll {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("licenseLink")).click();
	
		Set<String> win = driver.getWindowHandles();
		
		for(String s:win){
			driver.switchTo().window(s);
		}
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		int j=200;
		for(int i=0;i<5;i++){
		//Concat	
		jse.executeScript("window.scroll(0,"+j+")");
		j=j+200;
		}
		

	}

}
