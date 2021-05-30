package com.demo.testsuite;

import org.testng.annotations.Test;

import com.demo.common.BaseTestCase;
import com.demo.pages.HomePage_ThoamsCook;

public class ThomasCookTest extends BaseTestCase{
	
	@Test
	public void Test1() throws InterruptedException {
		
		HomePage_ThoamsCook homePage_ThoamsCook = new HomePage_ThoamsCook(driver);
		homePage_ThoamsCook.selectMenuOptionNew("Holidays", "Bike Trip");
		System.out.println("----->"+ driver.getTitle());
		
		
		
	}

}
