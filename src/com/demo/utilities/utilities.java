package com.demo.utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class utilities {
	public static void clickByActionClass(WebDriver driver,WebElement webElement) {
		Actions actions = new Actions(driver);
		actions.click(webElement).build().perform();
	}
	
	public static void dragAndDropByActionClass(WebDriver driver,WebElement webElement,WebElement webElement1) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(webElement, webElement1);
	}
	
	public static void clickByJS(WebDriver driver,WebElement webElement) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", webElement);
	}
	
	public static void ScrollInViewByJS(WebDriver driver,WebElement webElement) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoViewIfNeeded(true);", webElement);

	}
	
	public static void alertAccept(WebDriver driver) {
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	
}
