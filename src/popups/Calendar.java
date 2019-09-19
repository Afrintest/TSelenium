package popups;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calendar {

	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		WebElement fromLoc = driver.findElement(By.xpath("(//input[@class='db'])[1]"));
		fromLoc.sendKeys("Bang");
		fromLoc.sendKeys(Keys.ENTER);
		WebElement toLoc = driver.findElement(By.xpath("(//input[@class='db'])[2]"));
		toLoc.sendKeys("Kada");
		toLoc.sendKeys(Keys.ENTER);
//		List<WebElement> tolst = driver.findElements(By.xpath("//ul[@class='autoFill']"));
//		Thread.sleep(2000);
//		for (WebElement we : tolst) {
//			if (we.getText().equals("Kadapa")) {
//				we.click();
//			}
//		}
//		
//		Thread.sleep(2000);	
		driver.findElement(By.xpath("//label[@class='db text-trans-uc']")).click();
		LocalDateTime day=LocalDateTime.now();
		
		int date = day.getDayOfMonth();
		System.out.println("Date: "+date);
		
		int year = day.getYear();
		System.out.println("Year: "+year);
		
		int mon=day.getMonthValue();
		System.out.println("Month: "+mon);
				
		String strdate = Integer.toString(date);
		String stryear=Integer.toString(year);
		String mon1=Integer.toString(mon);
		String strmon=mon1.charAt(0)+mon1.toLowerCase().substring(1);
		
		String montitle=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
//		
//		if(montitle.contains(strmon) && montitle.contains(stryear)){
//			driver.findElement(By.xpath("//td[]"))
//		}
		
		
		

	}

}
