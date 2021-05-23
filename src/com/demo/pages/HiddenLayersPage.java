package com.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HiddenLayersPage {
	
	public HiddenLayersPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

}
