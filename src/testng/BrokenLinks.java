package testng;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	
	public static void main(String[] args) throws IOException {
		
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://qspiders.com/");
	
	 List<WebElement> links = driver.findElements(By.tagName("a"));
	 
	 for(int i=0;i<10;i++){
		 
		 String link=links.get(i).getAttribute("href");
		 System.out.println(link);
		 URL url=new URL(link);
		 
		 HttpURLConnection connection=(HttpURLConnection)url.openConnection();
		 
		 int respcode=connection.getResponseCode();
		 
		 if(respcode==200){
			 System.out.println(respcode);
			 System.out.println(connection.getResponseMessage());
			 System.out.println("Link is Active");
		 }
		 else{
			 System.out.println(respcode);
			 System.out.println(connection.getResponseMessage());
			 System.out.println("Link is Active");
			 
		 }
		 
		 
	 }
	
}

}
