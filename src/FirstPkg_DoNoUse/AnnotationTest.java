package FirstPkg_DoNoUse;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class AnnotationTest {
	//@BeforeClass
	public void beforeClass() {
		System.out.println("---->Inside beforeClass");
	}
	
	//@AfterClass
	public void afterClass() {
		System.out.println("--->Inside afterClass");
	}

	
	//@BeforeMethod
	public void beforeTest() {
		System.out.println("--->Inside @BeforeMethod");
	}

	
	//@AfterMethod
	public void afterTest() {
		System.out.println("--->Inside afterTest");
	}

	//@Test(priority = 1,dependsOnGroups = "Smoke")
	@Test
	public void testA() {
		System.out.println("--->Inside test A");
	}
	
	//@Test(groups = "Smoke")
	@Test
	public void testE() {
		System.out.println("--->Inside test B");
		AssertJUnit.assertEquals("abc", "xyz");
	}
	
	@Test(dependsOnMethods = "testG")
	public void testF() {
		System.out.println("--->Inside test B");
	}
	
	@Test
	public void testG() {
		System.out.println("--->Inside test B");
		AssertJUnit.assertEquals("abc", "xyz");
	}
	
	//@Test(description = "This is test C",timeOut = 3000,dependsOnMethods = "testB",enabled = false,groups = "Smoke")
	@Test
	public void testC() {
		System.out.println("--->Inside test A");
	}
	
}
