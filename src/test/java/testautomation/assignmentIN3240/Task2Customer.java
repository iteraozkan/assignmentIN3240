package testautomation.assignmentIN3240;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import testautomation.assignmentIN3240.ScreenShots;

import org.testng.annotations.BeforeClass;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;


public class Task2Customer {
	WebDriver driver;
	private static ExtentReports report;
	private static ExtentTest test;

	@BeforeClass
	public void beforeClass() {
		report = new ExtentReports("C:\\Reports\\IN3240\\Task2.html");
		test = report.startTest("Task 2");
		driver = new ChromeDriver();
		test.log(LogStatus.INFO, "Browser started");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/");
		
		
	}

	@Test(priority = 1, description = "Login with valid user")
	public void login() {
		
		/**
	     * fill in the code to complete the test method
	     * Call login method from LoginWebElement.java
	    */
		
	}
	
	@Test(priority = 2, description = "Create customer")
	public void create() {
		
		/**
	     * fill in the code to complete the test method
	     * Call create method from CsutomerWebElement.java
	    */		
		
	}
	
	@Test(priority = 3, description = "Update customer")
	public void update() {

		/**
	     * fill in the code to complete the test method
	     * Call update method from CsutomerWebElement.java
	    */	
		
	}
	
	@Test(priority = 4, description = "Delete customer")
	public void delete() {
		/**
	     * fill in the code to complete the test method
	     * Call delete method from CsutomerWebElement.java
	    */	
		
}
	
	
	@AfterMethod
	public void tearDown(ITestResult testResult) throws IOException {
		if (testResult.getStatus() == ITestResult.FAILURE) {
			String path = ScreenShots.takeScreenshot(driver, testResult.getName());
			String imagePath = test.addScreenCapture(path);
			test.log(LogStatus.FAIL, "TASK 2 - FAILED", imagePath);
		}
	}

	@AfterMethod
	public void Summary(ITestResult summary) throws IOException {
		if (summary.getStatus() == ITestResult.SUCCESS) {
			String path = ScreenShots.takeScreenshot(driver, summary.getName());
			String imagePath = test.addScreenCapture(path);
			test.log(LogStatus.PASS, "TASK 2 - PASSED", imagePath);
		}
	}

	@AfterClass
	public void endTest() {
		driver.close(); //Close browser
		report.flush(); // Appends the HTML file with all the ended tests.
		
	}

}
