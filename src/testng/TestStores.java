package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestStores {
	
	@Test
	public void getStoreMaps(){
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		HomePage hp=new HomePage(driver);
		hp.clickLocateStores();
		System.out.println("Successfully navigated to stores");
		
		
	}

}
