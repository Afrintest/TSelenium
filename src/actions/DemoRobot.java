package actions;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoRobot {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws AWTException, InterruptedException{

		WebDriver driver = new ChromeDriver();
		//driver.get("https://jqueryui.com/droppable/");
		Robot r=new Robot();
		Thread.sleep(1000);
		r.mouseMove(500, 500);
		
		

	}

}
