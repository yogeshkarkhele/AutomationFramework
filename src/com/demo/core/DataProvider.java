package com.demo.core;

public class DataProvider {
	
	@org.testng.annotations.DataProvider(name="SearchProvider")
	    public static Object[][] getDataFromDataprovider(){
	        return new Object[][] {
	            { "Yogesh", "India","400709" },
	            { "Krishna", "UK", "123456" },
	            { "Bhupesh", "USA" ,"000000"}
	        };  
	}
}
