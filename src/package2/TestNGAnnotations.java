package package2;

import org.testng.annotations.*;

public class TestNGAnnotations {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("After Suite");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("After Class");
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("After Test");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("After Method");
	}
	
	@Test
	public void testMethod1() {
		System.out.println("Test Method1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("Test Method2");
	}
	
	
	
	
	
	

}
