package com.demo.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.common.BaseTestCase;

public class MouseHoverPage {

	public MouseHoverPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@title='Click me']")
	public WebElement linkClickMe;

	
	public boolean verifyToolTip() {

		List<WebElement> elements = BaseTestCase.driver.findElements(By.xpath("//a[@title='Active Link']"));
		if(elements.size()>0) {
			System.out.println("Tootip is displayed");
			return true;
		}
		else {
			System.out.println("Failed to display Tooltip");
			return false;
		}
	}

	

}
