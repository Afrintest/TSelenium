package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args){

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions act=new Actions(driver);
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(frame);
		
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement tar = driver.findElement(By.id("droppable"));
		String cls=tar.getAttribute("class");
		act.dragAndDrop(src, tar).perform();
		
		String textchanged=driver.findElement(By.id("droppable")).getText();
		String cls1=driver.findElement(By.id("droppable")).getAttribute("class");
		System.out.println(textchanged);
		
		if(!cls.equals(cls1)){
			System.out.println("Class name is changed");
		}
		else{
			System.out.println("class name is not changed");
		}
		
		driver.switchTo().defaultContent();
		
		System.out.println(driver.findElement(By.xpath("//h1[@class='entry-title']")).getText());
		
		
		

	}

}
