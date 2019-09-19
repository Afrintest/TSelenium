package actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiAllcustRobot {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();

		Thread.sleep(2000);
//		WebDriverWait wait=new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("preInsertedTransformedMoireId"))));
		
		driver.findElement(By.xpath("//div[text()='TASKS']")).click();

		WebElement f = driver.findElement(By.xpath("//div[@class='tasksTable']"));

		int x = f.getLocation().x;
		int y = f.getLocation().y;
		System.out.println("X: " + x);
		System.out.println("Y: " + y);

		Robot rb = new Robot();

		rb.mouseMove(x + 400, y + 400);
		
		rb.mouseWheel(30);
		Thread.sleep(2000);
		rb.mouseWheel(40);
		
		
		
		
		List<WebElement> lst = driver.findElements(By.xpath("//div[@class='title ellipsis']"));
		 Thread.sleep(4000);
		 
		 for(int i=0;i<lst.size();i++){
			 if(!lst.get(i).getAttribute("title").equalsIgnoreCase("")){
		 System.out.println(i+": "+(lst.get(i).getAttribute("title")));
			 }
		 }

	}

}
