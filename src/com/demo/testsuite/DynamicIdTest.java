package com.demo.testsuite;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demo.Listener.TestListerner;
import com.demo.common.BaseTestCase;
import com.demo.pages.DynamicIDPage;
import com.demo.pages.HomePage;

@Listeners(TestListerner.class)
public class DynamicIdTest extends BaseTestCase{
	
	@Test
	public void test1() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		homePage.click(homePage.linkDynamicID);
		DynamicIDPage dynamicIDPage = new DynamicIDPage(driver);
		AssertJUnit.assertEquals(dynamicIDPage.pageHeader.getText(), "Dynamic ID");
		//homePage.pageHeader.getText().equals("Dynamic ID");
		AssertJUnit.assertTrue(dynamicIDPage.pageHeader.getText().equals("Dynamic ID"));
	}
	
	//@Test
	@Test
	public void test2() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[text()='Dynamic ID']")).click();
		Thread.sleep(3000);
		System.out.println("Present of Dynamic Id button-->"+ driver.findElement(By.xpath("//button[text()='Button with Dynamic ID']")).isDisplayed());
		//System.out.println("Expcted-->Dynamic ID--"+driver.getTitle());
	}
}
