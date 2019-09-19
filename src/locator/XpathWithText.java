package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathWithText {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']"));
		
//By h=By.id("");		
//Set hs=new LinkedHashSet();
//
//System.out.println(hs.getClass().getName());
//
//System.out.println(h.getClass().getName());
		
		
//		driver.findElement(By.xpath("//div[contains(text(),'Settings')]")).click();
		
	}

}
