package popups;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException {
		
		LocalDateTime ldt = LocalDateTime.now();
		
		System.out.println(ldt);
		
		String dti=ldt.toString().replaceAll(":" ,"");
		
		String dt=dti.replaceAll("-", "").replace(".", "");
		
		System.out.println(dt);
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
	
		WebElement img=driver.findElement(By.xpath("//img[@src='/img/default/login/timer.png?hash=1389259578']"));
				
		File src=img.getScreenshotAs(OutputType.FILE);
		File dest=new File("./photo/"+dt+".png");
		System.out.println(dest);
		FileUtils.copyFile(src , dest);
		
	}

}
