package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FileuploadRobot {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/contact-support");
		
		
		driver.findElement(By.xpath("//a[@id='cookie-button--got-it']")).click();
		driver.findElement(By.id("fileupload")).click();
		
		Robot rb=new Robot();
						
		rb.keyPress(KeyEvent.VK_W);
		rb.keyPress(KeyEvent.VK_O);
		rb.keyPress(KeyEvent.VK_R);
		rb.keyPress(KeyEvent.VK_D);
		rb.keyPress(KeyEvent.VK_1);
		rb.keyPress(KeyEvent.VK_ENTER);
		
		
//	Thread.sleep(1000);
//		
//		rb.keyPress(KeyEvent.VK_TAB);
//		
//		rb.mouseMove(200, 200);
//		
//		rb.keyPress(KeyEvent.VK_TAB);
		
	
		
	}

}
