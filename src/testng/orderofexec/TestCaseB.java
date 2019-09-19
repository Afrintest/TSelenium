package testng.orderofexec;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCaseB extends BaseTest {

	@Test(groups={"Smoke"})
	public void test1() {
		Reporter.log("Test B1"+Thread.currentThread().getName(), true);
	}

	@Test(groups={"reg"})
	public void test2() {
		Reporter.log("Test B2"+Thread.currentThread().getName(), true);
	}

	@Test(groups={"reg","Smoke"})
	public void test3() {
		System.out.println("Test B3"+Thread.currentThread().getName());
	}
	
	@Test(groups={"Smoke","reg"})
	public void test4() {
		Reporter.log("Test B4"+Thread.currentThread().getName(), true);
	}
	
	@Test(groups={"int"})
	public void test5() {
		Reporter.log("Test B6"+Thread.currentThread().getName(), true);
	}
	
	@Test
	public void test6() {
		Reporter.log("Test B7"+Thread.currentThread().getName(), true);
	}

}
