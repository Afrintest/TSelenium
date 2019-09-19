package popups;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws IOException  {
		
		LocalDateTime ldt = LocalDateTime.now();
		
		System.out.println(ldt);
		
		String dti=ldt.toString().replaceAll(":" ,"");
		
		String dt=dti.replaceAll("-", "").replace(".", "");
		
		System.out.println(dt);
			
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./photo/"+dt+".png");
		FileUtils.copyFile(src , dest);
		
	}

}
