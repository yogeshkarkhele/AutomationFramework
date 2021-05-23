package com.demo.Listener;

import java.io.IOException;
import java.util.Arrays;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.demo.common.BaseTestCase;
import com.demo.utilities.ExtentReportManager;

public class TestListerner implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		ExtentTest test = ExtentReportManager.extentReport
				.createTest(result.getTestClass().getName() + " :: " + result.getMethod().getMethodName());
		ExtentReportManager.extentTest.set(test);
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		if (result.getParameters().length > 0) {
			String paramName = Arrays.asList(result.getParameters()).toString();
			ExtentReportManager.extentTest.get().log(Status.INFO, "Test Data: " + paramName);
			ExtentReportManager.extentTest.get().log(Status.PASS, MarkupHelper
					.createLabel(result.getMethod().getMethodName() + " Test Case PASSED", ExtentColor.GREEN));
		} else {
			ExtentReportManager.extentTest.get().log(Status.PASS, MarkupHelper
					.createLabel(result.getMethod().getMethodName() + " Test Case PASSED", ExtentColor.GREEN));
		}
		
	}

	@Override
	public void onTestFailure(ITestResult result) {

		String methodName = result.getMethod().getMethodName();
		// String exceptionMessage =
		// Arrays.toString(result.getThrowable().getStackTrace());
		ExtentReportManager.extentTest.get().log(Status.FAIL,
				MarkupHelper.createLabel(methodName + " - Test Case FAILED", ExtentColor.RED));
		ExtentReportManager.extentTest.get().fail("Click on the log below to expand...");
		ExtentReportManager.extentTest.get().log(Status.FAIL, result.getThrowable());

		String screenshotpath = null;
		try {
			screenshotpath = ExtentReportManager.takeScreenshot(BaseTestCase.driver, methodName);
		} catch (IOException e) {
			e.printStackTrace();
		}

		ExtentReportManager.extentTest.get().fail("Test Case Failed. Click below screenshot to view.");
		try {
			ExtentReportManager.extentTest.get().addScreenCaptureFromPath(screenshotpath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		ExtentReportManager.extentTest.get().log(Status.SKIP, MarkupHelper
				.createLabel(result.getMethod().getMethodName() + " Test Case SKIPPED", ExtentColor.ORANGE));
		
	}


	@Override
	public void onStart(ITestContext context) {
		
		ExtentReportManager.extentReport = ExtentReportManager.createReport();
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		if (ExtentReportManager.extentReport != null) {
			ExtentReportManager.extentReport.flush();
		}
		
	}
	
	
}
