package intro;


import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;

public class Wait {

	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/Nagma%20Noshin%20Shaik/Downloads/wait.html");
		FluentWait<WebDriver> fwait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(5))
				.pollingEvery(Duration.ofMillis(200))
				.ignoring(NoSuchElementException.class);
		
		WebElement tb1=driver.findElement(By.id("tb1"));
		tb1.sendKeys("Hello");
		
		fwait.until(new ExpectedCondition<Boolean>(){

			@Override
			public Boolean apply(WebDriver d) {
				if(d.findElement(By.id("tb1")).getAttribute("value").equals("Hello"))
					return true;
				return null;
			}
		

		});
		
		WebElement tb2=driver.findElement(By.id("tb2"));
		tb2.sendKeys("confirmed");
	

	}

}
