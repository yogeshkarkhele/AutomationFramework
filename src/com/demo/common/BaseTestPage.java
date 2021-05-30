package com.demo.common;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTestPage {

	public void WaitforElementToBePresent(By by) {
		WebDriverWait webDriverWait = new WebDriverWait(BaseTestCase.driver, 20);
		webDriverWait.until(ExpectedConditions.numberOfElementsToBe(by, 1));
	}
	
	public static void WaitforElementToBeVisible(WebElement webElement) {
		WebDriverWait webDriverWait = new WebDriverWait(BaseTestCase.driver, 20);
		webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
	}
	
	public void WaitforElementToBeClickable(WebElement webElement) {
		WebDriverWait webDriverWait = new WebDriverWait(BaseTestCase.driver, 20);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement));
	}
	
	public void WaitforElementToBeVisible(By by) {
		WebDriverWait webDriverWait = new WebDriverWait(BaseTestCase.driver, 20);
		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public void WaitforPageToBePresent(By by) {
		FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(BaseTestCase.driver)
				.withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(Exception.class);
		wait1.until(ExpectedConditions.numberOfElementsToBe(by, 1));
	}
}
