package assessment;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountOccurrence {

	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Nagma%20Noshin%20Shaik/Downloads/selenium/Neha_Software_Installation/Java%20Programs/TSelenium/html/Ht1.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		WebElement sel = driver.findElement(By.id("mlb"));
		
		Select sc=new Select(sel);
		
		List<WebElement> opt = sc.getOptions();
			
		Map<String,Integer> mp=new HashMap<>();
		
		for(WebElement w:opt){
			
			if(mp.containsKey(w.getText())){
				
				mp.put(w.getText(), mp.get(w.getText())+1);	
			}
			else{
				
				mp.put(w.getText(), 1);	
			}	
		}
		
		System.out.println(mp);
		
	}

}
