package testng.orderofexec;

import org.testng.annotations.Test;

public class TestCasesA {
	
	@Test 
	public void testd(){
		System.out.println("Test Ad");
	}
	
	@Test
	
	public void testb(){
		System.out.println("Test Ab");
		//Reporter.log("print the output",true) - 
	}
	
	@Test
	public void testc(){
		System.out.println("Test Ac");
	}

}
