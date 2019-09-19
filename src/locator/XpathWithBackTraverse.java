package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathWithBackTraverse {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//div[contains(text(),'Settings')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Licenses']")).click();
		
		String IssueDate=driver.findElement(By.xpath("//nobr[contains(.,'Issue Date:')]/../../td[2]")).getText();
		System.out.println("Issue Date: "+IssueDate);
		String Licensed=driver.findElement(By.xpath("//nobr[contains(.,'Licensed Users:')]/../../td[2]")).getText();
		System.out.println("Licensed Users: "+Licensed);
		String Edition=driver.findElement(By.xpath("//nobr[contains(.,'Product Edition:')]/../../td[2]")).getText();
		System.out.println("Product Edition: "+Edition);
		
		
		
		
	}

}
