package testng.actitime;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;


 class BaseactiTest {
	
	WebDriver driver;
	
	BaseactiTest(String browser){
		if(browser.equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();	
		}
		else{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");	
		driver = new FirefoxDriver();
		System.out.println("Thread: "+Thread.currentThread().getName());
		}
	}
	
	@BeforeClass
	public void beforeClass(){	
		driver.get("http://localhost/login.do");
		Reporter.log("ActiTime page is opened",true);
	}

	
	@AfterClass
	public void afterClass(){
		driver.quit();
		Reporter.log("close browser",true);
	}

}
