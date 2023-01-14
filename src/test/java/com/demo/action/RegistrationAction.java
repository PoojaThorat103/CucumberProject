package com.demo.action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import com.cucumber.listener.Reporter;
import com.demo.locator.RegistrationLocator;

public class RegistrationAction extends Wrapper {
	
	RegistrationLocator registrationLocator = new RegistrationLocator();	
	public RegistrationAction() {
	registrationLocator = new RegistrationLocator();}
	
	public void clickOnPracticeForm() throws InterruptedException {		
		userClick(registrationLocator.formMenu);	
		ScrollDownVertical(registrationLocator.practiceFormMenu);
		Thread.sleep(1000);
		userClick(registrationLocator.practiceFormMenu);
	}

	public void FillForm() {
		//loginLocators.passwordTextBox.sendKeys("test");
		userType(registrationLocator.FirstaNameTextBox, "poooja");
		userType(registrationLocator.emailTextBox, "pooja@test.com");
		userType(registrationLocator.MobileNumberTextBox, "9898767610");
		userType(registrationLocator.LastNameTextBox,"T");
		userClick(registrationLocator.GenderRadioButton);
		userType(registrationLocator.subjectTextBox,"Testing");
		
	}
	
	public void submitForm() {
		//scroll down page
		ScrollDownVertical(registrationLocator.SubmitButton);
		userClick(registrationLocator.SubmitButton);
		
		boolean s= driver.findElement(By.id("txt-bx")).isDisplayed();
		boolean submittingForm =(registrationLocator.submittingFormSuccessfully).isDisplayed();
		if(submittingForm ==true)
		{
			System.out.println("User has successfully submitted the form");
		}
	}
	
	
}
