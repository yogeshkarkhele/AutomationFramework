package com.demo.testsuite;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.demo.common.BaseTestCase;

public class AlertTest extends BaseTestCase{

	@Test
	public void testAlertClass() throws InterruptedException{
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
		
		Thread.sleep(4000);
		Alert a= driver.switchTo().alert();
		Thread.sleep(2000);
		a.sendKeys("This is demo");
		Thread.sleep(3000);
		System.out.println(a.getText());
		a.accept();
		Thread.sleep(7000);
		
	}
	
}
