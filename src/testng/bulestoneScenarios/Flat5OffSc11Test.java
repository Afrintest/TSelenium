package testng.bulestoneScenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flat5OffSc11Test {
	
	WebDriver driver;
	
	@Test
	void displayOfFlat5Percent() throws InterruptedException{
	
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.bluestone.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	
	//Mouseover on offers
	BluestoneHomePage bshp=new BluestoneHomePage(driver);
	//Parent window
	//String parent=driver.getWindowHandle();
	bshp.mouseOverOffers();
	
	//Click on flat5%off from offers
	bshp.clickFlat5Off();
	
	//To check 5% off Offers
	OffersPage op=new OffersPage(driver);
	op.elementsToVerify();
	
	
	
	driver.navigate().back();
	//mouse over on offers
	bshp.mouseOverOffers();
	//click on flat15%off
	bshp.clickFlat15Off();
	//To check 15%off Offers
	OffersPage op1=new OffersPage(driver);
	op1.elementsToVerify();
	
	}
}
