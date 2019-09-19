package ty.selenium.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActiTableScroll {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args){

		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		
		driver.findElement(By.xpath("//div[text()='TASKS']")).click();
		
		WebElement scroll=driver.findElement(By.xpath("(//div[@class='iScrollIndicator'])[3]"));
		
		Actions act=new Actions(driver);
		
		act.clickAndHold(scroll).moveByOffset(0, 200).release().perform();

	}

}
