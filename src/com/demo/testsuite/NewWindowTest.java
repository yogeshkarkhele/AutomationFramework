package com.demo.testsuite;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.demo.common.BaseTestCase;

public class NewWindowTest extends BaseTestCase {

	@Test
	public void windowtest() {

		String currentWindow = driver.getWindowHandle();//1
		System.out.println("Parent Window--> "+currentWindow);
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		Set<String> windowHandles=driver.getWindowHandles();//2

		for (String string : windowHandles) {
			System.out.println("---->"+string);
			if(!(string.equals(currentWindow))){
				driver.switchTo().window(string);
			}
		}
		//driver.findElement(By.xpath("//button[@class='btn btn-primary']")).getCssValue("background-color").equals("#00579a")

		System.out.println("------->"+ driver.findElement(By.xpath("//strong[text()='BLACK LIVES MATTER']")).getText());
		driver.close();
		driver.switchTo().window(currentWindow);
		System.out.println("--->"+ driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).getText());


	}

}
