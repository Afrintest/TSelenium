package assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone_Jew_Sc7 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		//driver.manage().deleteAllCookies();
		driver.get("https://www.bluestone.com");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[@title='Jewellery']"))).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@title='Kadas']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='The Vidyuth Kada For Him']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Buy Now']")).click();
		
		String error=driver.findElement(By.xpath("//div[@class='formErrorContent']")).getText();
		
		System.out.println("Error message is displayed:"+error);
		
		driver.quit();

	}

}
