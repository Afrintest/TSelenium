package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestStoreTitle {
	
	@Test
	public void verifyTitle(){
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		String etitle="Online Jewellery Shopping Store India | Buy Gold and Diamond jewellery with Latest Designs 2019 | BlueStone.com";
		HomePage hp=new HomePage(driver);
		hp.verifyPageTitle(etitle);
		
		
		
	}

}

