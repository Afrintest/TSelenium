package popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileOpe {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
	
		Set<String> win = driver.getWindowHandles();
		
		for(String s:win){
			driver.switchTo().window(s);
		}
		
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		WebElement helpCenter=driver.findElement(By.xpath("//a[text()='Help Center']"));
		act.moveToElement(helpCenter).click().perform();
		Thread.sleep(4000);		
		driver.findElement(By.xpath("(//a[@href='/contact-support'])[2]")).click();
		WebElement fileupload=driver.findElement(By.id("fileupload"));
		fileupload.sendKeys("C:/Users/Nagma Noshin Shaik/Desktop/Word.docx");
		WebElement fileupload1=driver.findElement(By.id("fileupload"));
		fileupload1.sendKeys("C:/Users/Nagma Noshin Shaik/Desktop/Word1.docx");
		WebElement fileupload2=driver.findElement(By.id("fileupload"));
		fileupload2.sendKeys("C:/Users/Nagma Noshin Shaik/Desktop/Word2.docx");
		Thread.sleep(5000);
		// one way - driver.findElement(By.xpath("(//button[@class='fileupload-area__cancel'])[2]")).click();
		driver.findElement(By.xpath("//a[@id='cookie-button--got-it']")).click();			
		// second way driver.findElement(By.xpath("//div[@class='fileupload-area']/div[3]/button")).click();
		//Third way
		
		String str="Word.docx 0 kb";
		
		driver.findElement(By.xpath("//div[text()='"+str+"']/button")).click();
		
	}

}
