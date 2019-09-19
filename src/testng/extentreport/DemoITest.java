package testng.extentreport;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class DemoITest implements ITestListener {
	ExtentHtmlReporter htmlrep;
	ExtentReports rep;
	ExtentTest test;
	public WebDriver driver;
	int status;

	@Override
	public void onTestStart(ITestResult result) {
		test = rep.createTest("ActiTime login");

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "passed the test" + result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Failed the test" + result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "skipped the test" + result.getName());

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {

		htmlrep = new ExtentHtmlReporter(new File("./reports/TestListener.html"));

		rep = new ExtentReports();
		rep.attachReporter(htmlrep);

	}

	@Override
	public void onFinish(ITestContext context) {
		File directory = new File("images");
		File[] img = directory.listFiles();
		for (File f : img) {
			if (f.isFile()) {
				try {
					String path = f.getAbsolutePath();
					test.addScreenCaptureFromPath(path);

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		rep.flush();

	}
}
