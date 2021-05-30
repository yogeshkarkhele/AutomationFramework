package com.demo.testsuite;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.demo.common.BaseTestCase;
import com.demo.common.BaseTestPage;
import com.demo.pages.MouseHoverPage;

public class MouseHoveTest extends BaseTestCase {

	@Test
	public void mouseHoverTest() throws AWTException {

		MouseHoverPage houseHoverPage = new MouseHoverPage(driver);

		//WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
		//webDriverWait.until(ExpectedConditions.visibilityOf(houseHoverPage.linkClickMe));
		BaseTestPage.WaitforElementToBeVisible(houseHoverPage.linkClickMe);

		//Actions actions = new Actions(driver);
		//actions.moveToElement(houseHoverPage.linkClickMe).perform();
		Point p = houseHoverPage.linkClickMe.getLocation();
		int x = p.getX();
		int y = p.getY();
		Dimension d = houseHoverPage.linkClickMe.getSize();
		int h = d.getHeight();
		int w = d.getWidth();
		//Dimension i= houseHoverPage.linkClickMe.getSize();
		//	int x =  (i.getWidth()/4)+20;
		//int y = (i.getHeight()/10)+50;

		Robot r = new Robot();
		r.mouseMove(x + (w/2), y+(h/2)+120);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);

		assertTrue(houseHoverPage.verifyToolTip());

	}

}
