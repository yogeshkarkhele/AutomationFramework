package com.demo.pages;

import java.awt.AWTException;
import java.awt.Robot;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.common.BaseTestCase;

public class HomePage_ThoamsCook {
	
	public HomePage_ThoamsCook(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//body[contains(@class,'holiday_landing_page_static')]")
	public WebElement pageHeader;
	
	@FindBy(xpath = "")
	public WebElement menu;
	
	
	//method for menu and submenu
	public void selectMenuOption(String mainMenu, String subMenu) throws InterruptedException {
		Thread.sleep(10000);
		BaseTestCase.driver.findElement(By.xpath("//a[contains(@class,'submenu_header_thomas')][normalize-space()='"+mainMenu+"']")).click();
		Thread.sleep(10000);
		BaseTestCase.driver.findElement(By.xpath("//a[contains(@class,'submenu_header_thomas')][normalize-space()='"+mainMenu+"']")).click();
		Thread.sleep(10000);
		BaseTestCase.driver.findElement(By.xpath("//a[normalize-space()='"+subMenu+"']")).click();
	}
	
	//method for menu and submenu
	public void selectMenuOptionNew(String mainMenu, String subMenu) throws InterruptedException {
		Thread.sleep(5000);

		mouseHoverByActionsClass(BaseTestCase.driver, mainMenu);
		Thread.sleep(3000);
		BaseTestCase.driver.findElement(By.xpath("//a[normalize-space()='"+subMenu+"']")).click();
	}
	
	public void mouseHoverByActionsClass(WebDriver driver,String name) {
		Actions actions =new Actions(driver);
		actions.moveToElement(menuLocator(name));
	}
	
	public WebElement menuLocator(String name) {
		return BaseTestCase.driver.findElement(By.xpath("//a[contains(@class,'submenu_header_thomas')][normalize-space()='"+name+"']"));
	}
	//Method for only Menu
	
	
	
	
	
	
	//Home---> Travel Insurance--->Asia Travel Insurance
	//Dynamic locator for Travel Insurance Benefits: How we can take care of you?
	
	

}
