package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args){

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Nagma%20Noshin%20Shaik/Downloads/dbc.html");
		
		Actions act=new Actions(driver);
		
		WebElement ele=driver.findElement(By.xpath("//p[text()='Double click this paragraph to trigger a function']"));
		
		act.doubleClick(ele).perform();
		
		System.out.println(driver.findElement(By.id("demo")).getText());

	}

}
