package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException{

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions act=new Actions(driver);
		
		driver.switchTo().frame(0);
		
		WebElement scroll=driver.findElement(By.xpath("//div[@id='slider']"));
		
		int j=100;
		
		for(int i=1;i<=5;i++){
			
			Thread.sleep(1000);
		
		act.clickAndHold(scroll).moveByOffset(j, 0).perform();
		
		j=j+100;
		
		}
		
	}

}
