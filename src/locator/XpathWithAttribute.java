package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathWithAttribute {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Nagma%20Noshin%20Shaik/Downloads/selenium/Neha_Software_Installation/Java%20Programs/TSelenium/html/FD2.html");
		Thread.sleep(2000);
		WebElement UN1=driver.findElement(By.xpath("//input[@value='UN1:']"));
		UN1.clear();
		UN1.sendKeys("admin");
		System.out.println("UN1: "+UN1.getAttribute("value"));
		WebElement UN2=driver.findElement(By.xpath("//input[@value='UN2:']"));
		UN2.clear();		
		UN2.sendKeys("manager");
		System.out.println("UN2: "+UN2.getAttribute("value"));
		WebElement PW1=driver.findElement(By.xpath("//input[@value='PW1:']"));
		PW1.clear();
		PW1.sendKeys("manager");
		System.out.println("PW1: "+PW1.getAttribute("value"));
		WebElement PW2=driver.findElement(By.xpath("//input[@value='PW2:']"));
		PW2.clear();
		PW2.sendKeys("password");
		System.out.println("PW2: "+PW2.getAttribute("value"));
		
		Thread.sleep(2000);
		//driver.quit();

	}

}
