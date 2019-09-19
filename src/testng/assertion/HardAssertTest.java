package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertTest {
		
		@Test
		public void verifyTitle(){
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();	
			driver.get("http://localhost/login.do");
		
			Assert.assertEquals(driver.getTitle(), "actiTIME - Login");
			System.out.println(driver.getTitle());
			driver.findElement(By.name("username")).sendKeys("admin");
						
		}

}
