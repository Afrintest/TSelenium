package assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone_Sc8 {

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
		driver.findElement(By.xpath("//span[text()=' Select Size ']")).click();
		
		
		driver.findElement(By.xpath("//span[text()='2-2(2 2/16\")']")).click();
		String bangleSize=driver.findElement(By.xpath("//span[@class='size-box-overlay']")).getText();
		driver.findElement(By.xpath("//input[@value='Buy Now']")).click();
		Thread.sleep(2000);
		String selectedBangleSize=driver.findElement(By.xpath("//span[@class='size-box-overlay']")).getText();
		
		if(bangleSize.equals(selectedBangleSize)){
			System.out.println("Bangle Size is matched");
		}
		else{
			System.out.println("Bangle size not matched");
		}
		

	}

}
