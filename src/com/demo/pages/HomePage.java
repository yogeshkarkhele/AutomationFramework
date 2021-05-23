package com.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "title")
	public WebElement pageHeader;

	@FindBy(xpath = "//a[text()='Dynamic ID']")
	public WebElement linkDynamicID;
	
	@FindBy(xpath = "//a[text()='Class Attribute']")
	public WebElement linkClassAttribute;
	
	
	@FindBy(xpath = "//a[text()='Hidden Layers']")
	public WebElement linkHiddenLayers;
	
	
	public void click(WebElement webElement) {
		webElement.click();
	}	
}
