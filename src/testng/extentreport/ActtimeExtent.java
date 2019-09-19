package testng.extentreport;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(DemoITest.class)
public class ActtimeExtent {

	WebDriver driver;
	static int i = 0;

	@AfterMethod
	public void afterMethod(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			TakesScreenshot shot = (TakesScreenshot) driver;
			File src = shot.getScreenshotAs(OutputType.FILE);
			File desc = new File("./images/Test" + (i++) + ".png");
			try {
				FileUtils.copyFile(src, desc);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	@Test
	public void ActiTimeHome() {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		Reporter.log("ActiTime page is opened", true);

		Assert.assertTrue(driver.getTitle().equals("actiTIME -  Enter Time-T"), "Titles are not matched");

	}

	@Test
	public void login() throws InterruptedException {

		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		Thread.sleep(2000);

		Assert.assertFalse(driver.getTitle().equals("actiTIME -  Enter Time-T"), "Successful Login");

		// test.log(Status.PASS, "Logged in successfully");
	}

}
