package testng.extentreport;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		ExtentHtmlReporter htmlrep = new ExtentHtmlReporter(new File("./reports/TestListener.html"));
		ExtentReports rep = new ExtentReports();
		rep.attachReporter(htmlrep);
		ExtentTest test = rep.createTest("Sample Test");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		String atitle=driver.getTitle();
		String extitle="actiTIME - Login";

		Assert.assertTrue(atitle.equals(extitle), "titles are matched");
		
		rep.flush();
		
		driver.close();
		
//		File directory=new File("images");
//		File[] img = directory.listFiles();
//		for(File f:img){
//			if(f.isFile()){
//		test.addScreenCaptureFromPath(f.getAbsolutePath());
//		System.out.println(f.getAbsolutePath());
//			}
//			}

	}

}
