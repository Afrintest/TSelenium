package testng.assertion;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
	
	@Test
	public void verifyTitle(){
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("http://localhost/login.do");
		
		SoftAssert sassert=new SoftAssert();
		sassert.assertEquals(driver.getTitle(), "actiTIME - Log");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("username")).sendKeys("admin");
		
		sassert.assertAll();
		
	}

}
