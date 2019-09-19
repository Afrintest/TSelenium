package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args){

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/sortable/");
		
		Actions act=new Actions(driver);
		
		driver.switchTo().frame(0);
		
		//act.doubleClick(driver.findElement(By.xpath("(//li[@class='ui-state-default ui-sortable-handle'])[2]")));
		WebElement src = driver.findElement(By.xpath("(//li[@class='ui-state-default ui-sortable-handle'])[2]"));
		//WebElement tar=driver.findElement(By.xpath("(//li[@class='ui-state-default ui-sortable-handle'])[3]"));
		act.clickAndHold(src).moveByOffset(0,100).release().perform();
		//act.dragAndDrop(src,tar).perform();
		
	}

}
