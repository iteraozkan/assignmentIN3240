package testautomation.assignmentIN3240;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class CustomerWebElement {
	WebDriver driver;
	
	
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	WebElement createNewBtn; 
	
	
	//Static initElement method of PageFactory class for initializing WebElement
	public CustomerWebElement(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
		
	public void create() {
		/**
	     * fill in the code to complete the method
	    */
	
	}
	
	public void findCustomer() {
		/**
	     * fill in the code to complete the method
	    */
		
	}
	
	public void update() {
		/**
	     * fill in the code to complete the method
	    */
		
	}
	
	public void delete() {
		/**
	     * fill in the code to complete the method
	    */
		
	}
	
	
	
	
	
}
