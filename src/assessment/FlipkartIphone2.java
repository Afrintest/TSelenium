package assessment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartIphone2 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"))
				.sendKeys("apple iphone");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);

		for (int i = 1; i < 6; i++) {

			WebElement web = driver.findElement(By.xpath("(//div[@class='_3wU53n'])[" + i + "]"));

			String str = web.getText();

			System.out.println(i + " Name: " + str);

			WebElement web1 = driver.findElement(By.xpath("(//div[@class='_3auQ3N _2GcJzG'])[" + i + "]"));

			String str1 = web1.getText();
			System.out.println(i + " Actual price: " + str1);

			WebElement web2 = driver.findElement(By.xpath("(//div[@class='_1vC4OE _2rQ-NK'])[" + i + "]"));

			String str2 = web2.getText();
			System.out.println(i + " Discount price: " + str2);

			WebElement web3 = driver.findElement(By.xpath("(//div[@class='_3MCpsc'])[" + i + "]"));

			String str3 = web3.getText();
			System.out.println(i + "EMI: " + str3);

		}

	}

}
