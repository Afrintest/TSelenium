package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MoveTo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args){

		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Actions implement actions interface
		Actions act=new Actions(driver);
		//context click=right click
		
		WebElement un=driver.findElement(By.id("username"));
		un.sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		//driver.findElement(By.id("loginButton")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("preInsertedTransformedMoireId"))));
		
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		//preInsertedTransformedMoireId
		
		//act.moveByOffset(300, 400).perform();
		act.moveToElement(driver.findElement(By.xpath("(//div[@class='iScrollIndicator'])[3]"))).moveByOffset(0, 800).contextClick().perform();
		//act.contextClick();
		//act.moveByOffset(100, 100).contextClick().perform();
		
		
		
	
	

	}

}
