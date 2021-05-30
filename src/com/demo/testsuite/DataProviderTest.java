package com.demo.testsuite;

import org.testng.annotations.Test;

import com.demo.common.BaseTestCase;

public class DataProviderTest extends BaseTestCase {
	
	@Test(dataProvider = "SearchProvider")
	public void TestDP(String name, String country,String pincode) {
		
		System.out.println("Name--->"+ name);
		System.out.println("country--->"+ country);
		System.out.println("country--->"+ pincode);
		
		
	}



}
