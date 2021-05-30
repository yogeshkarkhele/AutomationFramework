package com.demo.testsuite;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demo.Listener.TestListerner;
import com.demo.common.BaseTestCase;
import com.demo.pages.ClassAttributePage;

@Listeners(TestListerner.class)
public class ClassAttributeTest extends BaseTestCase{

	@Test
	public void test1() throws InterruptedException {
		ClassAttributePage classAttributePage = new ClassAttributePage(driver);
		classAttributePage.invoke();
		classAttributePage.VerifyPageHeader();
		//assertTrue(classAttributePage.pageHeader.getText().equals("Class Attrib"));
		assertTrue(driver.getTitle().equals("Class     Attribute"));	
	}

	@Test
	public void test2() throws InterruptedException {
		ClassAttributePage classAttributePage = new ClassAttributePage(driver);
		classAttributePage.invoke();
		assertTrue(classAttributePage.buttonSuccess.isDisplayed(),"Button success is displayed");
	}
	
	@Test(dataProvider = "SearchProvider")
	public void testDataProvider(String name, String country,String pincode) throws InterruptedException {
		
		System.out.println(name+"==="+country);
	}
}
