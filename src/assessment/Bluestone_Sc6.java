package assessment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone_Sc6 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		//driver.manage().deleteAllCookies();
		driver.get("https://www.bluestone.com");
		Thread.sleep(2000);
		WebElement rings=driver.findElement(By.xpath("//a[@title='Rings']"));
		Actions act=new Actions(driver);
		act.moveToElement(rings);
		act.perform();
		WebElement drings=driver.findElement(By.xpath("//a[@title='Diamond Rings']"));
		Thread.sleep(2000);
		drings.click();
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='new-price']"));
		System.out.println(price.size());
		ArrayList<Integer> lst=new ArrayList<>();
		//Passing driver to actions class object
		for (int i = 1; i < price.size(); i++) {
			String str = price.get(i).getText();	
			//System.out.println(str);
			String nstr="";
			System.out.println(nstr=str.substring(3).trim());
			
		}
		System.out.println(lst);
		//IntegerParseInt(nstr)
		
		act.moveToElement(driver.findElement(By.xpath("//span[@class='view-by-wrap title style-outline i-right']"))).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Price Low to High ']")).click();
		System.out.println("Sorted Price: ");
		
		List<WebElement> sortedprice = driver.findElements(By.xpath("//span[@class='new-price']"));
		for (int i = 1; i < sortedprice.size(); i++) {
			String str1 = sortedprice.get(i).getText();	
			//System.out.println(str1);
		
			String nstr1="";
			nstr1=str1.substring(3).replace(",","").trim();
			System.out.println(nstr1);
			lst.add(Integer.parseInt(nstr1));
			
		}
		System.out.println(lst);
		
		int min=lst.get(0);
		int cnt=0;
		
		for(int j=1;j<lst.size();j++){
		if(min<=lst.get(j)){
		   min=lst.get(j);
		   cnt=cnt+1;
		}
		else{
			System.out.println("Not Sorted");
		}
		}
		
		if(cnt==lst.size()-1){
			System.out.println("List is Sorted");
		}
	
		driver.quit();
		
	}



}
