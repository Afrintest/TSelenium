package popups;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiUnameImg {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		
		
		
		WebElement img=driver.findElement(By.xpath("//img[@src='/img/default/login/timer.png?hash=1389259578']"));
		Thread.sleep(4000);
		File src = img.getScreenshotAs(OutputType.FILE);
		File dest=new File("./photo/img.png");
		FileUtils.copyFile(src, dest);
		
		

	}

}
