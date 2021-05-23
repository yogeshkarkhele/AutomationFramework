package com.demo.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ResourcesPage {
	
	public ResourcesPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	By links = By.xpath("//li//a[not(contains(@class,'nav'))]");
	
	public void getLinks(WebDriver driver) {
	  List<WebElement> list = driver.findElements(links);
	  for (WebElement webElement : list) {
			System.out.println("Link--->"+webElement.getText());
		}
	}
}
