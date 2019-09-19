package locator;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiXpathAllcustomer {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='TASKS']")).click();
		
		 List<WebElement> f = driver.findElements(By.xpath("//div[@class='title ellipsis']"));
		 Thread.sleep(4000);
		 
		 for(int i=0;i<f.size();i++){
			 if(!f.get(i).getAttribute("title").equalsIgnoreCase("")){
		 System.out.println(i+": "+(f.get(i).getAttribute("title")));
		 }
		 }
	}

}
