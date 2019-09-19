package assessment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetSystemInfo {
	
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notificatios");
		opt.addArguments("--start-maximized");
		
		WebDriver driver=new ChromeDriver(opt);
		driver.get("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("preInsertedTransformedMoireId"))));
		
		
		driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_support']")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='About your actiTIME']")))).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//td[@id='systemInfoTab']")))).click();
		
		for(int i=1;i<5;i++){
		
		String txt = driver.findElement(By.xpath("//table[@id='aboutSystemInfoTable']/tbody/tr["+i+"]")).getText();
		
		System.out.println(txt);
		
		}
		
		
		
	}

}
