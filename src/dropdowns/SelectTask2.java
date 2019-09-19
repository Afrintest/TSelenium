package dropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTask2 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args){

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Nagma%20Noshin%20Shaik/Downloads/selenium/Neha_Software_Installation/Java%20Programs/TSelenium/html/Ht.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement drp = driver.findElement(By.id("mlb"));
		
		Select sc=new Select(drp);
		
		List<WebElement> opt = sc.getOptions();
		
		for(int i=0;i<opt.size();i++){
			System.out.println(opt.get(i).getText());
		}

	}

}
