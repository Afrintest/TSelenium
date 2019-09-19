package actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActiTimeAllCust {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='TASKS']")).click();
		 
	
		 List<WebElement> l = driver.findElements(By.xpath("//tr[@class='taskRow']/td[2]/div/div[2]"));
		
			
	List<WebElement> k = driver.findElements(By.xpath("//tr[@class='taskRow']/td[2]/div/div[2]/../../../td[6]/div/span"));
	
		
		 
		 for(int i=0;i<l.size();i++){
			
			System.out.print(l.get(i).getAttribute("title"));
			Thread.sleep(2000);
			System.out.println("  "+k.get(i).getText());
			
			
		 }
	}


}
