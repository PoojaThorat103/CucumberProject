package com.demo.action;

import com.cucumber.listener.Reporter;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;


public class Wrapper extends BaseClass{
	Logger logger = LogManager.getLogger(Wrapper.class);
	
	//--------------------ClickON Element ----------------------------------
	public void userClick(WebElement we) {
		try{
			if(isElementDisplayed(we)){
				we.click();
				logger.info("Uset Has clicked on Element " +we);
			
			}
		}catch(Exception e){
			verifyTest("failing wait for Element for "+ e.getMessage(), false );
		}
	}
	//--------------------UserType/sendkeys ----------------------------------
	public void userType(WebElement we, String text) {
		try {
			if (isElementDisplayed(we)) {
				we.sendKeys(text);
				printLog("user has entered value "+text);
			}
			else{
				logger.info("User not able to pass value" + we);
				Assert.assertTrue("user has not entered the value", false);
			}
		}
		catch(Exception e){
			System.out.println("Exception in Type WebElement "+ we);
			e.printStackTrace();
		}
	}
//--------------------Display----------------------------------
	public boolean isElementDisplayed(WebElement we) {
		boolean isDisplayed = false;
		try{
			waitForElement(we);
			we.isDisplayed();
			Reporter.addStepLog("Element is displayed");
			logger.info("Element is displayed");
			return true;
		}catch(Exception e){
			Reporter.addStepLog("Element Not displayed "+ we);
			logger.info("Element Not displayed "+ we);
			return false;
		}
	}
	//--------------------waitForElement----------------------------------
	public void waitForElement(WebElement we) throws IOException {
		try{
			WebDriverWait wait = new WebDriverWait(driver,10);
			WebElement web = wait.until(ExpectedConditions.visibilityOf(we));
		}catch(Exception e){
			verifyTest("failing wait for Element for "+ e.getMessage(), false );
		}
	}
	//--------------------Screenshot----------------------------------
	public String takeScreenshot() throws IOException {
		String path = System.getProperty("user.dir") + "\\screenshots\\test.png";
		File screenshotFile  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile,new File(path));
		return path;
	}

	public void addScreenshotInReport( String title){
		try{
			String path = takeScreenshot();
			//Reporter.addScreenCaptureFromPath(path, title);
			Reporter.addScreenCaptureFromPath(path);
		}catch(Exception e){

		}
	}
	//--------------------select from drop down ----------------------------------
	public void selectByVisibleText(WebElement we, String text){
		try{
			waitForElement(we);
			Select select = new Select(we);// put wait
			select.selectByVisibleText(text);
			Reporter.addStepLog("Value is selected from dropdown");
		}
		catch(Exception e ){
			verifyTest("user has not selected value from dropdown" + e.getMessage(), false);
		}
	}

	public void AutosuggestionDropDown(){

	}
	//--------------------Verify Method ----------------------------------
	public void verifyTest(String message, boolean isDisplayed) {
		try{
			if(!isDisplayed){
				addScreenshotInReport(message);
			}
			logger.info("Element Display Status: " +isDisplayed);
			Assert.assertTrue(message, isDisplayed);
		}catch(Exception e){
			System.out.println("--------"+e.getMessage());
		}
	}

	public void verifyTest(String message, String expected, String actual) {
		printLog(message + " -- Expeccted  "+ expected +" -- Actual -- "+ actual);
		Assert.assertEquals(message, expected, actual);
		}
	//--------------------scroll ----------------------------------
	public void ScrollDownVertical(WebElement we) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", we);
		//js.executeScript("arguments[0].scrollIntoViewIfNeeded(true);", we);
	}

	public void printLog(String message){
		Reporter.addStepLog(message);
		logger.info(message);
	}



}
