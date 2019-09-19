package locator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.xpath("./html/body/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr/td/div/img"));
		String s=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/nobr")).getText();
		System.out.println(s);
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/nobr/a")).click();
		Thread.sleep(2000);
		Set<String> w=driver.getWindowHandles();
		for(String win:w){
			driver.switchTo().window(win);
		}
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

}
