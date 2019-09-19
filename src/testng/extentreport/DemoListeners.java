package testng.extentreport;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(DemoITest.class)
public class DemoListeners {
	
	@Test
	public void TestA(){
		System.out.println("TestA");
	}
	
	@Test
	public void TestB(){
		System.out.println("TestB");
		Assert.assertFalse(true);
	}
	
	@Test(dependsOnMethods={"TestB"})
	public void TestC(){
		System.out.println("TestC");
	}
	
	@Test
	public void TestD(){
		System.out.println("TestD");
		Assert.assertFalse(true);
	}
	
	@Test
	public void TestE(){
		System.out.println("TestE");
	}

}
