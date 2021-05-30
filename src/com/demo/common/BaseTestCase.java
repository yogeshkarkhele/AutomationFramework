package com.demo.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.demo.core.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestCase extends DataProvider{

	public static WebDriver driver;

	@BeforeMethod
	public void preStep() throws InterruptedException {
		if(SupportMethods.getPropertyValue("browser").equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			options.addArguments("disable-geolocation");
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
		}

		else if(SupportMethods.getPropertyValue("browser").equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(SupportMethods.getPropertyValue("url"));
		Thread.sleep(3000);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
