package locator;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Css Selector Syntax - tagname[attribute='value'];

public class ByLocatorCssSelector {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("manager");
		
//		driver.findElement(By.cssSelector("input[class='initial']")).click();
//		Thread.sleep(2000);
//		System.out.println(driver.getTitle());	
		
	
		
//		int l=loc.length();
//		System.out.println(loc.substring(0,l/2));
		
		
		driver.findElement(By.linkText("View License")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		Set<String> s=driver.getWindowHandles();
			
		//s.remove(0);
		System.out.println(s);
		for(String t:s){
		//if(driver.getTitle().equalsIgnoreCase("actiTIME License Agreement")){
			driver.switchTo().window(t);
		}
		

		List<WebElement> lst = driver.findElements(By.tagName("h2"));
		for(int i=0;i<lst.size();i++){
			System.out.println(lst.get(i).getText());
		}
		
		driver.quit();
		
	
	}

}
