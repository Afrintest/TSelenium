package assessment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartIphone1 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("apple iphone");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
		List<WebElement> ele1 = driver.findElements(By.xpath("//div[@class='_3auQ3N _2GcJzG']"));
		List<WebElement> ele2 = driver.findElements(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));
		List<WebElement> ele3 = driver.findElements(By.xpath("//div[@class='_3MCpsc']"));
		
		for(int i=0;i<5;i++){
					
			String str=ele.get(i).getText();
			System.out.println(i+" Name: "+str);
			
			String str1=ele1.get(i).getText();
			System.out.println(i+" Actual price: "+ 	str1);
			
			String str2=ele2.get(i).getText();
			System.out.println(i+" Dicount Price: "+str2);
			
			String str3=ele3.get(i).getText();
			System.out.println(i+" EMI: "+str3);
			
		}
		

	}

}
