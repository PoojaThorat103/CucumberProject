package com.demo.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.action.BaseClass;

public class RegistrationLocator extends BaseClass {

	public RegistrationLocator() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/span/div/div[1]")
	public WebElement formMenu;
	
	@FindBy(xpath = "//span[contains(text(),'Practice Form')]")
	public WebElement practiceFormMenu;
	
	@FindBy(xpath = "//input[@id = 'userName']")
	public WebElement FirstaNameTextBox;
	
	@FindBy(xpath = "//input[@id = 'userEmail']")
	public WebElement emailTextBox;
	
	@FindBy(xpath = "//input[contains(@id,'userNumber')]")
	public WebElement MobileNumberTextBox;
	
	@FindBy (xpath = "//button[contains(@id,'submit')]")
	public WebElement SubmitButton;
	
	@FindBy (xpath ="//input[@id='lastName']")
	public WebElement LastNameTextBox;
	
	@FindBy(xpath = "//label[contains(text(),'Female')]")
	public WebElement GenderRadioButton;
	
	@FindBy(xpath = "//div[contains(text(),'Thanks for submitting the form')]")
	public WebElement submittingFormSuccessfully;
	
	@FindBy(xpath = "//*[@id=\"subjectsContainer\"]/div/div[1]")
	public WebElement subjectTextBox;
	
}

