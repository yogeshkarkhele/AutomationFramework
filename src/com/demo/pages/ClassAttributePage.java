package com.demo.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.demo.common.BaseTestCase;
import com.demo.common.BaseTestPage;
import com.demo.utilities.ExtentReportManager;

public class ClassAttributePage extends BaseTestPage{


	public ClassAttributePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h3[text()='Class Attribute']")
	public WebElement pageHeader;

	By header = By.xpath("//h3[text()='Class Attribute']");

	@FindBy(xpath = "//button[contains(@class,'btn-success')]")
	public WebElement buttonSuccess;

	public void invoke() {
		HomePage homePage = new HomePage(BaseTestCase.driver);
		homePage.linkClassAttribute.click();
		WaitforPageToBePresent(header);
		ExtentReportManager.extentTest.get().log(Status.INFO, "Invoked ClassAttributePage");
		
	}
	
	public void VerifyPageHeader() {
		ClassAttributePage classAttributePage = new ClassAttributePage(BaseTestCase.driver);
		assertTrue(classAttributePage.pageHeader.getText().equals("Class Attribute"));
		ExtentReportManager.extentTest.get().log(Status.PASS, "Expected header -> Class Attribute :: Actual header "+ classAttributePage.pageHeader.getText());
		
	}
}
