package com.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
*
*<img src="D://Users//ykarkhele//MyWorkspaceTest//AutomationFramework//screenshot//DynamicIDPage.png">
*
**/

public class DynamicIDPage {
	
	public DynamicIDPage(){
	}
	
	public DynamicIDPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h3[text()='Dynamic ID']")
	public WebElement pageHeader;
	
	@FindBy(xpath = "//button[text()='Button with Dynamic ID']")
	public WebElement buttonButtonWithDynamicId;
	
	public void invoke(WebDriver driver) {
		
		HomePage homePage = new HomePage(driver);
		homePage.linkDynamicID.click();
		
	}

}
