package com.demo.testsuite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.demo.common.BaseTestCase;

public class FindElementsUSe extends BaseTestCase{
	
	@Test
	public void test1() throws InterruptedException {
		List<WebElement> listOfWebelemts=driver.findElements(By.xpath("//li//a[not(contains(@class,'nav'))]"));
		for (WebElement webElement : listOfWebelemts) {
			System.out.println("Link--->"+webElement.getText());
		}
		
		for (int i=0; i<listOfWebelemts.size();i++) {
			System.out.println("--->"+listOfWebelemts.get(i).getText());
		}
	}

}
