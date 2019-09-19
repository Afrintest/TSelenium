package assessment;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckSorting {

	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Nagma%20Noshin%20Shaik/Downloads/selenium/Neha_Software_Installation/Java%20Programs/TSelenium/html/Ht1.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		WebElement sel = driver.findElement(By.id("mlb"));
		
		Select sc=new Select(sel);
		
		List<WebElement> opt = sc.getOptions();
		
		List<String> str=new LinkedList<>();
		
		for(WebElement we:opt){
			String st=we.getText();
			str.add(st);
		}
		
		System.out.println(str);
		
		Collections.sort(str);
		
		List<String> str1=new LinkedList<>();
		
		for(int i=0;i<str.size();i++){
			
			String k=str.get(i);
			
			str1.add(k);
			
		}
		
		System.out.println(str1);
		
		
		
		if(str.get(0).equalsIgnoreCase(str1.get(0))){
			System.out.println("List is not Sorted");

		}
		else{
			System.out.println("List is Sorted");
		}
			
		

	}

}
